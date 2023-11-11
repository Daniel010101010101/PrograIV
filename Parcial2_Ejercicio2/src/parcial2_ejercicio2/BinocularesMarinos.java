/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2_ejercicio2;

/**
 *
 * @author ASUS
 */
public class BinocularesMarinos extends Binoculares{
    int resistenciaIPX;
    String textura;

    public BinocularesMarinos(String nombre, double precio, String prisma, int resistenciaIPX, String textura) {
        super(nombre, precio, prisma);
        this.resistenciaIPX = resistenciaIPX;
        this.textura = textura;
    }

    @Override
    public void mostrarCaracteristicas() {
        super.mostrarCaracteristicas();
        System.out.println("Resistencia IPX: " + resistenciaIPX);
        System.out.println("Textura: " + textura);
    }
}
