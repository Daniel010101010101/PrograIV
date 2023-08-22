/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia1;
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author ASUS
 */
public class Guia1 {

    public static void main(String[] args) {
        int opcion;

        do {
            String[] opciones = {
                "Mostrar 'Bienvenido al mundo de Java'",
                "Ingresar nombre y apellidos y mostrar fecha actual",
                "Ingresar palabra y número y mostrar la palabra repetida",
                "Calcular operaciones básicas",
                "Determinar el mayor de 3 números",
                "Calcular perímetro y área de un rectángulo",
                "Calcular área y volumen de una circunferencia",
                "Salir"
            };

            int alto = 500; // Altura del cuadro de diálogo
            int ancho = 400; // Ancho del cuadro de diálogo

            opcion = JOptionPane.showOptionDialog(
                null,
                "Seleccione una opción:",
                "Menú",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                opciones,
                opciones[0]
            );

            JDialog dialog = new JDialog();
            dialog.setSize(ancho, alto);
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

            switch (opcion) {
                case 0:
                    JOptionPane.showMessageDialog(dialog, "Bienvenido al mundo de Java");
                    break;
                case 1:
                    String nombre = JOptionPane.showInputDialog(dialog, "Ingrese su nombre:");
                    String apellidos = JOptionPane.showInputDialog(dialog, "Ingrese sus apellidos:");
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
                    String fechaActual = dateFormat.format(new Date());
                    JOptionPane.showMessageDialog(dialog, "Hola, " + nombre + " " + apellidos + ". Hoy es " + fechaActual);
                    break;
                case 2:
                    String palabra = JOptionPane.showInputDialog(dialog, "Ingrese una palabra:");
                    int numero = Integer.parseInt(JOptionPane.showInputDialog(dialog, "Ingrese un número:"));
                    StringBuilder resultado = new StringBuilder();
                    for (int i = 0; i < numero; i++) {
                        resultado.append(palabra).append("\n");
                    }
                    JOptionPane.showMessageDialog(dialog, resultado.toString());
                    break;
                case 3:
                    double num1 = Double.parseDouble(JOptionPane.showInputDialog(dialog, "Ingrese el primer número:"));
                    double num2 = Double.parseDouble(JOptionPane.showInputDialog(dialog, "Ingrese el segundo número:"));
                    String operaciones = String.format(
                        "Suma: %.2f\nResta: %.2f\nMultiplicación: %.2f\n",
                        num1 + num2,
                        num1 - num2,
                        num1 * num2
                    );
                    if (num2 != 0) {
                        operaciones += String.format("División: %.2f\n", num1 / num2);
                    } else {
                        operaciones += "No se puede dividir por cero.\n";
                    }
                    JOptionPane.showMessageDialog(dialog, operaciones);
                    break;
                case 4:
                    int numero1 = Integer.parseInt(JOptionPane.showInputDialog(dialog, "Ingrese el primer número:"));
                    int numero2 = Integer.parseInt(JOptionPane.showInputDialog(dialog, "Ingrese el segundo número:"));
                    int numero3 = Integer.parseInt(JOptionPane.showInputDialog(dialog, "Ingrese el tercer número:"));
                    int max = Math.max(numero1, Math.max(numero2, numero3));
                    JOptionPane.showMessageDialog(dialog, "El número mayor es: " + max);
                    break;
                case 5:
                    double ladoA = Double.parseDouble(JOptionPane.showInputDialog(dialog, "Ingrese el lado A del rectángulo:"));
                    double ladoB = Double.parseDouble(JOptionPane.showInputDialog(dialog, "Ingrese el lado B del rectángulo:"));
                    double perimetro = 2 * (ladoA + ladoB);
                    double area = ladoA * ladoB;
                    JOptionPane.showMessageDialog(dialog, "Perímetro del rectángulo: " + perimetro + "\nÁrea del rectángulo: " + area);
                    break;
                case 6:
                    double radio = Double.parseDouble(JOptionPane.showInputDialog(dialog, "Ingrese el radio de la circunferencia:"));
                    double areaCircunferencia = Math.PI * radio * radio;
                    double volumenEsfera = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
                    JOptionPane.showMessageDialog(dialog, "Área de la circunferencia: " + areaCircunferencia + "\nVolumen de la esfera: " + volumenEsfera);
                    break;
                case 7:
                    JOptionPane.showMessageDialog(dialog, "Saliendo del programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(dialog, "Opción no válida.");
            }
        } while (opcion != 7);
    }
}
