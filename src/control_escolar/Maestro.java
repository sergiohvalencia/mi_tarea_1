/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control_escolar;

/**
 *
 * @author svalencia
 */
import java.util.List;
public class Maestro {
    
    private int numeroEmpleado;
    private Double salarioMensual;
    private Double grado;
    private Double formadePago;
    private List cursos;
    private persona nombre;
    private persona primerApellido;
    private persona segundoApellido;
    private persona fechaNacimiento;
    
    public Maestro(){
        
    }

    public Maestro(int numeroEmpleado, Double salarioMensual, Double grado, Double formadePago, List cursos, persona nombre, persona primerApellido, persona segundoApellido, persona fechaNacimiento) {
        this.numeroEmpleado = numeroEmpleado;
        this.salarioMensual = salarioMensual;
        this.grado = grado;
        this.formadePago = formadePago;
        this.cursos = cursos;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public List getCursos() {
        return cursos;
    }

    public void setCursos(List cursos) {
        this.cursos = cursos;
    }

    public Double getFormadePago() {
        return formadePago;
    }

    public void setFormadePago(Double formadePago) {
        this.formadePago = formadePago;
    }

    public Double getGrado() {
        return grado;
    }

    public void setGrado(Double grado) {
        this.grado = grado;
    }

    public Double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(Double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }
    
    
}
