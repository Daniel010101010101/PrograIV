<%@ page import="java.sql.*" %>
<%@ include file="conexion.jsp" %>

<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%            try {
                Connection con = obtenerConexion(conexion);

                String consulta = "SELECT id, nombre, apellido FROM estudiante";
                PreparedStatement ps = con.prepareStatement(consulta);
                ResultSet rs = ps.executeQuery();
        %>
        <form role="form" action="nuevo.jsp" method="POST">
            <input type="text" id="nombre" name="nombre" placeholder="Ingrese los nombres"
                   required><br/>
            <input type="text" id="apellido" name="apellido" placeholder="Ingrese los apellidos"
                   required> <br/>
            <input type="submit" value="Guardar">
        </form>
        <table border="1">
            <tr>
                <th>id</th>
                <th>nombre</th>
                <th>apellido</th>
                <th>materia</th>
            </tr>
            <%
                while (rs.next()) {
            %>
            <tr>
                <td><%= rs.getInt("id")%></td>
                <td><%= rs.getString("nombre")%></td>
                <td><%= rs.getString("apellido")%></td>
                <td><a href='materias.jsp?id=<%=rs.getString("id")%>'>Mostrar Materias</a></td>
                
            </tr>
            <%
                    }

                    rs.close();
                    ps.close();
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            %>
        </table>
    </body>
</html>