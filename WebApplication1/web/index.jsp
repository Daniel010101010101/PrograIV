<%-- 
    Document   : index
    Created on : 09-dic-2023, 9:20:25
    Author     : ASUS
--%>
<%@page import="java.util.*"%>
<%@page import="java.text.*"%>
<%String titulo = "Mi primer ejemplo";
String cadena = "Primer ejemplo";%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h3><%=titulo%></h3>
        <%=cadena%>
        <%
            Date fechaActual = new Date();
            DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
            DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            
        %>
        
        <p><%="La fecha actual es: " + formatoFecha.format(fechaActual)%></p>
        <p><%="La hora actual es: " + formatoHora.format(fechaActual)%></p>
        <p><%="El tamaño de la candena: " + cadena + " es: " + cadena.length()%></p>
        
        
           
    </body>
</html>
