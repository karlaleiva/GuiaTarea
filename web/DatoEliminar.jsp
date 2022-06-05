<%-- 
    Document   : DatoEliminar
    Created on : 06-02-2022, 07:56:59 PM
    Author     : MINEDUCYT
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            body{
                background-color: fuchsia; 
            }
           </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Eliminar Registros</h1>
        <h1>Ingrese  registro a Eliminar</h1>
         <form action= "eliminar.do" method="POST">
            <table border="1" cellpadding="3" cellspacing="3" bgcolor="aqua">
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
         <input type="submit" value="Eliminar" />
        </form>
    </body>
</html>

        