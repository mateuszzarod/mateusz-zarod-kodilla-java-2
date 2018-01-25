package com.kodilla.testing.weather.stub;

import org.junit.Assert;
import org.junit.Test;

public class WeatherForecastTestSuite {
    @Test
    public void testCalculateForecastWithStub(){
        //Given
        //W linii 10 utworzyliśmy stub interfejsu Temperatures,
        // a następnie wykorzystaliśmy go w linii 11, przekazując go do konstruktora klasy WeatherForecast.
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assert.assertEquals(5, quantityOfSensors);
    }
}