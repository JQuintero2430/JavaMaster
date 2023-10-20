package com.jorge;

import javax.swing.*;

public class ExerciseJOptionPane {

    public static void main(String[] args) {
        int numeroEntero = 0;
        int numeroOctal;
        long numeroBinario;
        String numeroString;

        numeroString = JOptionPane.showInputDialog("Introduce un número entero: ");

        try {
            numeroEntero = Integer.parseInt(numeroString);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El carácter introducido no es válido");
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

        JOptionPane.showMessageDialog(null, mensaje);

    }
}