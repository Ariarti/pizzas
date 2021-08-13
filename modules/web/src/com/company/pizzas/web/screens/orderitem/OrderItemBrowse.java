package com.company.pizzas.web.screens.orderitem;

import com.haulmont.cuba.gui.screen.*;
import com.company.pizzas.entity.OrderItem;

@UiController("pizzas_OrderItem.browse")
@UiDescriptor("order-item-browse.xml")
@LookupComponent("orderItemsTable")
@LoadDataBeforeShow
public class OrderItemBrowse extends StandardLookup<OrderItem> {
}