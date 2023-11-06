    package com.jorge;

    import java.util.Scanner;

//Escribir un programa para una matriz de n x n e imprima en ella una silla (o letra h minúscula)
// construida a base del numero 1 y utilizar el numero 0 como espacio.
// El tamaño de la silla se basa en una variable n que indicará el tamaño de la figura a
// imprimir en una matriz de n x n.
//        Por ejemplo para n=5 se obtiene:
//        10000
//        10000
//        11111
//        10001
//        10001
//        Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa.
    public class ImprimirSilla {
        public static void main(String[] args) {

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Introduce un número: ");
            int n = keyboard.nextInt();
            while (n < 0) {
                System.out.println("Introduce un número: ");
                n = keyboard.nextInt();
            }

            if (n == 0) {
                System.out.println("ERROR");
            }

            int[][] matrix = new int[n][n];

            for(int i = 0; i < matrix.length; i++) {
                for(int j = 0; j < matrix[i].length; j++){
                    if (j == 0 || i == matrix.length / 2
                            || j == matrix[i].length - 1 && i >= matrix.length / 2) {
                        matrix[i][j] = 1;
                    } else {
                        matrix[i][j] = 0;
                    }
                }
            }

            for (int[] row : matrix) {
                for (int column : row) {
                    System.out.print(column);
                }
                System.out.println();
            }
        }
    }
