package com.kodilla.calculator;

public class Calculator {
    private static int addNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private static int subtractNumbers(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static void main(String[] args) {
        System.out.println(Calculator.addNumbers(5,3));
        System.out.println(Calculator.subtractNumbers(5,3));
    }
}
