package com.jorge;

import javax.swing.*;

public class CircleArea {
    public static void main(String[] args) {

        double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del círculo: "));
        double area = Math.PI * Math.pow(radio, 2);
        String areaFormat = String.format("%.2f", area);
        JOptionPane.showMessageDialog(null, "El área del círculo es: " + areaFormat);
    }
}
