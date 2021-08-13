package com.company.pizzas.web.screens.orderitem;

import com.haulmont.cuba.gui.screen.*;
import com.company.pizzas.entity.OrderItem;

@UiController("pizzas_OrderItem.edit")
@UiDescriptor("order-item-edit.xml")
@EditedEntityContainer("orderItemDc")
@LoadDataBeforeShow
public class OrderItemEdit extends StandardEditor<OrderItem> {
}