/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control_escolar;

/**
 *
 * @author svalencia
 */
public class Inscripcion {
    private Alumno matricula;
    private Cicloescolar curso;
    private Double primeraCalificacion;
    private Double segundaCalificacion;
    private Double terceraCalificacion;

    public Inscripcion(){
        
    }
    public Inscripcion(Alumno matricula, Cicloescolar curso, Double primeraCalificacion, Double segundaCalificacion, Double terceraCalificacion) {
        this.matricula = matricula;
        this.curso = curso;
        this.primeraCalificacion = primeraCalificacion;
        this.segundaCalificacion = segundaCalificacion;
        this.terceraCalificacion = terceraCalificacion;
    }

    public Cicloescolar getCurso() {
        return curso;
    }

    public void setCurso(Cicloescolar curso) {
        this.curso = curso;
    }

    public Alumno getMatricula() {
        return matricula;
    }

    public void setMatricula(Alumno matricula) {
        this.matricula = matricula;
    }

    public Double getPrimeraCalificacion() {
        return primeraCalificacion;
    }

    public void setPrimeraCalificacion(Double primeraCalificacion) {
        this.primeraCalificacion = primeraCalificacion;
    }

    public Double getSegundaCalificacion() {
        return segundaCalificacion;
    }

    public void setSegundaCalificacion(Double segundaCalificacion) {
        this.segundaCalificacion = segundaCalificacion;
    }

    public Double getTerceraCalificacion() {
        return terceraCalificacion;
    }

    public void setTerceraCalificacion(Double terceraCalificacion) {
        this.terceraCalificacion = terceraCalificacion;
    }
    
    
    
}
