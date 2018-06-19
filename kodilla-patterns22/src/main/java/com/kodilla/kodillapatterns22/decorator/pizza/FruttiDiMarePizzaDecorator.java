package com.kodilla.kodillapatterns22.decorator.pizza;

import java.math.BigDecimal;

public class FruttiDiMarePizzaDecorator extends AbstractPizzaOrderDecorator {

    public FruttiDiMarePizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost () {
        return super.getCost().add(new BigDecimal(15));
    }

    @Override
    public String getIngredient () {
        return super.getIngredient() + ", king shrimps, clams, pieces of tuna";
    }
}

