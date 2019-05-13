package com.kodilla.testing.shape;

import java.util.List;

public class ShapeCollector {
    private List<Shape> shapeList;

    public ShapeCollector(List<Shape> shapeList) {
        this.shapeList = shapeList;
    }

    public List<Shape> addFigure(Shape shape) {
        this.shapeList.add(shape);
        return this.shapeList;
    }

    public boolean removeFigure(Shape shape) {
        if (this.shapeList.contains(shape)) {
            this.shapeList.remove(shape);
            return true;
        }
        return false;
    }

    public Shape getFigure(int n) {
        return this.shapeList.get(n);
    }

    public String showFigures() {
        StringBuilder sb = new StringBuilder();
        for (Shape shape : this.shapeList) {
            sb.append(shape.getShapeName()).append(" ");
        }
        return sb.toString();
    }
}
