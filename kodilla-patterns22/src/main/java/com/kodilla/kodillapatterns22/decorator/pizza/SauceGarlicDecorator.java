package com.kodilla.kodillapatterns22.decorator.pizza;

import java.math.BigDecimal;

public class SauceGarlicDecorator extends AbstractPizzaOrderDecorator {

    public SauceGarlicDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(1));
    }

    @Override
    public String getIngredient() {
        return super.getIngredient() + ", garlic sauce";
    }
}