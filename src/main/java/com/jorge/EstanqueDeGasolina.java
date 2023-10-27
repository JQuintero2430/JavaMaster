package com.jorge;

import java.util.Scanner;

public class EstanqueDeGasolina {
//    Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa
//    que pida la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...
//    La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión,
//    pero tambien puede ser del tipo int.
//    Si la capacidad actual es 70 litros: imprimir Estanque lleno
//    Si está entre 60 y menor a 70: imprimir Estanque casi lleno
//    Si está entre 40 y menor a 60: imprimir Estanque  3/4
//    Si está entre 35 y menor a 40: imprimir Medio Estanque
//    Si está entre 20 y menor a 35: imprimir Suficiente
//    Si está entre 1 y menor a 20: imprimir Insuficiente

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce la cantidad de gasolina en el estanque: ");
        double gas = keyboard.nextDouble();

        if (gas == 70 ){
            System.out.println("Estanque lleno");
        } else if (gas >= 60 && gas < 70){
            System.out.println("Estanque casi lleno");
        } else if (gas >= 40 && gas < 60){
            System.out.println("Estanque 3/4");
        } else if (gas >= 35 && gas < 40){
            System.out.println("Medio estanque");
        } else if (gas >= 20 && gas < 35){
            System.out.println("Gas Suficiente");
        } else if (gas >= 1 && gas < 20){
            System.out.println("Gas Insuficiente");
        } else if (gas == 0) {
            System.out.println("Estanque vacío");
        } else {
            do {
                System.out.println("La cantidad de gasolina no puede ser negativa ni mayor a 70");
                main(args);
            } while (gas < 0 || gas > 70);
        }
    }
}
