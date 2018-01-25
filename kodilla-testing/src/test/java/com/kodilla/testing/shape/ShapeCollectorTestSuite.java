package com.kodilla.testing.shape;

/*Napisz testy sprawdzające metody klasy ShapeCollector*/


import javafx.beans.binding.When;
import org.junit.*;

import java.util.List;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;
    ShapeCollector shapeCollector;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        shapeCollector = new ShapeCollector();
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void addFigure() {

        //Given
        Square theSquare = new Square();
        Circle theCircle = new Circle();
        Triangle theTriangle = new Triangle();

        //When
        shapeCollector.addFigure(theSquare);
        shapeCollector.addFigure(theCircle);
        shapeCollector.addFigure(theTriangle);

        //Then
        Shape tempFigure1 = shapeCollector.getFigure(0);
        Shape tempFigure2 = shapeCollector.getFigure(1);
        Shape tempFigure3 = shapeCollector.getFigure(2);

        Assert.assertEquals(theSquare, shapeCollector.getFigure(0));
        Assert.assertEquals(theCircle, shapeCollector.getFigure(1));
        Assert.assertEquals(theTriangle, shapeCollector.getFigure(2));
        }

    @Test
    public void testRemoveFigure(){
        //Given
        Square theSqare = new Square();
        shapeCollector.addFigure(theSqare);
        //When
        boolean result = shapeCollector.removeFigure(theSqare);
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testGetFigure(){
        //Given
        Square theSquare = new Square();
        shapeCollector.addFigure(theSquare);

        //When
        shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(theSquare, shapeCollector.getFigure(0));
    }


}

