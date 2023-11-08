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
public class Administrador extends Usuario{

    public Administrador(String usuario, String contrasena, String nombre, String apellido, ArrayList<Indicente> incidentes) {
        super(usuario, contrasena, nombre, apellido, incidentes);
    }
    
    public void crearUsuarioConRol(String usuario, String contrasena){
        //Logic implementation

    }
    public void asignarPermiso(String usuario){
        //Logic implementation

    }
    public void actualizarSoftware(){
        //Logic implementation

    }
    public void asignarResponsable(Curso curso, Profesor Responsable){
        //Logic implementation
    }
}
