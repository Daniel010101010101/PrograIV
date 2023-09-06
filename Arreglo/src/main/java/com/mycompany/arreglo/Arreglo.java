/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arreglo;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Arreglo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        System.out.print("Ingrese su primer nombre: ");
        String nombre = scanner.nextLine().toLowerCase(); // Convertir el nombre a minúsculas

        for (int i = 0; i < nombre.length(); i++) {
            char letra = nombre.charAt(i);

            // Encontrar la posición de la letra en el alfabeto
            int posicion = -1;

            for (int j = 0; j < alfabeto.length; j++) {
                if (alfabeto[j] == letra) {
                    posicion = j + 1; // Sumar 1 para que sea legible para el usuario
                    break;
                }
            }

            if (posicion != -1) {
                System.out.println(letra + " posición " + posicion);
            } else {
                System.out.println(letra + " no es una letra válida en el alfabeto.");
            }
        }

        scanner.close();
    }
}
