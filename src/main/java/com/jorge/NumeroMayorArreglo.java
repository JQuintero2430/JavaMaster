package com.jorge;

import java.util.Scanner;

public class NumeroMayorArreglo {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        int length = numbers.length;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingrese 5 números enteros:");
        for (int i = 0; i < length; i++) {
            numbers[i] = keyboard.nextInt();
        }

        int mayor = 0;
        for(int i = 1; i < length; i++) {
            mayor = Math.max(numbers[i], mayor);
        }
    }
}
