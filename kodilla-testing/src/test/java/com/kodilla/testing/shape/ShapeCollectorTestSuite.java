package com.kodilla.testing.shape;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigureToCollection() {
        //Given
        List<Shape> shapeList = new ArrayList<>();
        ShapeCollector shapeCollector = new ShapeCollector(shapeList);
        int expected = 2;
        //When
        Shape triangle = new Triangle(2, 3);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(triangle);
        int actual = shapeList.size();
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveFigureFromCollection() {
        //Given
        List<Shape> shapeList = new ArrayList<>();
        ShapeCollector shapeCollector = new ShapeCollector(shapeList);
        //When
        Shape triangle = new Triangle(2, 3);
        Shape circle = new Circle(3);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(triangle);
        boolean actual1 = shapeCollector.removeFigure(triangle);
        boolean actual2 = shapeCollector.removeFigure(circle);
        //Then
        assertTrue(actual1);
        assertFalse(actual2);
    }

    @Test
    public void testGetFigureFromCollection() {
        //Given
        List<Shape> shapeList = new ArrayList<>();
        ShapeCollector shapeCollector = new ShapeCollector(shapeList);
        //When
        Shape triangle = new Triangle(2, 3);
        Shape square = new Square(3);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        Shape actual = shapeCollector.getFigure(1);
        //Then
        assertEquals(square, actual);
    }

    @Test
    public void testShowFigures() {
        //Given
        List<Shape> shapeList = new ArrayList<>();
        ShapeCollector shapeCollector = new ShapeCollector(shapeList);
        String expected = "Triangle Square Circle ";
        //When
        Shape triangle = new Triangle(2, 3);
        Shape square = new Square(3);
        Shape circle = new Circle(3);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(circle);
        String actual = shapeCollector.showFigures();
        //Then
        assertEquals(expected, actual);
    }
}
