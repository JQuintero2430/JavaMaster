package com.jorge;

import java.util.Scanner;

public class NumeroMayor {
    /*
    * El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
    Podría ser utilizando operador ternario.
    */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double numero1, numero2, mayor, menor;

        System.out.println("Introduce el primer número: ");
        numero1 = scanner.nextDouble();

        System.out.println("Introduce el segundo número: ");
        numero2 = scanner.nextDouble();

        mayor = numero1 > numero2 ? numero1 : numero2;
        menor = numero1 < numero2 ? numero1 : numero2;

        System.out.println("El número mayor es: " + mayor + " y el menor es: " + menor);

    }
}
