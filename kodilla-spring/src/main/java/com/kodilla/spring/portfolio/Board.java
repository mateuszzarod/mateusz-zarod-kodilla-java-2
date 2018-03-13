package com.kodilla.spring.portfolio;
import java.util.List;

public class Board {

    //ok

    TaskList todoList;
    TaskList inProgressList;
    TaskList doneList;

    public Board(TaskList todoList, TaskList inProgressList, TaskList doneList) {
        this.todoList = todoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return todoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

}
