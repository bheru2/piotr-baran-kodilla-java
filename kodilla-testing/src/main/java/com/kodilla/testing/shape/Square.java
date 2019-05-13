package com.kodilla.testing.shape;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getArea() {
        return Math.pow(this.side, 2);
    }
}
