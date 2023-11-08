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
public class PersonalAcademico extends Usuario {

    public PersonalAcademico(String usuario, String contrasena, String nombre, String apellido, ArrayList<Indicente> incidentes) {
        super(usuario, contrasena, nombre, apellido, incidentes);
    }
    
    
    public void reportarError(String email, String contenido) {
        //Logic implementation

    }
    public void solicitarAsesoramientoDelSistema(String email, String contenido) {
        //Logic implementation

    }
    public void comentarEnForo(Foro foro, String comentario) {
        //Logic implementation

    }
}
