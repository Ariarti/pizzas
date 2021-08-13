package com.company.pizzas.web.screens.delivery;

import com.haulmont.cuba.gui.screen.*;
import com.company.pizzas.entity.Delivery;

@UiController("pizzas_Delivery.browse")
@UiDescriptor("delivery-browse.xml")
@LookupComponent("deliveriesTable")
@LoadDataBeforeShow
public class DeliveryBrowse extends StandardLookup<Delivery> {
}