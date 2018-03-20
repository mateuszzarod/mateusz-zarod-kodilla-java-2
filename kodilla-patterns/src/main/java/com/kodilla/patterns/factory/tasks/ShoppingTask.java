package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean isDone;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public boolean isDone() {
        return isDone;
    }

    @Override
    public String executeTask() {
        isDone = true;
        return "shopping task in progress";
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

