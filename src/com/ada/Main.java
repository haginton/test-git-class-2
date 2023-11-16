package com.ada;

public class Main {

    public static void main(String[] args) {
	    double number1 = 5;
	    double number2 = 5;

        System.out.println("La suma es: " + suma(number1, number2));
        System.out.println("La resta es: " + resta(number1, number2));
        System.out.println("La multiplicacion es: " + multiplicacion(number1, number2));
	    System.out.println("La division es: " + division(number1, number2));
	    System.out.println("La potencia de " + number1 + " elevado a " + number2 + " es: " + potencia(number1, number2));

    }

    private static double resta(double number1, double number2) {
        return number1 + number2;
    }

    private static double suma(double number1, double number2) {
        return number1 + number2;
    }

    private static double multiplicacion(double number1, double number2) {
        return number1 * number2;
    }

    private static double division(double number1, double number2) {
        return number1 / number2;
    }

    private static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

}
