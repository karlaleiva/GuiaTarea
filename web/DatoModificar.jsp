<%-- 
    Document   : DatoModificar
    Created on : 06-02-2022, 07:57:49 PM
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
        
        <h1>Ingrese los registros a modificar</h1>
        
        <form action="modificar.do" method="POST">
        <table border="1" cellpadding="3" cellspacing="3" bgcolor="Teal">
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
        <input type="submit" value="Modificar"/>
        </form>
    </body>
</html>


