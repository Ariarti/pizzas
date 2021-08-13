package com.company.pizzas.web.screens.topping;

import com.haulmont.cuba.gui.screen.*;
import com.company.pizzas.entity.Topping;

@UiController("pizzas_Topping.edit")
@UiDescriptor("topping-edit.xml")
@EditedEntityContainer("toppingDc")
@LoadDataBeforeShow
public class ToppingEdit extends StandardEditor<Topping> {
}