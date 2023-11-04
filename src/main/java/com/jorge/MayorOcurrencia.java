package com.jorge;

import java.util.Scanner;

//Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9).
//        Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo y
//        también imprimir la cantidad de veces que aparece en el arreglo.
//        Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}
//        Como resultado debería imprimir lo siguiente:
//        La mayor ocurrencias es: 3
//        El elemento que mas se repite es: 5
//        En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces.
public class MayorOcurrencia {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Ingrese 10 números enteros en el rango de 1 a 9:");
        for (int i = 0; i < numbers.length; i++) {
            int number = keyboard.nextInt();
            while (number < 1 || number > 9) {
                System.out.println("El número debe estar en el rango de 1 a 9. Ingrese un nuevo número:");
                number = keyboard.nextInt();
            }
            numbers[i] = number;
        }
        int maxOcurrence = 0, maxOcurrenceNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            int ocurrence = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    ocurrence++;
                }
            }
            if (ocurrence > maxOcurrenceNumber) {
                maxOcurrence = ocurrence;
                maxOcurrenceNumber = numbers[i];
            }
        }
        System.out.println("La mayor ocurrencia es: " + maxOcurrence);
        System.out.println("El elemento que más se repite es: " + maxOcurrenceNumber);
        keyboard.close();
    }
}
