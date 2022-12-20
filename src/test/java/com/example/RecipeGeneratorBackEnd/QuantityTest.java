package com.example.RecipeGeneratorBackEnd;

import com.example.RecipeGeneratorBackEnd.models.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuantityTest {

    Quantity quantity;

    Recipe recipe;

    Ingredient ingredient;

    @Before
    public void before() {
        recipe = new Recipe("Lentils soup", "Yummy lentils soup", 2, 5.0, DietType.VEGETARIAN, CuisineType.SPANISH, MealType.DINNER);
        ingredient = new Ingredient("Paprika","gr", 2.5);
        quantity = new Quantity(2.5, "gr", ingredient, recipe);
    }

    @Test
    public void quantityHasAmount() {
        assertEquals(2.5, quantity.getAmount(), 0);
    }

    @Test
    public void quantityHasUnit() {
        assertEquals("gr", quantity.getUnit());
    }

    @Test
    public void quantityHasIngredient() {
        assertEquals(ingredient, quantity.getIngredient());
    }

    @Test
    public void quantityHasRecipe() {
        assertEquals(recipe, quantity.getRecipe());
    }

}
