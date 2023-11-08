/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.taller5.uml;

import java.util.ArrayList;

/**
 *
 * @author CltControl
 */
public class Usuario {
    protected String usuario;
    protected String contrasena;
    protected String nombre;
    protected String apellido;
    protected ArrayList<Indicente> incidentes;

    public Usuario(String usuario, String contrasena, String nombre, String apellido, ArrayList<Indicente> incidentes) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.incidentes = new ArrayList<>();
    }
    
    public boolean logIn(){
        //Logic implementation
        return true;
    }
    
    public boolean logOut(){
        //Logic implementation
        return true;
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Indicente> getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(ArrayList<Indicente> incidentes) {
        this.incidentes = incidentes;
    }
    
    
    
}
