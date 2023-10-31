package com.jorge;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//Para esta tarea se pide ingresar una fecha de nacimiento en formato string,
// convertirla a una fecha del tipo java.util.Date y calcular la edad de la
// persona de acuerdo a la fecha actual.
public class CalculateAge {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce tu fecha de nacimiento (dd/mm/yyyy): ");
        String fechaNacimiento = keyboard.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date;
        try {
            date = formatter.parse(fechaNacimiento);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        Date fechaActual = new Date();
        long diff = fechaActual.getTime() - date.getTime();
        long diffDays = diff / (24 * 60 * 60 * 1000);
        long diffYears = diffDays / 365;

        System.out.println("Tu edad es: " + diffYears + " años.");
    }

}
