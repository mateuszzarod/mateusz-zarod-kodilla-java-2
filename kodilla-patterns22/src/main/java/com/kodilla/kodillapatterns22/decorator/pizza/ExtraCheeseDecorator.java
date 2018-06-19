package com.kodilla.kodillapatterns22.decorator.pizza;

import java.math.BigDecimal;

public class ExtraCheeseDecorator extends AbstractPizzaOrderDecorator{

    public ExtraCheeseDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost () {
        return super.getCost().add(new BigDecimal(4));
    }

    @Override
    public String getIngredient () {
        return super.getIngredient() + ", extra cheese";
    }
}
