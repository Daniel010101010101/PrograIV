
package parcial2_ejercicio1;
import java.util.Scanner;

public class Parcial2_Ejercicio1 {
    public static void main(String[] args) {
        Numeros n = new Numeros();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el valor para elevar al cuadrado");
        int elevar = scanner.nextInt();
        
        n.Elevar(elevar);
        
        System.out.println("Ingrese el primer valor flotante para multiplicar");
        float n1 = scanner.nextFloat();
        
        System.out.println("Ingrese el segundo valor flotante para multiplicar");
        float n2 = scanner.nextFloat();
        
        n.MultiplicarFlotante(n1, n2);
        
        System.out.println("Ingresa el primer valor entero");
        int n3 = scanner.nextInt();
        
        System.out.println("Ingresa el segundo valor entero");
        int n4 = scanner.nextInt();
        
        System.out.println("Ingresa un caracter");
        String c = scanner.next();
        
        n.setCaracter(c);
        
        System.out.println("Valores ingresados: " + n3 + " " +n4 + " " + n.getCaracter());

    }
    
}
