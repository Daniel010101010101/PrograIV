/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos;

/**
 *
 * @author ASUS
 */
public class ProductosCongelados extends ProductosDB{
     private String temperatura;

    public ProductosCongelados(String nombre) {
        super(nombre);
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Temperatura: " + temperatura);
    }
}
