package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOOTING";

    public final Task doTask(final String taskClass){
        switch (taskClass){
            case DRIVING:
                return new DrivingTask("Driving", "Warsaq", "car");
            case PAINTING:
                return new PaintingTask("painting", "red", "face");
            case SHOPPING:
                return new ShoppingTask("Shopping", "carpet", 2);
            default:
                return null;
        }
    }
}


