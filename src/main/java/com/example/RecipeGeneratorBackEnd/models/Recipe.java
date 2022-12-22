package com.example.RecipeGeneratorBackEnd.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column(columnDefinition = "LONGTEXT")
    private String description;

    @Column
    private int serving;

    @Column
    private double rating;

    DietType dietType;
    CuisineType cuisineType;
    MealType mealType;

    @JsonIgnoreProperties({"recipe"})
    @OneToMany(mappedBy = "recipe", fetch = FetchType.LAZY)
    private List<Quantity> quantities;

    @OneToMany(mappedBy = "recipe", fetch = FetchType.LAZY)
    private List<Instruction> instructions;


    public Recipe(String name, String description, int serving, double rating,
                  DietType dietType, CuisineType cuisineType, MealType mealType) {
        this.name = name;
        this.description = description;
        this.serving = serving;
        this.rating = rating;
        this.dietType = dietType;
        this.cuisineType = cuisineType;
        this.mealType = mealType;
        this.quantities = new ArrayList<>();
        this.instructions = new ArrayList<>();
    }

    public Recipe () {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getServing() {
        return serving;
    }

    public void setServing(int serving) {
        this.serving = serving;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public DietType getDietType() {
        return dietType;
    }

    public void setDietType(DietType dietType) {
        this.dietType = dietType;
    }

    public CuisineType getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(CuisineType cuisineType) {
        this.cuisineType = cuisineType;
    }

    public MealType getMealType() {
        return mealType;
    }

    public void setMealType(MealType mealType) {
        this.mealType = mealType;
    }

    public List<Quantity> getQuantities() {
        return quantities;
    }

    public void setQuantities(List<Quantity> quantities) {
        this.quantities = quantities;
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<Instruction> instructions) {
        this.instructions = instructions;
    }
}
