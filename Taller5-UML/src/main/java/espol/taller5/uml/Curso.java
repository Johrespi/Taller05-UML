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
class Curso {
    private Profesor profesorResponsable;
    private String id;
    private String nombre;
    private boolean estadoDisponbile;
    private ArrayList<Estudiante> estudiantesInscritos;
    private ArrayList<Foro> foros;
    private ArrayList<Estudiante> estudiantesEnEsperaDeInscripcion;
    private ArrayList<ActividadSumativa> actividadesSumativas;

    public Curso(Profesor profesorResponsable, String id, String nombre, boolean estadoDisponbile, ArrayList<Estudiante> estudiantesInscritos, ArrayList<Foro> foros, ArrayList<Estudiante> estudiantesEnEsperaDeInscripcion, ArrayList<ActividadSumativa> actividadesSumativas) {
        this.profesorResponsable = profesorResponsable;
        this.id = id;
        this.nombre = nombre;
        this.estadoDisponbile = estadoDisponbile;
        this.estudiantesInscritos = new ArrayList<>();
        this.foros = new ArrayList<>();
        this.estudiantesEnEsperaDeInscripcion = new ArrayList<>();
        this.actividadesSumativas = new ArrayList<>();
    }
    
    public void addEstudianteInscrito(Estudiante e){
        this.estudiantesInscritos.add(e);
    }
    
    public void addEstudianteEnEspera(Estudiante e){
        this.estudiantesEnEsperaDeInscripcion.add(e);
    }
    
    public void addForo(Foro f){
        this.foros.add(f);
    }
    
    public void addActividad(ActividadSumativa as){
        this.actividadesSumativas.add(as);
    }
    
    public Profesor getProfesorResponsable() {
        return profesorResponsable;
    }

    public void setProfesorResponsable(Profesor profesorResponsable) {
        this.profesorResponsable = profesorResponsable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstadoDisponbile() {
        return estadoDisponbile;
    }

    public void setEstadoDisponbile(boolean estadoDisponbile) {
        this.estadoDisponbile = estadoDisponbile;
    }

    public ArrayList<Estudiante> getEstudiantesInscritos() {
        return estudiantesInscritos;
    }

    public void setEstudiantesInscritos(ArrayList<Estudiante> estudiantesInscritos) {
        this.estudiantesInscritos = estudiantesInscritos;
    }

    public ArrayList<Foro> getForos() {
        return foros;
    }

    public void setForos(ArrayList<Foro> foros) {
        this.foros = foros;
    }

    public ArrayList<Estudiante> getEstudiantesEnEsperaDeInscripcion() {
        return estudiantesEnEsperaDeInscripcion;
    }

    public void setEstudiantesEnEsperaDeInscripcion(ArrayList<Estudiante> estudiantesEnEsperaDeInscripcion) {
        this.estudiantesEnEsperaDeInscripcion = estudiantesEnEsperaDeInscripcion;
    }

    public ArrayList<ActividadSumativa> getActividadesSumativas() {
        return actividadesSumativas;
    }

    public void setActividadesSumativas(ArrayList<ActividadSumativa> actividadesSumativas) {
        this.actividadesSumativas = actividadesSumativas;
    }
    
    
    
}
