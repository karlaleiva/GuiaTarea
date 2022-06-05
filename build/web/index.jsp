<%-- 
    Document   : index
    Created on : 06-02-2022, 06:10:43 PM
    Author     : MINEDUCYT
--%>

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
       
        <h1>REGISTRAR DATOS </h1>
        <form action="registrardatos.do" method="POST">  
        <table border="1" cellpadding="3" cellspacing="3" bgcolor="green">
         <tr>
        <td align="right"> Dui: </td> 
        <td><input type="text" name="dui"></td> 
        </tr>   
        <tr>  
        <td align="right"> Apellido: </td> 
        <td> <input type="text" name="apellido"> </td> 
        </tr> 
        <tr>  
        <td align="right"> Nombre: </td> 
        <td> <input type="text" name="nombre"> </td> 
        </tr>   
        </table>
        </form>
        
        <form action="mostrar.do" method="POST">
            <input type="submit" value="Mostrar"/>
        </form>
            <nav aria-label="breadcrumb">
            <ol class="breadcrumb">
            </nav>
        <a href="/GuiaTarea/DatoEliminar.jsp">Eliminar</a>
        <a href="/GuiaTarea/DatoModificar.jsp">Modificar</a>
    </body>
</html>
