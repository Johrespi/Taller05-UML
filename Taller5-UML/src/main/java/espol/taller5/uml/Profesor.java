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
class Profesor extends Usuario {
    ArrayList<Curso> cursosACargo;

    public Profesor(String usuario, String contrasena, String nombre, String apellido, ArrayList<Indicente> incidentes) {
        super(usuario, contrasena, nombre, apellido, incidentes);
        this.cursosACargo = new ArrayList<>();
    }
    
    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
        //Logic implementation
    }
    public void calificarActividadSumativa(Curso curso,Estudiante estudiante, ActividadSumativa actividadSumativa){
        //Logic implementation
    }
    public void aceptarInscripcion(Curso curso, String usuarioEstudiante){
        //Logic implementation
    }
    public void crearNuevoForo(Foro foro){
        //Logic implementation
    }

    public ArrayList<Curso> getCursosACargo() {
        return cursosACargo;
    }

    public void setCursosACargo(ArrayList<Curso> cursosACargo) {
        this.cursosACargo = cursosACargo;
    }
    
    
}
