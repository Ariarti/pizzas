package com.company.pizzas.web.screens.pizza;

import com.haulmont.cuba.gui.screen.*;
import com.company.pizzas.entity.Pizza;

@UiController("pizzas_Pizza.edit")
@UiDescriptor("pizza-edit.xml")
@EditedEntityContainer("pizzaDc")
@LoadDataBeforeShow
public class PizzaEdit extends StandardEditor<Pizza> {
}