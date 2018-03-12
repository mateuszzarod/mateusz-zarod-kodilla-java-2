package com.kodilla.spring.portfolio;

/*
W katalogu src/test/java utwórz pakiet com.kodilla.spring.portfolio,
        a w niem zestaw testów BoardTestSuite. Utwórz też test testTaskAdd(),
        który doda do każdej z list po jednym zadaniu (wcześniej uzyskując dostęp do Beana klasy Board).
        Test powinien sprawdzać czy dodane zadania da się odczytać.
*/

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PortfolioTestSuite {
    @Test
    public void portfolioRead(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When&Then
        board.showToDoList();
        board.showInPorgressList();
        board.showDoneList();
    }
}
