package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {

    private final String roll;
    private final int burgerQuantity;
    private final String sauce;
    private  List<String> ingridients = new ArrayList<>();
    //w przykłądach ta lista jest final - intellij nie przepuścił mi tego pola i musiałem usunąć final
    //ale wydaje mi się że w tutorialu był błąd i ta lista musi być bez final

    public static class bigmacBuilder{
        private String roll;
        private int burgerQuantity;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public bigmacBuilder roll(String roll){
            this.roll = roll;
            return this;
        }

        public bigmacBuilder burgerQuantity(int burgerQuantity){
            this.burgerQuantity = burgerQuantity;
            return this;
        }

        public bigmacBuilder sauce(String sauce){
            this.sauce = sauce;
            return this;
        }

        public bigmacBuilder ingredient(String ingredient){
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build(){
            return new Bigmac(roll, burgerQuantity, sauce, ingredients);
        }


    }

    private Bigmac(String roll, int burgerQuantity, String sauce, List<String> ingredients) {
        this.roll = roll;
        this.burgerQuantity = burgerQuantity;
        this.sauce = sauce;
        this.ingridients = ingredients;
    }

    public String getRoll() {
        return roll;
    }

    public int getBurgerQuantity() {
        return burgerQuantity;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngridients() {
        return ingridients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + roll + '\'' +
                ", burgerQuantity=" + burgerQuantity +
                ", sauce='" + sauce + '\'' +
                ", ingridients=" + ingridients +
                '}';
    }
}
