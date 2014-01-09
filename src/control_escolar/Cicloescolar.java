/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control_escolar;
import java.util.List;
import java.util.Date;

/**
 *
 * @author svalencia
 */
public class Cicloescolar {
    private int clave;
    private String descripcion;
    private Date fechaInicio;
    private Date fechaFin;
    private List curso;

    public Cicloescolar(int clave, String descripcion, Date fechaInicio, Date fechaFin, List curso) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.curso = curso;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public List getCurso() {
        return curso;
    }

    public void setCurso(List curso) {
        this.curso = curso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    
    
    
    
}
