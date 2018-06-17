package com.kodilla.testing.shape;

import java.util.Objects;

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
        double sqare = Math.sqrt(3);
        return (((side*side)*sqare)/4);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.getSide(), getSide()) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(getSide());
    }
}
