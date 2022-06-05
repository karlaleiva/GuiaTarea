
package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Persona {

int dui;
String apellido;
int nombre;

Connection cnn;
Statement state;
ResultSet result;
    
    public Persona() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tb_recursohumano?zeroDateTimeBehavior=convertToNull");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
     }

     public Persona(int dui, String apellido, int nombre) {
        this.dui = dui;
        this.apellido = apellido;
        this.nombre = nombre;
    }

 public boolean insertarDatos(){
        try {
            String miQuery = "insert into tb_categoria values('" + dui + "', '" + apellido + "', '" + nombre + "');";
            int nombre = 0;
            state = cnn.createStatement();
            nombre = state.executeUpdate(miQuery);
            if (nombre == 1){
                return true;
            }
        }catch (SQLException ex) {
            Logger.getLogger(Persona.class.getName()) .log(Level.SEVERE, null, ex);
        }
        return false;
    }
 
 public ArrayList<Persona> consultarRegistros(){
        ArrayList<Persona> Persona = new ArrayList();
        
        try{
            String miQuery = "select * from tb_persona;";
            state = cnn.createStatement();
            result = state.executeQuery(miQuery);
            while(result.next()){
                
                Persona.add(new Persona(result.getInt("dui_persona"), result.getString("apellido_persona"), result.getInt("nombre_persona")));
            }
        }catch (SQLException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Persona;
    }
 
 public boolean EliminarRegistro (){
        try {
            String miQuery = "delete from tb_persona where dui_persona = ('"+dui+"');";
            int nombre = 0;
            state = cnn.createStatement();
            nombre = state.executeUpdate(miQuery);
            if(nombre == 1){
                return true;
            }
        }catch (SQLException ex){
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
 public boolean ModificarRegistro(){
        try {
            String miQuery = "update tb_persona set dui_persona =('"+dui+"'), apellido_Persona =('"+apellido+"'), nombre_persona = ('"+nombre+"');";
            int estado = 0;
            state = cnn.createStatement();
            nombre = state.executeUpdate(miQuery);
            if (nombre == 1){
                return true;
            }
        }catch (SQLException ex) {
            Logger.getLogger(Persona.class.getName()) .log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public int getDui() {
        return dui;
    }

    public void setDui(int dui) {
        this.dui = dui;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
 
}

    
    

