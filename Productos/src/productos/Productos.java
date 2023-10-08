/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productos;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Productos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();

        System.out.println("Seleccione el tipo de producto:");
        System.out.println("1. Producto Fresco");
        System.out.println("2. Producto Refrigerado");
        System.out.println("3. Producto Congelado");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                ProductosFrescos productoFresco = new ProductosFrescos(nombre);
                System.out.print("Ingrese la fecha de envasado: ");
                String fechaEnvasado = scanner.next();
                productoFresco.setFechaEnvasado(fechaEnvasado);
                System.out.print("Ingrese el país de origen: ");
                String paisOrigen = scanner.next();
                productoFresco.setPaisOrigen(paisOrigen);
                productoFresco.mostrarInformacion();
                break;
            case 2:
                ProductosRefrigerados productoRefrigerado = new ProductosRefrigerados(nombre);
                System.out.print("Ingrese el código: ");
                String codigo = scanner.next();
                productoRefrigerado.setCodigo(codigo);
                productoRefrigerado.mostrarInformacion();
                break;
            case 3:
                ProductosCongelados productoCongelado = new ProductosCongelados(nombre);
                System.out.print("Ingrese la temperatura: ");
                String temperatura = scanner.next();
                productoCongelado.setTemperatura(temperatura);
                productoCongelado.mostrarInformacion();
                break;
            default:
                System.out.println("Opción no válida");
        }

        scanner.close();
        
    }
    
}
