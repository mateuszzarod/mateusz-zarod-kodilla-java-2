package com.kodilla.kodillapatterns22.decorator.pizza;

import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //when
        BigDecimal calculatedCost = pizzaOrder.getCost();
        //then
        assertEquals(new BigDecimal(15.00), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetIngredients() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //when
        String description = pizzaOrder.getIngredient();
        //then
        assertEquals("Ingredients for pizza: crust with tomato sos, cheese", description);
    }

    @Test
    public void testFruttiDiMarePizzaDecoratorGetCost() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        FruttiDiMarePizzaDecorator fruttiDiMarePizzaDecorator = new FruttiDiMarePizzaDecorator(pizzaOrder);

        //when
        BigDecimal calculatedCost = fruttiDiMarePizzaDecorator.getCost();

        //then
        assertEquals(new BigDecimal(30.00), calculatedCost);
    }

    @Test
    public void testFruttiDiMarePizzaDecoratorGetIngredient() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //może być tak
        //FruttiDiMarePizzaDecorator fruttiDiMarePizzaDecorator = new FruttiDiMarePizzaDecorator(pizzaOrder);
        pizzaOrder = new FruttiDiMarePizzaDecorator(pizzaOrder);

        //when
        String description = pizzaOrder.getIngredient();

        //then
        assertEquals("Ingredients for pizza: crust with tomato sos, cheese, king shrimps, clams, pieces of tuna", description);
    }

    @Test
    public void testMeatExtraCheeseGetCost() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //może też być tak:
        //ExtraCheeseDecorator extraCheeseDecorator = new ExtraCheeseDecorator(pizzaOrder);
        //MeatDecorator meatDecorator = new MeatDecorator(extraCheeseDecorator);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new MeatDecorator(pizzaOrder);

        //when
        //BigDecimal calculatedCost = meatDecorator.getCost();
        BigDecimal calculatedCost = pizzaOrder.getCost();

        //then
        assertEquals(new BigDecimal(25.00), calculatedCost);
    }

    @Test
    public void testMeatExtraCheeseGetIngredient() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new MeatDecorator(pizzaOrder);

        //when
        String description = pizzaOrder.getIngredient();

        //then
        assertEquals("Ingredients for pizza: crust with tomato sos, cheese, extra cheese, ham, becon, tomato, pieces of chicken", description);
    }

    @Test
    public void testMeatExtraCheeseSauceGarlicAndHotGetCost() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();

        //może też być tak:
        //ExtraCheeseDecorator extraCheeseDecorator = new ExtraCheeseDecorator(pizzaOrder);
        //SauceGarlicDecorator sauceGarlicDecorator = new SauceGarlicDecorator(extraCheeseDecorator);
        //SauceHotDecorator sauceHotDecorator = new SauceHotDecorator(sauceGarlicDecorator);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new SauceGarlicDecorator(pizzaOrder);
        pizzaOrder = new SauceHotDecorator(pizzaOrder);

        //when
        //BigDecimal calculatedCost = sauceHotDecorator.getCost();
        BigDecimal calculatedCost = pizzaOrder.getCost();

        //then
        assertEquals(new BigDecimal(21), calculatedCost);
    }

    @Test
    public void testMeatExtraCheeseSauceHotIngredient() {
        //given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new SauceHotDecorator(pizzaOrder);

        //when
        String description = pizzaOrder.getIngredient();

        //then
        assertEquals("Ingredients for pizza: crust with tomato sos, cheese, extra cheese, hot sauce", description);
    }
}
