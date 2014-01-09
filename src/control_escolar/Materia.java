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
public class Materia {
    private int clave;
    private String descripcion;
    private int grado;
    private List cursos;

    public Materia(){
        
    }
    public Materia(int clave, String descripcion, int grado, List cursos) {
        this.clave = clave;
        this.descripcion = descripcion;
        this.grado = grado;
        this.cursos = cursos;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public List getCursos() {
        return cursos;
    }

    public void setCursos(List cursos) {
        this.cursos = cursos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }
            
    
    
}
