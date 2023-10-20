package com.jorge;

//La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura, se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:
//        Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.
//        Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).
//        Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%
//        Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto y el monto total neto incluyendo impuesto.
//        Por ejemplo, el resultado podría ser algo así:
//        La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y el monto después de impuesto es de 160.3882

import java.util.Scanner;

public class DetalleDeFactura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el nombre de la factura: ");
        String nombreFactura = scanner.nextLine();
        System.out.println("Introduce el precio del primer producto: ");
        double precioProducto1 = scanner.nextDouble();
        System.out.println("Introduce el precio del segundo producto: ");
        double precioProducto2 = scanner.nextDouble();

        String mensaje = getString(precioProducto1, precioProducto2, nombreFactura);

        System.out.println(mensaje);
    }

    private static String getString(double precioProducto1, double precioProducto2, String nombreFactura) {
        double totalBruto = precioProducto1 + precioProducto2;
        double impuesto = totalBruto * 0.19;
        double totalNeto = totalBruto + impuesto;
        String  totalBrutoString = String.format("%.2f", totalBruto);
        String impuestoString = String.format("%.2f", impuesto);
        String totalNetoString = String.format("%.2f", totalNeto);

        String mensaje = "La factura " + nombreFactura + " tiene un total bruto de " + totalBrutoString
                + ", con un impuesto de " + impuestoString + " y el monto después de impuesto es de "
                + totalNetoString;
        return mensaje;
    }
}