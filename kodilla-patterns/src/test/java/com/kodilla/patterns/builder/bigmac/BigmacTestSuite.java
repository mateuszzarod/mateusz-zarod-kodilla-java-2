package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void BigMacNew() {
        //Given
        Bigmac bigmac = new Bigmac.bigmacBuilder()
                .ingredient("bacon")
                .ingredient("japanelo")
                .ingredient("cheese")
                .roll("with sesame")
                .sauce("BBQ")
                .burgerQuantity(3)
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngr = bigmac.getIngridients().size();
        String whatRoll = bigmac.getRoll();
        //Then
        Assert.assertEquals(3, howManyIngr);
        Assert.assertEquals("with sesame", whatRoll);
    }
}
