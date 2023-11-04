package com.jorge;

import java.util.Scanner;

//Escribir un programa que recorra un arreglo y genere un histograma en base a los valores de este.
//        El arreglo debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.
//        Un histograma es una representación gráfica (de puntos o barra) de que tanto un elemento aparece
//        en un conjunto de datos, es decir debe mostrar la frecuencia para todos los números del 1 al 6,
//        incluso si no están presente en el arreglo.
//        Por ejemplo para el arreglo {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1} el histograma debería ser:
//        1: ***
//        2:
//        3: *
//        4: *****
//        5: *
//        6: **
//        Para la tarea usaremos el asterisco(*) como representación gráfica para el histograma.
public class HistogramaArreglo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] numbers = new int[12];

        System.out.println("Ingrese 12 números enteros en el rango de 1 a 6:");
        for (int i = 0; i < numbers.length; i++) {
            int number = keyboard.nextInt();
            while (number < 1 || number > 6) {
                System.out.println("El número debe estar en el rango de 1 a 6. Ingrese un nuevo número:");
                number = keyboard.nextInt();
            }
            numbers[i] = number;
        }
        int[] histogram = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < histogram.length; j++) {
                if (numbers[i] == j + 1) {
                    histogram[j]++;
                }
            }
        }
        for (int i = 0; i < histogram.length; i++) {
            System.out.print(i + 1 + ": ");
            for (int j = 0; j < histogram[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        keyboard.close();
    }
}
