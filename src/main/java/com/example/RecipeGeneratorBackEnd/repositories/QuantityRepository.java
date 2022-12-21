package com.example.RecipeGeneratorBackEnd.repositories;


import com.example.RecipeGeneratorBackEnd.models.Quantity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuantityRepository extends JpaRepository<Quantity, Long> {

}
