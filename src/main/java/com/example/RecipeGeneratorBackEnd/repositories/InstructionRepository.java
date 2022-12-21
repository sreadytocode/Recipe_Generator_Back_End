package com.example.RecipeGeneratorBackEnd.repositories;


import com.example.RecipeGeneratorBackEnd.models.Instruction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructionRepository extends JpaRepository<Instruction, Long> {

}
