package com.kodilla.patterns.builder.robot;

public class OldRobotBuilder implements RobotBuilder {
    //wstrzykujesz klasę, którą checsz budować
    private Robot robot;

    public OldRobotBuilder( ) {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Tin head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Tiny torso");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("short legs");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotLegs("long legs");
    }

    @Override
    public Robot getRobot() {
        return this.robot;
    }
}
