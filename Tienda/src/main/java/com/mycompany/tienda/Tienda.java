/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tienda;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Tienda {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        int numClientes = 10;
        
        for (int i = 1; i <= numClientes; i++) {
            System.out.println("Cliente " + i + ":");
            System.out.print("Ingrese la cantidad de docenas a comprar: ");
            int docenas = sc.nextInt();
            
            double precioUnitario = 100.0; // Precio unitario del producto
            double montoCompra = 0.0;
            double descuento = 0.0;
            int unidadesObsequio = 0;
            
            if (docenas >= 3) {
                montoCompra = docenas * 12 * precioUnitario; // Precio por docena
                descuento = montoCompra * 0.15; // 15% de descuento
                unidadesObsequio = (docenas - 3) * 12; // Una unidad por cada docena en exceso sobre 3
            } else {
                montoCompra = docenas * 12 * precioUnitario; // Precio por docena
                descuento = montoCompra * 0.10; // 10% de descuento
                unidadesObsequio = 0; // No hay unidades de obsequio
            }
            
            double totalPagar = montoCompra - descuento;
            
            System.out.println("Monto de la compra: $" + montoCompra);
            System.out.println("Monto de descuento: $" + descuento);
            System.out.println("Número de unidades de obsequio: " + unidadesObsequio);
            System.out.println("Total a pagar: $" + totalPagar);
            System.out.println();
        }
        
        sc.close();
    }
}
