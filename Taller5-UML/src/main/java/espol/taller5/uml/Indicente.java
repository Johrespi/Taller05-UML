/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.taller5.uml;

import java.util.Date;
import java.util.List;

/**
 *
 * @author CltControl
 */
public class Indicente {
    protected Usuario usuario;
    protected int id;
    protected Date fecha_reportador;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected List<String> log_actualizaciones;
    protected Date fecha_cerrado;
    protected String tipo;
}
