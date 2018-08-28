package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void TaskFactoryDriving() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.doTask(TaskFactory.DRIVING);
        Task painting = taskFactory.doTask(TaskFactory.PAINTING);
        Task shopping = taskFactory.doTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Driving", driving.getNameTask());
        Assert.assertEquals("Painting", painting.getNameTask());
        Assert.assertEquals("Shopping", shopping.getNameTask());
    }

    @Test
    public void TaskFactoryDrivingIsDone() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.doTask(TaskFactory.DRIVING);
        Task painting = taskFactory.doTask(TaskFactory.PAINTING);
        Task shopping = taskFactory.doTask(TaskFactory.SHOPPING);

        String resultDrive = driving.executeTask();
        String resultPaint = painting.executeTask();
        String resultShop = shopping.executeTask();

        //Then
        Assert.assertEquals(true, driving.isTaskExecuted());
        Assert.assertEquals(true, painting.isTaskExecuted());
        Assert.assertEquals(true, shopping.isTaskExecuted());
    }
}
