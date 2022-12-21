package com.example.RecipeGeneratorBackEnd;

import com.example.RecipeGeneratorBackEnd.models.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class IngredientTest {

    Ingredient ingredient;

    Recipe recipe;

    Quantity quantity;


    @Before
    public void before() {
        quantity = new Quantity(2.5, "gr", ingredient, recipe);
        recipe = new Recipe("Lentils soup", "Yummy lentils soup", 2, 5.0, DietType.VEGETARIAN, CuisineType.SPANISH, MealType.DINNER);
        ingredient = new Ingredient("Paprika");

    }

    @Test
    public void ingredientHasName() {
        assertEquals("Paprika", ingredient.getName());
    }



}
