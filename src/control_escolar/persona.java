/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control_escolar;
import java.util.Date;
/**
 *
 * @author svalencia
 */
public class persona {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private Date fechaNacimiento;
    
    public persona() {
        
    }

    public persona(String nombre, String primerApellido,
                   String segundoApellido, Date fechaNacimiento) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    

    
}
