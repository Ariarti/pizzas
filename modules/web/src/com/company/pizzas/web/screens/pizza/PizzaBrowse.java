package com.company.pizzas.web.screens.pizza;

import com.haulmont.cuba.gui.screen.*;
import com.company.pizzas.entity.Pizza;

@UiController("pizzas_Pizza.browse")
@UiDescriptor("pizza-browse.xml")
@LookupComponent("pizzasTable")
@LoadDataBeforeShow
public class PizzaBrowse extends StandardLookup<Pizza> {
}