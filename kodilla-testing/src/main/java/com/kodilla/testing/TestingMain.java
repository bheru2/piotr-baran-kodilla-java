package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result1 = calculator.add(5, 3);
        int result2 = calculator.subtract(5, 3);
        if (result1 == 8) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }

        if (result2 == 2) {
            System.out.println("test OK");
        } else {
            System.out.println("Error");
        }
    }
}
