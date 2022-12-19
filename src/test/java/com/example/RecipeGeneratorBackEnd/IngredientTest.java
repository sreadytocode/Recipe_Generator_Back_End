package com.example.RecipeGeneratorBackEnd;

import com.example.RecipeGeneratorBackEnd.models.Ingredient;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IngredientTest {

    Ingredient ingredient;


    @Before
    public void before() {
        ingredient = new Ingredient("Paprika","gr", 2.5);
    }

    @Test
    public void ingredientHasName() {
        assertEquals("Paprika", ingredient.getName());
    }


}
