package com.example.RecipeGeneratorBackEnd;

import com.example.RecipeGeneratorBackEnd.models.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstructionTest {

    Instruction instruction;

    Recipe recipe;

    @Before
    public void before(){
        recipe = new Recipe("Lentils soup", "Yummy lentils soup", 2, 5.0, DietType.VEGETARIAN, CuisineType.SPANISH, MealType.DINNER);
        instruction = new Instruction(1, "Pre-heat the oven.200c.", recipe);
    }

    @Test
    public void InstructionHasStep(){
        assertEquals(1, instruction.getStep());
    }

    @Test
    public void InstructionHasDescription() {
        assertEquals("Pre-heat the oven.200c.", instruction.getDescription());
    }

    @Test
    public void InstructionHasRecipe() {
        assertEquals(recipe, instruction.getRecipe());
    }

}
