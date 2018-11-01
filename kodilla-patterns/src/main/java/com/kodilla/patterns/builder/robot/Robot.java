package com.kodilla.patterns.builder.robot;

public class Robot implements RobotPlan {
    private String robotHead;
    private String robotTorso;
    private String robotArms;
    private String robotLegs;

    @Override
    public void setRobotHead(String head) {
        robotHead = head;
    }

    @Override
    public void setRobotTorso(String torso) {
        robotTorso = torso;
    }

    @Override
    public void setRobotArms(String arm) {
        robotArms = arm;
    }

    @Override
    public void setRobotLegs(String leg) {
        robotLegs = leg;
    }

    public String getRobotTorso() {
        return robotTorso;
    }

    public String getRobotArms() {
        return robotArms;
    }

    public String getRobotLegs() {
        return robotLegs;
    }


    public String getRobotHead() {
        return robotHead;
    }

}
