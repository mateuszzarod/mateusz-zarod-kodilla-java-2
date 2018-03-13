package com.kodilla.spring.portfolio;

/*
W katalogu src/test/java utwórz pakiet com.kodilla.spring.portfolio,
        a w niem zestaw testów BoardTestSuite. Utwórz też test testTaskAdd(),
        który doda do każdej z list po jednym zadaniu (wcześniej uzyskując dostęp do Beana klasy Board).
        Test powinien sprawdzać czy dodane zadania da się odczytać.
*/

import com.sun.javafx.tk.Toolkit;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PortfolioTestSuite {

    @Test
    public void portfolioRead(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("Meet with Mr. X");
        board.getInProgressList().getTasks().add("Learning JAVA");
        board.getDoneList().getTasks().add("Made a progress in JAVA");
        //Then
        Assert.assertTrue(board.getToDoList().getTasks().contains("Meet with Mr. X"));
        Assert.assertTrue(board.inProgressList.getTasks().contains("Learning JAVA"));
        Assert.assertTrue(board.getDoneList().getTasks().contains("Made a progress in JAVA"));

        //nie wiem czy tobie też w 29 linii podświetla się akurat ta metoda na inny kolor (mi fioletowy)
    }
}
