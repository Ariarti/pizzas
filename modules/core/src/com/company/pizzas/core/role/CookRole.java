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

@Role(name = CookRole.NAME)
public class CookRole extends AnnotatedRoleDefinition {
    public final static String NAME = "Cook";

    @ScreenAccess(screenIds = {"pizzas_Pizza.browse", "application-pizzas", "pizzas_Topping.browse", "pizzas_Ingredient.browse", "pizzas_OrderItem.browse", "pizzas_Order.browse"})
    @Override
    public ScreenPermissionsContainer screenPermissions() {
        return super.screenPermissions();
    }

    @EntityAccess(entityClass = Order.class, operations = {EntityOp.READ, EntityOp.UPDATE})
    @EntityAccess(entityClass = OrderItem.class, operations = EntityOp.READ)
    @EntityAccess(entityClass = Topping.class, operations = {EntityOp.CREATE, EntityOp.UPDATE, EntityOp.READ, EntityOp.DELETE})
    @EntityAccess(entityClass = Pizza.class, operations = {EntityOp.CREATE, EntityOp.UPDATE, EntityOp.READ, EntityOp.DELETE})
    @EntityAccess(entityClass = Ingredient.class, operations = {EntityOp.CREATE, EntityOp.UPDATE, EntityOp.READ, EntityOp.DELETE})
    @Override
    public EntityPermissionsContainer entityPermissions() {
        return super.entityPermissions();
    }

    @EntityAttributeAccess(entityClass = Order.class, modify = "status", view = {"number", "createDate", "items"})
    @EntityAttributeAccess(entityClass = OrderItem.class, view = "*")
    @EntityAttributeAccess(entityClass = Topping.class, modify = "*")
    @EntityAttributeAccess(entityClass = Pizza.class, modify = "*")
    @EntityAttributeAccess(entityClass = Ingredient.class, modify = "*")
    @Override
    public EntityAttributePermissionsContainer entityAttributePermissions() {
        return super.entityAttributePermissions();
    }
}
