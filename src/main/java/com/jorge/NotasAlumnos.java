package com.jorge;

import java.util.Scanner;

//Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double).
// Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1,
// además mostrar el promedio total.
//        Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas
//        una a una para realizar los cálculos (contadores, sumas).
//        Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje
//        de error finalizando el programa.
public class NotasAlumnos {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int iteraciones = 0;
        double nota;
        double sumaNotas = 0;
        double sumaNotasMayoresA5 = 0;
        double sumaNotasMenoresA4 = 0;
        double sumaNotas1 = 0;
        double promedioTotal;
        double promedioNotasMayoresA5;
        double promedioNotasMenoresA4;
        boolean error = false;

        while (iteraciones < 20 && !error) {
            System.out.println("Introduce la nota del alumno: ");
            nota = keyboard.nextDouble();

            if (nota == 0) {
                error = true;
                System.out.println("Error: la nota no puede ser 0");
            } else {
                sumaNotas += nota;
                if (nota > 5) {
                    sumaNotasMayoresA5 += nota;
                } else if (nota < 4 && nota > 1) {
                    sumaNotasMenoresA4 += nota;
                } else if (nota == 1) {
                    sumaNotas1++;
                    sumaNotasMenoresA4 += nota;
                }
                iteraciones++;
            }
        }

        if (!error) {
            promedioTotal = sumaNotas / iteraciones;
            promedioNotasMayoresA5 = sumaNotasMayoresA5 / iteraciones;
            promedioNotasMenoresA4 = sumaNotasMenoresA4 / iteraciones;

            System.out.println("El promedio de las notas mayores a 5 es: " + promedioNotasMayoresA5);
            System.out.println("El promedio de las notas menores a 4 es: " + promedioNotasMenoresA4);
            System.out.println("La cantidad de notas 1 es: " + sumaNotas1);
            System.out.println("El promedio total es: " + promedioTotal);
        }
    }
}
