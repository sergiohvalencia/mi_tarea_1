/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control_escolar;
import java.util.List;
/**
 *
 * @author svalencia
 */
public class Curso {
    private Materia clave;
    private Maestro numeroEmpleado;
    private Cicloescolar cicloEscolar;
    private int cupo;
    private int salon;
    private List inscritos;

    public Curso(){
        
    }
    public Curso(Materia clave, Maestro numeroEmpleado, Cicloescolar cicloEscolar, int cupo, int salon, List inscritos) {
        this.clave = clave;
        this.numeroEmpleado = numeroEmpleado;
        this.cicloEscolar = cicloEscolar;
        this.cupo = cupo;
        this.salon = salon;
        this.inscritos = inscritos;
    }

    public Cicloescolar getCicloEscolar() {
        return cicloEscolar;
    }

    public void setCicloEscolar(Cicloescolar cicloEscolar) {
        this.cicloEscolar = cicloEscolar;
    }

    public Materia getClave() {
        return clave;
    }

    public void setClave(Materia clave) {
        this.clave = clave;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public List getInscritos() {
        return inscritos;
    }

    public void setInscritos(List inscritos) {
        this.inscritos = inscritos;
    }

    public Maestro getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(Maestro numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public int getSalon() {
        return salon;
    }

    public void setSalon(int salon) {
        this.salon = salon;
    }
    
    
}
