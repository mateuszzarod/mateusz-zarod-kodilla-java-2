package com.kodilla.patterns.builder.robot;

public interface RobotPlan {
    public void setRobotHead(String head);

    public void setRobotTorso(String torso);

    public void setRobotArms(String arm);

    public void setRobotLegs(String leg);
}
