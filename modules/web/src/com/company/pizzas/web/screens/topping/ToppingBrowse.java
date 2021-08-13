package com.company.pizzas.web.screens.topping;

import com.haulmont.cuba.gui.screen.*;
import com.company.pizzas.entity.Topping;

@UiController("pizzas_Topping.browse")
@UiDescriptor("topping-browse.xml")
@LookupComponent("toppingsTable")
@LoadDataBeforeShow
public class ToppingBrowse extends StandardLookup<Topping> {
}