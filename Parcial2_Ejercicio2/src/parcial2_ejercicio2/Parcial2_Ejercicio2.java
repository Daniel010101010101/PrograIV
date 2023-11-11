package parcial2_ejercicio2;

public class Parcial2_Ejercicio2 {

    public static void main(String[] args) {
        BinocularesMarinos binocularMarino = new BinocularesMarinos("Marino1", 150.99, "BAK-4", 5, "Arrugado");
        BinocularesAves binocularAves = new BinocularesAves("Aves1", 120.50, "BK-7", "Cuadrado", "Cromado");
        BinocularGeneral binocularGeneral = new BinocularGeneral("General1", 99.95, "BAK-4", "Vidrio", 10.0);

        System.out.println("Binocular Marino:");
        binocularMarino.mostrarCaracteristicas();

        System.out.println("\nBinocular de Aves:");
        binocularAves.mostrarCaracteristicas();

        System.out.println("\nBinocular de Uso General:");
        binocularGeneral.mostrarCaracteristicas();
    }

    
    
}
