package com.example.RecipeGeneratorBackEnd;

import com.example.RecipeGeneratorBackEnd.models.Ingredient;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class IngredientTest {
    @Autowired
    Ingredient ingredient;


    @Before
    public void before() {
        ingredient = new Ingredient("Paprika","gr", 2.5);
    }

    @Test
    public void ingredientHasName() {
        assertEquals("Paprika", ingredient.getName());
    }

    @Test
    public void ingredientHasUnit(){
        assertEquals("gr", ingredient.getUnit());
    }

    @Test
    public void ingredientHasValue() {
        assertEquals(2.5, ingredient.getValue(), 0);
    }

}
