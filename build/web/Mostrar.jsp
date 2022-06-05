<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <style>
            body{
                background-color: magenta; 
            }
           </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Todos Los Registros</h1>
        <c:forEach var="listaTotal" items="${Tarea.persona}">
        Dui:&{listaTotal.dui}<br>
        Apellido:${listaTotal.apellido}<br>
        Nombre:${listaTotal.nombre}<br>
        </c:forEach>
        
    </body>
</html>
