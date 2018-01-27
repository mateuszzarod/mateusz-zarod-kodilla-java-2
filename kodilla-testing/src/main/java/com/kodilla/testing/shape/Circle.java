package com.kodilla.testing.shape;


public class Circle implements Shape {
    private final double PI = 3.14159;
    private double radius;

    public Circle(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return PI * radius * radius;
    }
}
