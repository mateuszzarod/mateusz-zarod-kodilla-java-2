package com.kodilla.testing.forum.statistics;


import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateAdvStatisticsTestSuite {

        private static final double DELTA = 0.00001;
        private static int testCounter = 0;
        private Statistics statisticsMock;
        private CalculateForumStatistics calculate;

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
            testCounter++;
            System.out.println("Preparing to execute test No." + testCounter);
            statisticsMock = mock(Statistics.class);
            calculate = new CalculateForumStatistics();
        }

        @After
        public void after() {
            System.out.println("Test No. " + testCounter + " end.");

        }
        @Test
        // gdy liczba postów = 0
        public void testCalculateAdvStatisticsNumberOfPosts0 () {
            //Given
            List <String> users = generateUsers (3);

            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.commentsCount()).thenReturn(0);
            when(statisticsMock.usersNames()).thenReturn(users);   // muszę przygotować liste uzytkownikow na dole napisałem metodę na to

            //When
            calculate.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals (0, calculate.getNumberOfPosts ());
            assertEquals (0, calculate.getNumberOfComments());
            assertEquals (3, calculate.getNumberOfUsers());
            assertEquals (0.0, calculate.getNumberOfAvgPostPerUser(), DELTA);
            assertEquals (0.0, calculate.getNumberOfAvgCommentPerUser (),DELTA);
            assertEquals (0.0, calculate.getNumberOfAvgCommentPerPost(),DELTA);
        }

    @Test
    //gdy liczba postów = 1000
    public void testCalculateAdvStatisticsNumberOfPosts1000 () {
        List<String> users = generateUsers(0);

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(users);   // metoda generateUsers napisana jest pod testami

        //When
        calculate.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1000, calculate.getNumberOfPosts());
        assertEquals(0, calculate.getNumberOfComments());
        assertEquals(0, calculate.getNumberOfUsers());
        assertEquals(0.0, calculate.getNumberOfAvgPostPerUser(), DELTA);
        assertEquals(0.0, calculate.getNumberOfAvgCommentPerUser(), DELTA);
        assertEquals(0.0, calculate.getNumberOfAvgCommentPerPost(), DELTA);
    }

        @Test
        //gdy liczba użytkowników = 0
        public void testCalculateAdvStatisticsNumberOfUser0 () {
            //Given
            List <String> users = generateUsers (0);

            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.commentsCount()).thenReturn(0);
            when(statisticsMock.usersNames()).thenReturn(users);   // muszę przygotować liste uzytkownikow

            //When
            calculate.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals (0, calculate.getNumberOfPosts ());
            assertEquals (0, calculate.getNumberOfComments());
            assertEquals (0, calculate.getNumberOfUsers());
            assertEquals (0.0, calculate.getNumberOfAvgPostPerUser(), DELTA);
            assertEquals (0.0, calculate.getNumberOfAvgCommentPerUser (),DELTA);
            assertEquals (0.0, calculate.getNumberOfAvgCommentPerPost(),DELTA);
        }

        @Test
        //gdy liczba użytkowników = 100
        public void testCalculateAdvStatisticsNumberOfUser100 () {
            //Given
            List <String> users = generateUsers(100);

            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.commentsCount()).thenReturn(0);
            when(statisticsMock.usersNames()).thenReturn(users);   // muszę przygotować liste uzytkownikow

            //When
            calculate.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals (0, calculate.getNumberOfPosts ());
            assertEquals (0, calculate.getNumberOfComments());
            assertEquals (100, calculate.getNumberOfUsers());
            assertEquals (0.0, calculate.getNumberOfAvgPostPerUser(), DELTA);
            assertEquals (0.0, calculate.getNumberOfAvgCommentPerUser (),DELTA);
            assertEquals (0.0, calculate.getNumberOfAvgCommentPerPost(),DELTA);
        }

        @Test
        //gdy liczba komentarzy < postów
        public void testCalculateAdvStatisticsNumberOfCommentsLessThanPosts () {
            //Given
            List <String> users = generateUsers(0);

            when(statisticsMock.postsCount()).thenReturn(500);
            when(statisticsMock.commentsCount()).thenReturn(250);
            when(statisticsMock.usersNames()).thenReturn(users);

            //When
            calculate.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals (500, calculate.getNumberOfPosts ());
            assertEquals (250, calculate.getNumberOfComments());
            assertEquals (0, calculate.getNumberOfUsers());
            assertEquals (0.0, calculate.getNumberOfAvgPostPerUser(), DELTA);
            assertEquals (0.0, calculate.getNumberOfAvgCommentPerUser (),DELTA);
            assertEquals (0.5, calculate.getNumberOfAvgCommentPerPost(),DELTA);
        }

        @Test
        public void testCalculateAdvStatisticsNumberOfPostsLessThanComments () {    //gdy liczba komentarzy > postów
            //Given
            List <String> users = generateUsers (0);

            when(statisticsMock.postsCount()).thenReturn(100);
            when(statisticsMock.commentsCount()).thenReturn(500);
            when(statisticsMock.usersNames()).thenReturn(users);

            //When
            calculate.calculateAdvStatistics(statisticsMock);

            //Then
            assertEquals (100, calculate.getNumberOfPosts ());
            assertEquals (500, calculate.getNumberOfComments());
            assertEquals (0, calculate.getNumberOfUsers());
            assertEquals (0.0, calculate.getNumberOfAvgPostPerUser(), DELTA);
            assertEquals (0.0, calculate.getNumberOfAvgCommentPerUser (),DELTA);
            assertEquals (5.0, calculate.getNumberOfAvgCommentPerPost(),DELTA);
        }

        private static List<String> generateUsers(int usersQuantity) {
            List<String> resultList = new ArrayList <String>();
            for (int n = 1; n <= usersQuantity; n++) {
                String user = "user" + n;
                resultList.add(user);
            }
            return resultList;
        }
    }



