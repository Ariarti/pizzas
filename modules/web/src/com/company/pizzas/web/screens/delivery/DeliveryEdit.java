package com.company.pizzas.web.screens.delivery;

import com.haulmont.cuba.gui.screen.*;
import com.company.pizzas.entity.Delivery;

@UiController("pizzas_Delivery.edit")
@UiDescriptor("delivery-edit.xml")
@EditedEntityContainer("deliveryDc")
@LoadDataBeforeShow
public class DeliveryEdit extends StandardEditor<Delivery> {
}