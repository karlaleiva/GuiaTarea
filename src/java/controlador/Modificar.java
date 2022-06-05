/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Persona;

/**
 *
 * @author MINEDUCYT
 */
@WebServlet(name = "Modificar", urlPatterns = {"/modificar.do"})
public class Modificar extends HttpServlet {

     protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int dui = Integer.parseInt(request.getParameter("txtdui")) ;
        String apellido = request.getParameter("txtapellido");
        int nombre = Integer.parseInt(request.getParameter("txtnombre"));
        
        Persona person = new Persona();
        person.setDui(dui);
        person.setApellido(apellido);
        person.setNombre(nombre);
        
        if(person.ModificarRegistro()== true) {
            request.getRequestDispatcher("Modificado.jsp").forward(request, response);
        }else{
            request.getRequestDispatcher("noModificado.jsp").forward(request, response);
        }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
