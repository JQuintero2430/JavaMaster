package com.jorge;

import java.util.Scanner;

public class AgregarElementoPosicionOrdenada {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int length = numbers.length;
        int position = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese 9 números enteros de forma ordenada:");
        for (int i = 0; i < length - 1; i++) {
            numbers[i] = keyboard.nextInt();
        }
        System.out.println("Ingrese un nuevo número entero:");
        int newNumber = keyboard.nextInt();

        while(position < length - 1 && newNumber > numbers[position]) {
            position++;
        }

        for (int i = length - 2; i >= position; i--) {
            numbers[i + 1] = numbers[i];
        }
        numbers[position] = newNumber;

        System.out.println("El nuevo arreglo es:");

        for (int number : numbers) {
            System.out.print(number);
        }

    }
}
