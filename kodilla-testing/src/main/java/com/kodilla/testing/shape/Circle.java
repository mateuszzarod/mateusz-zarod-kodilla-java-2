package com.kodilla.testing.shape;


import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.PI, PI) == 0 &&
                Double.compare(circle.getRadius(), getRadius()) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(PI, getRadius());
    }
}
