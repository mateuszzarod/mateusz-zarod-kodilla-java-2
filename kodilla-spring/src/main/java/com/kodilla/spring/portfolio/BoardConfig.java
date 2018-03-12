package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

/*
Celem zadania jest stworzenie klasy Board reprezentującej tablicę z listami zadań TaskList.
        Aby zrealizować zadanie:

        Utwórz w katalogu src/main/java pakiet com.kodilla.spring.portfolio, a w nim klasę Board
        posiadającą trzy pola: toDoList, inProgressList oraz doneList. Pola te powinny być typu TaskList.

        Utwórz również klasę TaskList w tym samym pakiecie - powinna ona zawierać właściwość List<String> tasks.
        Jej zawartość powinna być inicjowana w konstruktorze przy pomocy polecenia tasks = new ArrayList<>();

        Napisz klasę konfigurującą Beany o nazwie BoardConfig, która utworzy trzy różne Beany reprezentujące listy
        zadań i wstrzyknie je do Beana klasy Board.

        W katalogu src/test/java utwórz pakiet com.kodilla.spring.portfolio, a w niem zestaw testów BoardTestSuite.
        Utwórz też test testTaskAdd(), który doda do każdej z list po jednym zadaniu (wcześniej uzyskując dostęp do Beana klasy Board). Test powinien sprawdzać czy dodane zadania da się odczytać.
        Przygotowany kod prześlij do repozytorium Github.
        Link do repozytorium wklej poniżej i prześlij do mentora.
*/

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("ToDoList")
    TaskList taskList;

    @Autowired
    @Qualifier("InProgressList")
    TaskList inProgressList;

    @Autowired
    @Qualifier("DoneList")
    TaskList doneList;

    @Bean
    public Board board() {
        return new Board(taskList, inProgressList, doneList);
    }

    @Bean(name = "ToDoList")
    @Scope("prototype")
    public TaskList getToDoList() {
        List<String> toDoTasks = new ArrayList<>();
        toDoTasks.add("Task nr 11");
        return new TaskList(toDoTasks);
    }

    @Bean(name = "InProgressList")
    @Scope("prototype")
    public TaskList getInProgressList() {
        List<String> inProgressTasks = new ArrayList<>();
        inProgressTasks.add("Task nr 22");
        return new TaskList(inProgressTasks);
    }

    @Bean(name = "DoneList")
    @Scope("prototype")
    public TaskList getDoneList() {
        List<String> doneList = new ArrayList<>();
        doneList.add("Task nr 33");
        return new TaskList(doneList);
    }

}
