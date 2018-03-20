package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    private final String taskName;
    private final String where;
    private final String using;
    private boolean isDone;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public boolean isDone() {
        return isDone;
    }

    @Override
    public String executeTask() {
        isDone = true;
        return "driving task in progress";
    }

    @Override
    public String getNameTask() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isDone;
    }
}
