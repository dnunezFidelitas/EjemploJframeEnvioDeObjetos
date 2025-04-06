/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplojframeenviodeobjetos;

/**
 *
 * @author viti
 */
public class Estudiante {
    
    private String codigo;
    private String nombre;
    private String direccion;
    private Universidad universidad;

    public Estudiante() {
    }

    public Estudiante(String codigo, String nombre, String direccion, Universidad universidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.universidad = universidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", universidad=" + universidad + '}'+"\n";
    }
    
    
}
