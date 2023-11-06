package com.jorge;

import java.util.Scanner;

public class AgregarElementoPosicionIndicada {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int length = numbers.length;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese 9 números enteros:");
        for (int i = 0; i < length - 1; i++) {
            numbers[i] = keyboard.nextInt();
        }
        System.out.println("Ingrese un nuevo número entero:");
        int newNumber = keyboard.nextInt();
        System.out.println("Ingrese la posición donde desea agregar el nuevo número (entre 0 y 9):");
        int position = keyboard.nextInt();
        
        for (int i = length - 1; i > position; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[position] = newNumber;
        System.out.println("El nuevo arreglo es:");
        for(int number : numbers) {
            System.out.println(number);
        }
    }
}
