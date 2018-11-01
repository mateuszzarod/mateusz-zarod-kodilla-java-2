package com.kodilla.stream.lambdaTwo;

public class Celebrity {
    private String name;
    private boolean canSing;
    private boolean canAct;
    private boolean canDance;

    public Celebrity(String starName, boolean singer, boolean actor, boolean dancer) {
        this.name = starName;
        this.canSing = singer;
        this.canAct = actor;
        this.canDance = dancer;
    }

    public boolean canSing() {
        return canSing;
    }

    public boolean canDance() {
        return canDance;
    }

    public boolean canAct() {
        return canAct;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return getName();
    }
}