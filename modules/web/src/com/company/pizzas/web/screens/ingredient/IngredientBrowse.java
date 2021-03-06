package com.company.pizzas.web.screens.ingredient;

import com.haulmont.cuba.gui.screen.*;
import com.company.pizzas.entity.Ingredient;

@UiController("pizzas_Ingredient.browse")
@UiDescriptor("ingredient-browse.xml")
@LookupComponent("ingredientsTable")
@LoadDataBeforeShow
public class IngredientBrowse extends StandardLookup<Ingredient> {
}