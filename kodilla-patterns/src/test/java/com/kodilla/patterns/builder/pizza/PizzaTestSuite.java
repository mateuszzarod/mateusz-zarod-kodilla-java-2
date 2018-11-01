package com.kodilla.patterns.builder.pizza;

import org.junit.Assert;
import org.junit.Test;
import sun.misc.ASCIICaseInsensitiveComparator;

public class PizzaTestSuite {
    @Test
    public void testPizzaNew() {
        //Given
        Pizza pizza = new Pizza.PizzaBuilder()
                .bottom("thin")
                .sauce("red")
                .ingredients("salami")
                .ingredients("corn")
                .build();
        System.out.println(pizza);
        //When
        int ing = pizza.getIngredients().size();
        //Then
        Assert.assertEquals(2, ing);
    }
}