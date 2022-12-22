package com.example.RecipeGeneratorBackEnd.controllers;

import com.example.RecipeGeneratorBackEnd.models.Instruction;
import com.example.RecipeGeneratorBackEnd.repositories.InstructionRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InstructionsController {

    @Autowired
    InstructionRepository instructionRepository;

    //INDEX
    @GetMapping(value = "/instructions")
    public ResponseEntity<List<Instruction>> getAllInstructions() {
        return new ResponseEntity<>(instructionRepository.findAll(), HttpStatus.OK);
    }

    //SHOW
    @GetMapping(value = "/instructions/{id}")
    public ResponseEntity getInstruction(@PathVariable Long id) {
        return new ResponseEntity<>(instructionRepository.findById(id), HttpStatus.OK);
    }

    //CREATE
    @PostMapping(value = "/instructions")
    public ResponseEntity<Instruction> postInstruction(@RequestBody Instruction instruction) {
        instructionRepository.save(instruction);
        return new ResponseEntity<>(instruction, HttpStatus.CREATED);
    }

    //UPDATE
    @PutMapping(value = "instructions/{id}")
    public ResponseEntity<Instruction> putInstruction(@RequestBody Instruction instruction, @PathVariable Long id) {
        Instruction instructionToUpdate = instructionRepository.findById(id).get();
        instructionToUpdate.setStep(instruction.getStep());
        instructionToUpdate.setDescription(instruction.getDescription());
        instructionToUpdate.setRecipe(instruction.getRecipe());
        return new ResponseEntity<>(instructionToUpdate, HttpStatus.OK);
    }

    //DELETE
    @DeleteMapping(value = "/instructions/{id}")
    public ResponseEntity<Long> deleteInstruction(@PathVariable Long id) {
        instructionRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

}
