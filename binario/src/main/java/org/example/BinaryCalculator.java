package org.example;

import javax.swing.*;
import java.awt.*;

public class BinaryCalculator {
    public static void main(String[] args) {
        // Crear la ventana
        JFrame frame = new JFrame("Calculadora de Suma Binaria");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridLayout(4, 2));

        // Crear componentes de la interfaz
        JLabel label1 = new JLabel("Número binario 1:");
        JLabel label2 = new JLabel("Número binario 2:");
        JLabel resultLabel = new JLabel("Resultado:");

        JTextField binary1Field = new JTextField();
        JTextField binary2Field = new JTextField();
        JTextField resultField = new JTextField();
        resultField.setEditable(false); // No editable

        JButton sumButton = new JButton("Sumar");

        // Acción del botón
        sumButton.addActionListener(e -> {
            String binary1 = binary1Field.getText();
            String binary2 = binary2Field.getText();
            try {
                // Usar el método para sumar binarios
                String resultado = sumarBinarios(binary1, binary2);
                resultField.setText(resultado); // Mostrar resultado en binario
            } catch (IllegalArgumentException ex) {
                // Si no es un número binario válido, mostrar error
                JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        // Añadir componentes a la ventana
        frame.add(label1);
        frame.add(binary1Field);
        frame.add(label2);
        frame.add(binary2Field);
        frame.add(sumButton);
        frame.add(resultLabel);
        frame.add(resultField);

        // Mostrar la ventana
        frame.setVisible(true);
    }

    // Método que realiza la suma binaria
    public static String sumarBinarios(String binario1, String binario2) {
        try {
            int num1 = Integer.parseInt(binario1, 2);
            int num2 = Integer.parseInt(binario2, 2);
            int sum = num1 + num2;
            return Integer.toBinaryString(sum);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Por favor ingrese números binarios válidos.");
        }
    }
}
