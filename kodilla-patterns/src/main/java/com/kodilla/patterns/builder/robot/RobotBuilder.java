package com.kodilla.patterns.builder.robot;

public interface RobotBuilder {
    void buildRobotHead();
    void buildRobotTorso();
    void buildRobotLegs();
    void buildRobotArms();
    Robot getRobot();
    }
