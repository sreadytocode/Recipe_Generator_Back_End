package com.example.RecipeGeneratorBackEnd;

import com.example.RecipeGeneratorBackEnd.models.*;
import jakarta.persistence.Table;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecipeTest {
    Recipe recipe;

    Instruction instruction;

    Ingredient ingredient;

    @Before
    public void before(){
        instruction = new Instruction(1, "Pre-heat the oven.200c.", recipe);
        ingredient = new Ingredient("Paprika");
        recipe = new Recipe("Lentils soup", "Yummy lentils soup", 2, 5.0, DietType.VEGETARIAN, CuisineType.SPANISH, MealType.DINNER);
    }

    @Test
    public void hasName(){
        assertEquals("Lentils soup", recipe.getRecipeName());
    }

    @Test
    public void hasDescription(){
        assertEquals("Yummy lentils soup", recipe.getRecipeDescription());
    }

    @Test
    public void hasServing(){
        assertEquals(2, recipe.getServing());
    }

    @Test
    public void hasRating(){
        assertEquals(5.0, recipe.getRating(), 0.0);
    }

    @Test
    public void hasDietType(){
        assertEquals(DietType.VEGETARIAN, recipe.getDietType());
    }

    @Test
    public void hasCuisineType(){
        assertEquals(CuisineType.SPANISH, recipe.getCuisineType());
    }

    @Test
    public void hasMealType(){
        assertEquals(MealType.DINNER, recipe.getMealType());
    }


}
