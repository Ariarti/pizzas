package com.company.pizzas.core.role;

import com.company.pizzas.entity.*;
import com.haulmont.cuba.security.app.role.AnnotatedRoleDefinition;
import com.haulmont.cuba.security.app.role.annotation.EntityAccess;
import com.haulmont.cuba.security.app.role.annotation.EntityAttributeAccess;
import com.haulmont.cuba.security.app.role.annotation.Role;
import com.haulmont.cuba.security.app.role.annotation.ScreenAccess;
import com.haulmont.cuba.security.entity.EntityOp;
import com.haulmont.cuba.security.role.EntityAttributePermissionsContainer;
import com.haulmont.cuba.security.role.EntityPermissionsContainer;
import com.haulmont.cuba.security.role.ScreenPermissionsContainer;

@Role(name = CourierRole.NAME)
public class CourierRole extends AnnotatedRoleDefinition {
    public final static String NAME = "Courier";

    @ScreenAccess(screenIds = {"pizzas_Pizza.browse", "application-pizzas", "pizzas_Topping.browse", "pizzas_Ingredient.browse", "pizzas_Order.browse", "pizzas_OrderItem.browse", "pizzas_Delivery.browse", "pizzas_Client.browse"})
    @Override
    public ScreenPermissionsContainer screenPermissions() {
        return super.screenPermissions();
    }

    @EntityAccess(entityClass = OrderItem.class, operations = EntityOp.READ)
    @EntityAccess(entityClass = Client.class, operations = EntityOp.READ)
    @EntityAccess(entityClass = Delivery.class, operations = EntityOp.READ)
    @EntityAccess(entityClass = Order.class, operations = {EntityOp.READ, EntityOp.UPDATE})
    @EntityAccess(entityClass = Ingredient.class, operations = EntityOp.READ)
    @EntityAccess(entityClass = Topping.class, operations = EntityOp.READ)
    @EntityAccess(entityClass = Pizza.class, operations = EntityOp.READ)
    @Override
    public EntityPermissionsContainer entityPermissions() {
        return super.entityPermissions();
    }

    @EntityAttributeAccess(entityClass = OrderItem.class, view = "*")
    @EntityAttributeAccess(entityClass = Client.class, view = "*")
    @EntityAttributeAccess(entityClass = Delivery.class, view = "*")
    @EntityAttributeAccess(entityClass = Order.class, modify = "status", view = "*")
    @EntityAttributeAccess(entityClass = Ingredient.class, view = "*")
    @EntityAttributeAccess(entityClass = Topping.class, view = "*")
    @EntityAttributeAccess(entityClass = Pizza.class, view = "*")
    @Override
    public EntityAttributePermissionsContainer entityAttributePermissions() {
        return super.entityAttributePermissions();
    }
}
