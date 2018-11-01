package com.kodilla.patterns.builder.robot;

public class Main {

    public static void main(String[] args) {
        RobotBuilder oldRobotBuilder = new OldRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(oldRobotBuilder);
        robotEngineer.makeRobot();
        Robot firsRobot = robotEngineer.getRobot();


    }
}
