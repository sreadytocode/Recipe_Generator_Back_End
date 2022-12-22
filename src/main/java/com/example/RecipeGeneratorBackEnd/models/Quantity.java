package com.example.RecipeGeneratorBackEnd.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "quantities")
public class Quantity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount")
    private double amount;

    @Column(name = "unit")
    private String unit;

    @JsonIgnoreProperties({"quantities"})
    @ManyToOne
    @JoinColumn(name = "ingredient_id", nullable = false)
    private Ingredient ingredient;

    @JsonIgnoreProperties({"quantities"})
    @ManyToOne
    @JoinColumn(name = "recipe_id", nullable = false)
    private Recipe recipe;


    public Quantity(double amount, String unit, Ingredient ingredient, Recipe recipe) {
        this.amount = amount;
        this.unit = unit;
        this.ingredient = ingredient;
        this.recipe = recipe;
    }

    public Quantity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
