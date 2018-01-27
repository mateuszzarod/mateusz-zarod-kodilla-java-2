package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double side;

    public Triangle (double a){
        side = a;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return (side * Math.sqrt(3))/4;
    }
}
