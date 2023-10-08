/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos;

/**
 *
 * @author ASUS
 */
public class ProductosDB {
    private String nombre;
    private String fechaCaducidad;
    private String lote;

    public ProductosDB(String nombre) {
        this.nombre = nombre;
        this.fechaCaducidad = "01/01/2024"; // Valor estático para la fecha de caducidad
        this.lote = "L12345"; // Valor estático para el lote
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Caducidad: " + fechaCaducidad);
        System.out.println("Lote: " + lote);
    }
}
