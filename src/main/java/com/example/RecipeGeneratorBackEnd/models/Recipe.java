package com.example.RecipeGeneratorBackEnd.models;

import jakarta.persistence.*;

@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "recipeName")
    private String recipeName;

    @Column(name = "recipeDescription")
    private String recipeDescription;

    @Column(name = "serving")
    private int serving;

    @Column(name = "rating")
    private double rating;

    DietType dietType;
    CuisineType cuisineType;
    MealType mealType;
    public Recipe(String recipeName, String recipeDescription, int serving, double rating,
            DietType dietType, CuisineType cuisineType, MealType mealType) {
        this.recipeName = recipeName;
        this.recipeDescription = recipeDescription;
        this.serving = serving;
        this.rating = rating;
        this.dietType = dietType;
        this.cuisineType = cuisineType;
        this.mealType = mealType;
    }


}
