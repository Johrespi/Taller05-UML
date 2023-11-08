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
public class Estudiante extends PersonalAcademico {
    
    ArrayList<Curso> cursosDelEstudiante;

    public Estudiante(String usuario, String contrasena, String nombre, String apellido, ArrayList<Indicente> incidentes) {
        super(usuario, contrasena, nombre, apellido, incidentes);
        this.cursosDelEstudiante = new ArrayList<>();
    }

    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa){
        //Logic implementation
    }
    
    public void solicitarInscripcionCurso(Curso curso){
        //Logic implementation
    }

    public ArrayList<Curso> getCursosDelEstudiante() {
        return cursosDelEstudiante;
    }

    public void setCursosDelEstudiante(ArrayList<Curso> cursosDelEstudiante) {
        this.cursosDelEstudiante = cursosDelEstudiante;
    }
    
    
}
