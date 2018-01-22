package com.kodilla.testing.collection;
import org.junit.*;
import java.util.ArrayList;
public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }
    @After
    public void after() {
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("T   est Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> newList = new ArrayList<>();
        //When
        ArrayList<Integer> resultList = oddNumbersExterminator.exterminate(newList);
        //Then
        Assert.assertEquals(0, resultList.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        //Given
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        evenNumbers.add(8);
        evenNumbers.add(10);
        evenNumbers.add(3);
        evenNumbers.add(6);
        evenNumbers.add(9);
        evenNumbers.add(12);
        evenNumbers.add(15);

        ArrayList<Integer> expectedResult = new ArrayList<Integer>();
        expectedResult.add(2);
        expectedResult.add(4);
        expectedResult.add(6);
        expectedResult.add(8);
        expectedResult.add(10);
        expectedResult.add(6);
        expectedResult.add(12);

        OddNumbersExterminator checkList = new OddNumbersExterminator();

        //When
        ArrayList<Integer> resultListEvenNumbers = checkList.exterminate(evenNumbers);
        //Then

        Assert.assertEquals(expectedResult, resultListEvenNumbers);
    }
}

