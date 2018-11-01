package com.kodilla.kodillapatterns22.decorator.pizza;

import java.math.BigDecimal;

public interface PizzaOrder {
    BigDecimal getCost();

    String getIngredient();
}
