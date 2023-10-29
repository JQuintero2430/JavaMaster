package com.jorge;

//Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros,
// usando la clase Scanner ingresar la cantidad de números a comparar, luego utilizando una sentencia for
// iterar el número de veces (ingresado) para pedir el número entero, entonces se requiere:
//        Calcular el menor número e imprimir el valor.
//        Si el menor número es menor que 10, imprimir "El número menor es menor que 10!".
//        Si no, imprimir "el número menor es igual o mayor que 10!".

import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int iteraciones = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        while (iteraciones < 10) {
            System.out.println("Introduce la cantidad de números a comparar: ");
            iteraciones = keyboard.nextInt();

            if (iteraciones < 10) {
                System.out.println("La cantidad de números a comparar debe ser mayor a 10");
            }
        }

        for (int i = 1; i <= iteraciones; i++) {
            System.out.println("Introduce el " + i + "° número: ");
            int numero = keyboard.nextInt();

            if (i == 1) {
                menor = numero;
            } else if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("El número menor es: " + menor);
        if (menor < 10) {
            System.out.println("El número menor es menor que 10!");
        } else {
            System.out.println("El número menor es igual o mayor que 10!");
        }

    }

}
