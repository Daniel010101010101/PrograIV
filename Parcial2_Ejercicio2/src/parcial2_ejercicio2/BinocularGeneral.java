/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2_ejercicio2;

/**
 *
 * @author ASUS
 */
public class BinocularGeneral extends Binoculares{
    
    String tipoLente;
    double alcance;

    public BinocularGeneral(String nombre, double precio, String prisma, String tipoLente, double alcance) {
        super(nombre, precio, prisma);
        this.tipoLente = tipoLente;
        this.alcance = alcance;
    }

    @Override
    public void mostrarCaracteristicas() {
        super.mostrarCaracteristicas();
        System.out.println("Tipo de Lente: " + tipoLente);
        System.out.println("Alcance: " + alcance);
    }
}
