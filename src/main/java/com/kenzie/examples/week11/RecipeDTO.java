package com.kenzie.examples.week11;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public abstract class RecipeDTO {


    @JsonProperty("nutrition")
    private Nutrition nutrition;
    @JsonProperty("imageType")
    private String imagetype;
    @JsonProperty("image")
    private String image;
    @JsonProperty("title")
    private String title;
    @JsonProperty("id")
    private int id;

    public Nutrition getNutrition() {
        return nutrition;
    }

    public void setNutrition(Nutrition nutrition) {
        this.nutrition = nutrition;
    }

    public String getImagetype() {
        return imagetype;
    }

    public void setImagetype(String imagetype) {
        this.imagetype = imagetype;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static class Nutrition {
        @JsonProperty("nutrients")
        private List<Nutrients> nutrients;

        public List<Nutrients> getNutrients() {
            return nutrients;
        }

        public void setNutrients(List<Nutrients> nutrients) {
            this.nutrients = nutrients;
        }
    }

    public static class Nutrients {
        @JsonProperty("unit")
        private String unit;
        @JsonProperty("amount")
        private double amount;
        @JsonProperty("name")
        private String name;

        public String getUnit() {
            return unit;
        }

        public void setUnit(String unit) {
            this.unit = unit;
        }

        public double getAmount() {
            return amount;
        }

        public void setAmount(double amount) {
            this.amount = amount;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
