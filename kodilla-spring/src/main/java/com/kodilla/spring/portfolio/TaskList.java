package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;
/*

 Utwórz również klasę TaskList w tym samym pakiecie - powinna ona zawierać właściwość List<String> tasks.
         Jej zawartość powinna być inicjowana w konstruktorze przy pomocy polecenia tasks = new ArrayList<>();
*/

public class TaskList {
    private List<String> tasks;

    public TaskList(List<String> tasks) {
        tasks = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }
}

