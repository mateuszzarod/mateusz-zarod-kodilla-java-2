package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";
    private Task task;

    public final Task doTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Driving", "Warsaw", "Bike");
            case PAINTING:
                return new PaintingTask("Painting", "Red", "City");
            case SHOPPING:
                return new ShoppingTask("Shopping", "Egg", 10);
            default:
                return null;
        }
    }
}


