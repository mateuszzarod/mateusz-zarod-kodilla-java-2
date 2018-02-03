package com.kodilla.testing.shape;
import org.junit.*;


public class ShapeCollectorTestSuite {
    private static final double DELTA = 0.00001;
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
        Square theSquare = new Square(5.0);
        Circle theCircle = new Circle(5.0);
        Triangle theTriangle = new Triangle(5.0);
        Triangle theTriangle2 = new Triangle(5.0);

        //When
        shapeCollector.addFigure(theSquare);
        shapeCollector.addFigure(theCircle);
        shapeCollector.addFigure(theTriangle);
        shapeCollector.addFigure(theTriangle2);

        //Then
        Shape tempFigure1 = shapeCollector.getFigure(0);
        Shape tempFigure2 = shapeCollector.getFigure(1);
        Shape tempFigure3 = shapeCollector.getFigure(2);

        Assert.assertEquals(theSquare, tempFigure1);
        Assert.assertEquals(theCircle, tempFigure2);
        Assert.assertEquals(theTriangle, tempFigure3);
        }

    @Test
    public void testRemoveFigure(){
        //Given
        Square theSquare = new Square(5);
        shapeCollector.addFigure(theSquare);
        //When
        boolean result = shapeCollector.removeFigure(theSquare);
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testGetFigure(){
        //Given
        Square theSquare = new Square(5);
        shapeCollector.addFigure(theSquare);

        //When
        shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(theSquare, shapeCollector.getFigure(0));
    }

    @Test
    public void testShapeName(){
        //Given
        Square theSquare = new Square(5);
        Triangle theTriangle = new Triangle(5);
        Circle theCircle = new Circle(5);
        shapeCollector.addFigure(theSquare);
        shapeCollector.addFigure(theTriangle);
        shapeCollector.addFigure(theCircle);

        //When
        shapeCollector.getFigure(0);
        shapeCollector.getFigure(1);
        shapeCollector.getFigure(2);

        //Then
        Assert.assertEquals("Square", shapeCollector.getFigure(0).getShapeName());
        Assert.assertEquals("Triangle", shapeCollector.getFigure(1).getShapeName());
        Assert.assertEquals("Circle", shapeCollector.getFigure(2).getShapeName());
    }

    @Test
    public void testFigureField(){

        //Given
        Square theSquare = new Square(5);
        Triangle theTriangle = new Triangle(5);
        Circle theCircle = new Circle(5);

        //When
        double squareField = theSquare.getField();
        double triangleField = theTriangle.getField();
        double circleField = theCircle.getField();

        //Then
        //nie wiem jak prawidłowo tutaj napisać assertEquals, dostaję błąd w postaci brakującej DELTY
        Assert.assertEquals(25, squareField, DELTA);
        Assert.assertEquals(10.825317547305483, triangleField, DELTA);
        Assert.assertEquals(78.53975, circleField, DELTA);

    }
}

