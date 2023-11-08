/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.taller5.uml;

import java.util.Date;

/**
 *
 * @author CltControl
 */
public class Tarea extends ActividadSumativa {
    private Date fechaDePublicacion;

    public Tarea(Curso curso, String titulo, Date fechaDeEntrega, float puntajeMaximo, String contenido, float calificacion, String id, Date fechaDePublicacion) {
        super(curso, titulo, fechaDeEntrega, puntajeMaximo, contenido, calificacion, id);
        this.fechaDePublicacion = fechaDePublicacion;
    }
    
}
