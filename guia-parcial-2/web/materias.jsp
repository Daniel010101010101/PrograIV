<%@ page language="java" import="java.sql.*" %>
<%@ include file="conexion.jsp" %>

<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Materias</title>
    </head>
    <body>
        <%
            String estudianteId = request.getParameter("id");
            if (estudianteId != null && !estudianteId.isEmpty()) {
                try {
                    Connection con = obtenerConexion(conexion);

                    // Consulta con INNER JOIN para obtener las materias del estudiante específico
                    String consulta = "SELECT m.id, m.nombre, m.catedratico, m.ciclo " +
                                      "FROM estudiante e " +
                                      "INNER JOIN carga c ON c.estudiante = e.id " +
                                      "INNER JOIN materia m ON m.id = c.materia " +
                                      "WHERE e.id =" + estudianteId;
                    
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(consulta);
        %>
                    <h1>Materias del Estudiante</h1>
                    <table border="1">
                        <tr>
                            <th>ID Materia</th>
                            <th>Nombre Materia</th>
                            <th>Docente</th>
                            <th>Ciclo</th>
                        </tr>
        <%
                    while (rs.next()) {
        %>
                        <tr>
                            <td><%= rs.getInt("id") %></td>
                            <td><%= rs.getString("nombre") %></td>
                            <td><%= rs.getString("catedratico") %></td>
                            <td><%= rs.getString("ciclo") %></td>
                        </tr>
        <%
                    }
        %>
                    </table>
        <%
                    rs.close();
                    stmt.close();
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } else {
                out.println("<p>'id' no proporcionado o inválido.</p>");
            }
        %>
        <a href='index.jsp'>Inicio</a>
    </body>
</html>
