package com.jorge;

import java.util.Scanner;

public class BuscarNumeroDelArray {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int[] numbers = new int[10];
        int length = numbers.length;

        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < length; i++) {
            numbers[i] = keyboard.nextInt();
        }

        System.out.print("Ingrese un número a buscar: ");
        int target = keyboard.nextInt();
        boolean found = false;
        int targetIndex = 0;

        for (int i = 0;i < length; i++) {
            if (numbers[i] == target) {
                found = true;
                targetIndex = i;
                break;
            }
        }

        if(found){
            System.out.println("El número " + target + " se encuentra en el arreglo en la posición : " + targetIndex);
        } else {
            System.out.println("El número " + target + " no se encuentra en el arreglo");
        }
    }
}
