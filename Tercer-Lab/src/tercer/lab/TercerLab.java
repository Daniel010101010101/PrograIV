
package tercer.lab;
import java.sql.*;
import java.util.Scanner;

public class TercerLab {
    static final String controlador = "org.mariadb.jdbc.Driver";
    static final String urlDB = "jdbc:mariadb://localhost:3306/tercer-lab";
    public static void main(String[] args) {
        Connection conexion = null;
        Statement instruccion = null;
        ResultSet resultados = null;
        try {
            Class.forName(controlador);
            conexion = DriverManager.getConnection(urlDB, "root", "admin");
            instruccion = conexion.createStatement();
            Scanner scanner = new Scanner(System.in);

            System.out.println("TABLA SANGRE");
            resultados = instruccion.executeQuery("SELECT * FROM sangre");
            mostrarResultados(resultados);

            
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException n) {
            n.printStackTrace();
        }
    }
    private static void mostrarResultados(ResultSet resultados) throws SQLException {
        ResultSetMetaData metaData = resultados.getMetaData();
        int numeroColumnas = metaData.getColumnCount();
        System.out.println("\nResultados:\n");
        for (int i = 1; i <= numeroColumnas; i++)
            System.out.printf("%-15s\t", metaData.getColumnName(i));
        System.out.println();
        while (resultados.next()) {
            for (int i = 1; i <= numeroColumnas; i++)
                System.out.printf("%-15s\t", resultados.getObject(i));
            System.out.println();
        }
    }
    
}
