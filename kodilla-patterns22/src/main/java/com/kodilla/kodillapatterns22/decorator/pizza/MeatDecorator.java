package com.kodilla.kodillapatterns22.decorator.pizza;


import java.math.BigDecimal;

public class MeatDecorator extends AbstractPizzaOrderDecorator {

    public MeatDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(6));
    }

    @Override
    public String getIngredient() {
        return super.getIngredient() + ", ham, becon, tomato, pieces of chicken";
    }
}
