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
        recipe = new Recipe("Lentils soup", "https://images.immediate.co.uk/production/volatile/sites/30/2020/08/lentil_soup-c6fa61c.jpg?quality=90&webp=true&resize=440,400","Yummy lentils soup", 2, 5.0, DietType.VEGETARIAN, CuisineType.SPANISH, MealType.DINNER);
        ingredient = new Ingredient("Paprika");
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
