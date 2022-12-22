package com.example.RecipeGeneratorBackEnd.controllers;

import com.example.RecipeGeneratorBackEnd.models.Ingredient;
import com.example.RecipeGeneratorBackEnd.repositories.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IngredientsController {

    @Autowired
    IngredientRepository ingredientRepository;

    @GetMapping(value ="/ingredients")
    public ResponseEntity<List<Ingredient>> getAllIngredients() {
        return new ResponseEntity<>(ingredientRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "ingredients/{id}")
    public ResponseEntity getIngredient(@PathVariable Long id) {
        return new ResponseEntity<>(ingredientRepository.findById(id), HttpStatus.OK);
    }


}
