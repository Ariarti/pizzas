package com.company.pizzas.core.group;

import com.company.pizzas.entity.Order;
import com.haulmont.cuba.security.app.group.AnnotatedAccessGroupDefinition;
import com.haulmont.cuba.security.app.group.annotation.AccessGroup;
import com.haulmont.cuba.security.app.group.annotation.JpqlConstraint;
import com.haulmont.cuba.security.group.ConstraintsContainer;

@AccessGroup(name = CourierGroup.GROUP_NAME)
public class CourierGroup extends AnnotatedAccessGroupDefinition {
    public static final String GROUP_NAME = "CourierGroup";

    @JpqlConstraint(target = Order.class, where = "{E}.order.delivery.courier.id = :session$userId")
    @Override
    public ConstraintsContainer accessConstraints() {
        return super.accessConstraints();
    }
}
