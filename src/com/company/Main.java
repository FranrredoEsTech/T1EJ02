package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

	    /* Pedir el radio de un círculo y calcular su área. A=PI*r^2. */

        Scanner sc = new Scanner(System.in);

        final double Pi = 3.14;

        System.out.println("Introduzca el radio del circulo(cm)");
        int r = sc.nextInt();

        double resultado = Pi * Math.pow(r, 2);

        System.out.println("El area es: "+resultado);

    }
}
