package com.example.RecipeGeneratorBackEnd.controllers;

import com.example.RecipeGeneratorBackEnd.models.Quantity;
import com.example.RecipeGeneratorBackEnd.repositories.QuantityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuantitiesController {

    @Autowired
    QuantityRepository quantityRepository;

    //INDEX
    @GetMapping(value = "/quantities")
    public ResponseEntity<List<Quantity>> getAllQuantities(@RequestParam(name = "recipeName", required = false) String recipeName,
                                                           @RequestParam(name = "ingredientName", required=false) String ingredientName) {
//        if (ingredientName != null) {
//            List<Quantity> quantities = quantityRepository.findByIngredientNameIgnoreCase(ingredientName);
//            return new ResponseEntity<>(quantities, HttpStatus.OK);
//        }
        if (ingredientName != null && recipeName != null) {
            List<Quantity> quantities = quantityRepository.findByRecipeRecipeNameIgnoreCaseAndIngredientNameIgnoreCase(recipeName, ingredientName);
            return new ResponseEntity<>(quantities, HttpStatus.OK);
        }
        return new ResponseEntity<>(quantityRepository.findAll(), HttpStatus.OK);
    }

//    @GetMapping(value = "/quantities")
//    public ResponseEntity<List<Quantity>> getAllQuantities(@RequestParam(name = "ingredientName", required=false) String ingredientName) {
//        if (ingredientName != null) {
//            List<Quantity> quantities = quantityRepository.findByIngredientNameIgnoreCase(ingredientName);
//            return new ResponseEntity<>(quantities, HttpStatus.OK);
//        }
//        return new ResponseEntity<>(quantityRepository.findAll(), HttpStatus.OK);
//    }

    //SHOW
    @GetMapping(value = "/quantities/{id}")
    public ResponseEntity getQuantities(@PathVariable Long id) {
        return new ResponseEntity<>(quantityRepository.findById(id), HttpStatus.OK);
    }

    //CREATE
    @PostMapping(value = "/quantities")
    public ResponseEntity<Quantity> postQuantity(@RequestBody Quantity quantity) {
        quantityRepository.save(quantity);
        return new ResponseEntity<>(quantity, HttpStatus.CREATED);
    }

    //UPDATE
    @PutMapping(value = "quantities/{id}")
    public ResponseEntity<Quantity> putQuantity(@RequestBody Quantity quantity, @PathVariable Long id) {
        Quantity quantityToUpdate = quantityRepository.findById(id).get();
        quantityToUpdate.setAmount(quantity.getAmount());
        quantityToUpdate.setUnit(quantity.getUnit());
        quantityToUpdate.setIngredient(quantity.getIngredient());
        quantityToUpdate.setRecipe(quantity.getRecipe());
        return new ResponseEntity<>(quantityToUpdate, HttpStatus.OK);
    }

    //DELETE
    @DeleteMapping(value = "/quantities/{id}")
    public ResponseEntity<Long> deleteQuantity(@PathVariable Long id) {
        quantityRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }


}
