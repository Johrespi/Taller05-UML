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
public class SoporteTecnico extends Usuario {

    public SoporteTecnico(String usuario, String contrasena, String nombre, String apellido, ArrayList<Indicente> incidentes) {
        super(usuario, contrasena, nombre, apellido, incidentes);
    }
        public void brindarAsistencia(Usuario usuario){
        //Logic implementation

    }
        public void resolverProblemaTecnico(Usuario usuario){
        //Logic implementation

    }
        public void derivarProblemaDeGestion(Administrador administrador){
        //Logic implementation

    }
}
