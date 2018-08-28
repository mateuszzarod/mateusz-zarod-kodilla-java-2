package com.kodilla.patterns.builder.pizza;

import org.junit.Assert;
import org.junit.Test;
import sun.misc.ASCIICaseInsensitiveComparator;

public class PizzaTestSuite {
    @Test
    public void testPizzaNew() {
        //Given
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredients("onion")
                .ingredients("olives")
                .bottom("thin")
                .build();
        System.out.println(pizza);
        //When
        int howManyIng = pizza.getIngredients().size();
        //Then
        Assert.assertEquals(2, howManyIng);
        Assert.assertEquals(null, pizza.getSauce());

    }
}