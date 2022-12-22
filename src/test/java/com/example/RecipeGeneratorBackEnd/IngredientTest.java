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
        recipe = new Recipe("Lentils soup","https://images.immediate.co.uk/production/volatile/sites/30/2020/08/lentil_soup-c6fa61c.jpg?quality=90&webp=true&resize=440,400","Yummy lentils soup", 2, 5.0, DietType.VEGETARIAN, CuisineType.SPANISH, MealType.DINNER);
        ingredient = new Ingredient("Paprika");

    }

    @Test
    public void ingredientHasName() {
        assertEquals("Paprika", ingredient.getName());
    }



}
