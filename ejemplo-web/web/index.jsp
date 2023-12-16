<%-- 
    Document   : index
    Created on : 09-dic-2023, 10:40:01
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%
    Connection conexion = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    Class.forName("org.mariadb.jdbc.Driver");
    conexion = DriverManager.getConnection("jdbc:mariadb://localhost:3306/progra4","root","admin");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                </tr>
            </thead>
            <tbody>
                <% st = conexion.prepareStatement("select * from estudiante");
                rs = st.executeQuery();
                while(rs.next()){
                %>
                <tr>
                    <td><%=rs.getString("id")%></td>
                    <td><%=rs.getString("nombre")%></td>
                    <td><%=rs.getString("apellido")%></td>
                </tr>
                <% }
                conexion.close();
                %>
            </tbody>
        </table>
    </body>
</html>
