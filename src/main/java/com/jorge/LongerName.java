package com.jorge;

import javax.swing.*;

//Obtener el nombre mas largo de tres personas, según los siguientes requerimientos
//        Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia
//        o amigos usando la clase JOptionPane y método showInputDialog().
//        Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)
//        (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)
//        Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo,
//        y con el indice cero accedemos al nombre de la persona.
//        Restricción no usar loops en el desarrollo de la tarea.
//        Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."
public class LongerName {
    public static void main(String[] args) {
        String nombre1, nombre2, nombre3;

        nombre1 = JOptionPane.showInputDialog("Introduce el primer nombre: ");
        nombre2 = JOptionPane.showInputDialog("Introduce el segundo nombre: ");
        nombre3 = JOptionPane.showInputDialog("Introduce el tercer nombre: ");
       getNombreMasLargo(nombre1, nombre2, nombre3);
    }

    private static void getNombreMasLargo(String nombre1, String nombre2, String nombre3) {

        String nombreMasLargo = (nombre1.split(" ")[0].length() > nombre2.split(" ")[0].length()) ? nombre1 : nombre2;
        nombreMasLargo = (nombreMasLargo.split(" ")[0].length() > nombre3.split(" ")[0].length()) ? nombreMasLargo : nombre3;

        JOptionPane.showMessageDialog(null, nombreMasLargo + " tiene el nombre más largo.");
    }
}
