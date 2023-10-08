/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package productos;

/**
 *
 * @author ASUS
 */
public class ProductosRefrigerados extends ProductosDB{
    private String codigo;

    public ProductosRefrigerados(String nombre) {
        super(nombre);
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Código: " + codigo);
    }

}
