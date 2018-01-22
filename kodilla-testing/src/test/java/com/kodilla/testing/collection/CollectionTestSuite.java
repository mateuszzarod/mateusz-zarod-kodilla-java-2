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
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        evenNumbers.add(8);
        evenNumbers.add(10);
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
        oddNumbers.add(3);
        oddNumbers.add(6);
        oddNumbers.add(9);
        oddNumbers.add(12);
        oddNumbers.add(15);
        OddNumbersExterminator checkList = new OddNumbersExterminator();
        ArrayList<Integer> resultListEvenNumbers = checkList.exterminate(evenNumbers);
        Assert.assertEquals(5, resultListEvenNumbers.size());
        ArrayList<Integer> resultListOddNumbers = checkList.exterminate(oddNumbers);
        Assert.assertEquals(2, resultListOddNumbers.size());
    }
}