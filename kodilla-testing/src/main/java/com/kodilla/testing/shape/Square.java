package com.kodilla.testing.shape;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Double.compare(square.getSideA(), getSideA()) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(getSideA());
    }
}
