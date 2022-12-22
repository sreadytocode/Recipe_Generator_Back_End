package com.example.RecipeGeneratorBackEnd.controllers;

import com.example.RecipeGeneratorBackEnd.models.Recipe;
import com.example.RecipeGeneratorBackEnd.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class RecipesController {

    @Autowired
    RecipeRepository recipeRepository;

    //INDEX
    @GetMapping(value = "/recipes")
    public ResponseEntity<List<Recipe>> getAllRecipes() {
        return new ResponseEntity<>(recipeRepository.findAll(), HttpStatus.OK);
    }

    //SHOW
    @GetMapping(value = "/recipes/{id}" )
    public ResponseEntity getRecipe(@PathVariable Long id) {
        return new ResponseEntity<>(recipeRepository.findById(id), HttpStatus.OK);
    }

    //CREATE
    @PostMapping(value = "/recipes")
    public ResponseEntity<Recipe> postRecipe(@RequestBody Recipe recipe) {
        recipeRepository.save(recipe);
        return new ResponseEntity<>(recipe, HttpStatus.CREATED);
    }

    //UPDATE
    @PutMapping(value = "/recipes/{id}")
    public ResponseEntity<Recipe> putRecipe(@RequestBody Recipe recipe, @PathVariable Long id) {
     Recipe recipeToUpdate = recipeRepository.findById(id).get();
     recipeToUpdate.setName(recipe.getName());
     recipeToUpdate.setImage(recipe.getImage());
     recipeToUpdate.setDescription(recipe.getDescription());
     recipeToUpdate.setServing(recipe.getServing());
     recipeToUpdate.setRating(recipe.getRating());
     recipeToUpdate.setDietType(recipe.getDietType());
     recipeToUpdate.setCuisineType(recipe.getCuisineType());
     recipeToUpdate.setMealType(recipe.getMealType());
     recipeToUpdate.setQuantities(recipe.getQuantities());
     recipeToUpdate.setInstructions(recipe.getInstructions());
     return new ResponseEntity<>(recipeToUpdate, HttpStatus.OK);
    }

    //DELETE
    @DeleteMapping(value = "/recipes/{id}")
    public ResponseEntity<Long> deleteRecipe(@PathVariable Long id) {
        recipeRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

}
