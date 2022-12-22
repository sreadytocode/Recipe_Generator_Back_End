package com.example.RecipeGeneratorBackEnd.repositories;


import com.example.RecipeGeneratorBackEnd.models.Ingredient;
import com.example.RecipeGeneratorBackEnd.models.Quantity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuantityRepository extends JpaRepository<Quantity, Long> {

//    List<Quantity> findByIngredientNameIgnoreCase(String ingredientName);

    List<Quantity> findByRecipeNameIgnoreCaseAndIngredientNameIgnoreCase(String recipeName, String ingredientName);

}
