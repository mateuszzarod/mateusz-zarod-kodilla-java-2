package com.kodilla.stream;
import com.kodilla.stream.sand.Africa;
import com.kodilla.stream.sand.Asia;
import com.kodilla.stream.sand.Europe;
import com.kodilla.stream.sand.SandStorage;
import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        Continent europe = new Continent("Europe", Arrays.asList(
                new Country("Poland", BigDecimal.valueOf(1000)),
                new Country("Italy", BigDecimal.valueOf(2000)),
                new Country("Germany", BigDecimal.valueOf(3000))
        ));

        Continent asia = new Continent("Asia", Arrays.asList(
                new Country("China", BigDecimal.valueOf(4000)),
                new Country("Japan", BigDecimal.valueOf(5000)),
                new Country("Russia", BigDecimal.valueOf(6000))
        ));

        Continent africa = new Continent("Africa", Arrays.asList(
                new Country("RPA", BigDecimal.valueOf(1000)),
                new Country("Kenia", BigDecimal.valueOf(2000)),
                new Country("Egypt", BigDecimal.valueOf(3000))
        ));

        World world = new World(Arrays.asList(europe, asia, africa));

        //When
        BigDecimal peopleQuantity = world.getPeopleQuantity();
        Assert.assertEquals(new BigDecimal("27000"), peopleQuantity);
    }

}
