package com.ada;

public class Main {

    public static void main(String[] args) {
	    double number1 = 5;
	    double number2 = 5;

        System.out.println("La suma es: " + suma(number1, number2));
        System.out.println("La resta es: " + resta(number1, number2));

    }

    private static double resta(double number1, double number2) {
        return number1 + number2;
    }

    private static double suma(double number1, double number2) {
        return number1 + number2;
    }
}
