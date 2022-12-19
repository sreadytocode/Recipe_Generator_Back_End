package com.example.RecipeGeneratorBackEnd;

import com.example.RecipeGeneratorBackEnd.models.Instruction;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstructionTest {

    Instruction instruction;

    @Before
    public void before(){
        instruction = new Instruction(1, "Pre-heat the oven.200c.");
    }

    @Test
    public void InstructionHasStep(){
        assertEquals(1, instruction.getStep());
    }

    @Test
    public void InstructionHasDescription() {
        assertEquals("Pre-heat the oven.200c.", instruction.getDescription());
    }

}
