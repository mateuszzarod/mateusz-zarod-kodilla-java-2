package com.kodilla.kodillapatterns22.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(15.0);
    }

    @Override
    public String getIngredient() {
        return "Ingredients for pizza: crust with tomato sos, cheese";
    }
}