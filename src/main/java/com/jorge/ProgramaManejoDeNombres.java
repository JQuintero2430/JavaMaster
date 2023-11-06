package com.jorge;

import java.util.Scanner;

public class ProgramaManejoDeNombres {
    /*
    * La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:

Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos como argumentos de línea de comandos.

Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter, pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. Por ejemplo para Andres debe quedar como N.es

Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).

Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:

N.es_A.ia_E.pe*/
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String nombre1, nombre2, nombre3;

        do {
            System.out.println("Introduce el primer nombre: ");
            nombre1 = keyboard.nextLine();
        } while (nombre1.isEmpty());

        do {
            System.out.println("Introduce el segundo nombre: ");
            nombre2 = keyboard.nextLine();
        } while (nombre2.isEmpty());

        do {
            System.out.println("Introduce el tercer nombre: ");
            nombre3 = keyboard.nextLine();
        } while (nombre3.isEmpty());

        String resultado = getResultado(nombre1, nombre2, nombre3);

        System.out.println("La variable final es: " + resultado);

    }

    private static String getResultado(String nombre1, String nombre2, String nombre3) {
        String nombre1Trimmed = nombre1.trim();
        String nombre1Modificado = nombre1Trimmed.substring(1, 2).toUpperCase() +
                "." + nombre1Trimmed.substring(nombre1Trimmed.length() - 2);

        String nombre2Trimmed = nombre2.trim();
        String nombre2Modificado = nombre2Trimmed.substring(1, 2).toUpperCase() +
                "." + nombre2Trimmed.substring(nombre2Trimmed.length() - 2);

        String nombre3Trimmed = nombre3.trim();
        String nombre3Modificado = nombre3Trimmed.substring(1, 2).toUpperCase() +
                "." + nombre3Trimmed.substring(nombre3Trimmed.length() - 2);

        return nombre1Modificado + "_" + nombre2Modificado + "_" + nombre3Modificado;
    }

}
