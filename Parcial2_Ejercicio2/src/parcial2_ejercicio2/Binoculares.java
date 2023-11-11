/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2_ejercicio2;

public class Binoculares {
    
    String nombre;
    double precio;
    String prisma;

    public Binoculares(String nombre, double precio, String prisma) {
        this.nombre = nombre;
        this.precio = precio;
        this.prisma = prisma;
    }

    public void mostrarCaracteristicas() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Prisma: " + prisma);
    }
    
}
