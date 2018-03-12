package com.kodilla.spring.portfolio;

import java.util.List;

public class Board {
    TaskList todoList;
    TaskList inProgressList;
    TaskList doneList;

    public Board(TaskList todoList, TaskList inProgressList, TaskList doneList) {
        this.todoList = todoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public String showToDoList(){
        return ("List of tasks to do is: " + todoList.getTasks());
    }

    public String showInPorgressList(){
        return ("List of tasks in progress is: " + inProgressList.getTasks());
    }

    public String showDoneList(){
        return ("List of tasks done is: " + doneList.getTasks());
    }




}
