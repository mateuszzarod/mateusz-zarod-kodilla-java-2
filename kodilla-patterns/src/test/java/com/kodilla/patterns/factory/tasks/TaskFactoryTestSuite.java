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
        //Then
        Assert.assertEquals("Driving", driving.getNameTask());
    }

    @Test
    public void TaskFactoryDrivingIsDone() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.doTask(TaskFactory.DRIVING);
        String result = driving.executeTask();

        //Then
        Assert.assertEquals("Driving", driving.getNameTask());
        Assert.assertEquals(true, driving.isTaskExecuted());


    }
}
