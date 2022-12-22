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
        recipe = new Recipe("Lentils soup", "https://images.immediate.co.uk/production/volatile/sites/30/2020/08/lentil_soup-c6fa61c.jpg?quality=90&webp=true&resize=440,400","Yummy lentils soup", 2, 5.0, DietType.VEGETARIAN, CuisineType.SPANISH, MealType.DINNER);
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
