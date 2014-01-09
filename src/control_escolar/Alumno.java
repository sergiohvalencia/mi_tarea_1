/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control_escolar;

/**
 *
 * @author svalencia
 */
public class Alumno {

    
    private int matricula;
    private int grado;
    private persona nombre;
    private persona primerApellido;
    private persona segundoApellido;
    
    public Alumno(){
        
    }

   
    public Alumno(int matricula, int grado, persona nombre, persona primerApellido, persona segundoApellido) {
        this.matricula = matricula;
        this.grado = grado;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }
    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    } 
}
