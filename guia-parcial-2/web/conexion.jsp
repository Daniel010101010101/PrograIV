<%@ page language="java" import="java.sql.*" %>
<%! 
    private Connection obtenerConexion(Connection con) { 
        return con; 
    } 
%>

<%
    Connection conexion = null;
    PreparedStatement st = null;
    
    Class.forName("org.mariadb.jdbc.Driver");
    conexion = DriverManager.getConnection(
            "jdbc:mariadb://localhost:3306/progra4", "root", "admin");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
</body>
</html>
