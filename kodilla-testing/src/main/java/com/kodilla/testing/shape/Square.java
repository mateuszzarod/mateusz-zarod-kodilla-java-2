package com.kodilla.testing.shape;

public class Square implements Shape {
    private double sideA;

    public Square (double a) {
        sideA = a;
    }

    public double getSideA() {
        return sideA;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return sideA * sideA;
    }

}
