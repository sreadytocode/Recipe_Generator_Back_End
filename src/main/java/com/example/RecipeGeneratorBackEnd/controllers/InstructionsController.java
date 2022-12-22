package com.example.RecipeGeneratorBackEnd.controllers;

import com.example.RecipeGeneratorBackEnd.models.Instruction;
import com.example.RecipeGeneratorBackEnd.repositories.InstructionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class InstructionsController {

    @Autowired
    InstructionRepository instructionRepository;

    @GetMapping(value = "/instructions")
    public ResponseEntity<List<Instruction>> getAllInstructions() {
        return new ResponseEntity<>(instructionRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/instructions/{id}")
    public ResponseEntity getInstruction(@PathVariable Long id) {
        return new ResponseEntity<>(instructionRepository.findById(id), HttpStatus.OK);
    }
}
