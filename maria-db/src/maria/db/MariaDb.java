package maria.db;

import java.sql.*;
import java.util.Scanner;

public class MariaDb {
    static final String controlador = "org.mariadb.jdbc.Driver";
    static final String urlDB = "jdbc:mariadb://localhost:3306/progra4";

    public static void main(String[] args) {
        
        Connection conexion = null;
        Statement instruccion = null;
        ResultSet resultados = null;

        try {
            Class.forName(controlador);
            conexion = DriverManager.getConnection(urlDB, "root", "admin");
            instruccion = conexion.createStatement();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Seleccione una tabla para ver los registros (estudiante, materia): ");
            String tablaSeleccionada = scanner.nextLine();

            if ("materia".equalsIgnoreCase(tablaSeleccionada)) {
                
                resultados = instruccion.executeQuery("SELECT id, nombre, catedratico, ciclo, uv FROM materia");
                mostrarResultados(resultados);
                
                System.out.println("Ingrese el ID de la materia que desea ver los alumnos inscritos: ");
                int idMateria = scanner.nextInt();
                scanner.nextLine();
                String queryAlumnos = "SELECT estudiante.id, estudiante.nombre FROM estudiante " +
                        "JOIN carga ON estudiante.id = carga.estudiante " +
                        "WHERE carga.materia = " + idMateria;
                resultados = instruccion.executeQuery(queryAlumnos);
                mostrarResultados(resultados);

            } else if ("estudiante".equalsIgnoreCase(tablaSeleccionada)) {
   
                resultados = instruccion.executeQuery("SELECT id, nombre FROM estudiante");
                mostrarResultados(resultados);

              
                System.out.println("Ingrese el ID del estudiante que desea ver las materias: ");
                int idEstudiante = scanner.nextInt();
                scanner.nextLine(); 

             
                String queryMaterias = "SELECT materia.id, materia.nombre FROM materia " +
                        "JOIN carga ON materia.id = carga.materia " +
                        "WHERE carga.estudiante = " + idEstudiante;
                resultados = instruccion.executeQuery(queryMaterias);
                mostrarResultados(resultados);

            } else {
                System.out.println("Tabla no válida. Debe seleccionar 'estudiante' o 'materia'.");
            }

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
