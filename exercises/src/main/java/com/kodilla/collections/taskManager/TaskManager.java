package com.kodilla.collections.taskManager;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class TaskManager {
    ArrayList<String> executedTask;

    public TaskManager() {
        executedTask = new ArrayList<>();
    }

    public void setExecutedTask(ArrayDeque<String> theQueue){
        while (theQueue.size() > 0){
            String theTask = theQueue.poll();
            executedTask.add(theTask);
        }
    }


}
