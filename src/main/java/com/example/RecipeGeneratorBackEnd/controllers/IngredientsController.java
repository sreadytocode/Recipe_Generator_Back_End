package com.example.RecipeGeneratorBackEnd.controllers;

import com.example.RecipeGeneratorBackEnd.models.Ingredient;
import com.example.RecipeGeneratorBackEnd.repositories.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class IngredientsController {

    @Autowired
    IngredientRepository ingredientRepository;

    //INDEX
    @GetMapping(value ="/ingredients")
    public ResponseEntity<List<Ingredient>> getAllIngredients() {
        return new ResponseEntity<>(ingredientRepository.findAll(), HttpStatus.OK);
    }

    //SHOW
    @GetMapping(value = "ingredients/{id}")
    public ResponseEntity getIngredient(@PathVariable Long id) {
        return new ResponseEntity<>(ingredientRepository.findById(id), HttpStatus.OK);
    }

    //CREATE
    @PostMapping(value = "/ingredients")
    public ResponseEntity<Ingredient> postIngredient(@RequestBody Ingredient ingredient) {
        ingredientRepository.save(ingredient);
        return new ResponseEntity<>(ingredient, HttpStatus.CREATED);
    }

//    UPDATE
    @PutMapping(value = "/ingredients/{id}")
    public ResponseEntity<Ingredient> putIngredient(@RequestBody Ingredient ingredient, @PathVariable Long id) {
        Ingredient ingredientToUpdate = ingredientRepository.findById(id).get();
        ingredientToUpdate.setName(ingredient.getName());
        ingredientToUpdate.setQuantities(ingredient.getQuantities());
        return new ResponseEntity<>(ingredientToUpdate, HttpStatus.OK);
    }

    //DELETE
    @DeleteMapping(value = "/ingredients/{id}")
    public ResponseEntity<Long> deleteIngredient(@PathVariable Long id) {
        ingredientRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }






}
