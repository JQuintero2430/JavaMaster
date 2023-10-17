package com.jorge;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExerciseScanner {

    public static void main(String[] args) {
        int numeroEntero = 0;
        int numeroOctal;
        long numeroBinario;
        String numeroString;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");

        try {
            numeroEntero = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("El carácter introducido no es válido");
            main(args);
            System.exit(0);
        }
        numeroOctal = Integer.parseInt(Integer.toOctalString(numeroEntero));
        numeroBinario = Long.parseLong(Integer.toBinaryString(numeroEntero));


        String mensajeEntero = "El número entero es: " + numeroEntero;
        String mensajeOctal = "El número octal de " + numeroEntero +" es: "
                + numeroOctal;
        String mensajeBinario = "El número binario de " + numeroEntero +" es: "+ numeroBinario;

        String mensaje = mensajeEntero
                + "\n" + mensajeOctal
                + "\n" + mensajeBinario;

        System.out.println(mensaje);

    }
}