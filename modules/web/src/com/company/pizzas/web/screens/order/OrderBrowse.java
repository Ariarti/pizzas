package com.company.pizzas.web.screens.order;

import com.haulmont.cuba.gui.screen.*;
import com.company.pizzas.entity.Order;

@UiController("pizzas_Order.browse")
@UiDescriptor("order-browse.xml")
@LookupComponent("ordersTable")
@LoadDataBeforeShow
public class OrderBrowse extends StandardLookup<Order> {
}