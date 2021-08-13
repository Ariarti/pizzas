package com.company.pizzas.web.screens.ingredient;

import com.haulmont.cuba.gui.screen.*;
import com.company.pizzas.entity.Ingredient;

@UiController("pizzas_Ingredient.edit")
@UiDescriptor("ingredient-edit.xml")
@EditedEntityContainer("ingredientDc")
@LoadDataBeforeShow
public class IngredientEdit extends StandardEditor<Ingredient> {
}