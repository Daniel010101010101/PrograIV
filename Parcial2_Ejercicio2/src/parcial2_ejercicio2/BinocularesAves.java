/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2_ejercicio2;

/**
 *
 * @author ASUS
 */
public class BinocularesAves extends Binoculares{
    String enfoque;
    String recubrimientoNiebla;

    public BinocularesAves(String nombre, double precio, String prisma, String enfoque, String recubrimientoNiebla) {
        super(nombre, precio, prisma);
        this.enfoque = enfoque;
        this.recubrimientoNiebla = recubrimientoNiebla;
    }

    @Override
    public void mostrarCaracteristicas() {
        super.mostrarCaracteristicas();
        System.out.println("Enfoque: " + enfoque);
        System.out.println("Recubrimiento Niebla: " + recubrimientoNiebla);
    }
}
