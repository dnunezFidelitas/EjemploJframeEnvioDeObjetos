/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplojframeenviodeobjetos;

/**
 *
 * @author viti
 */
public class Universidad {
    private String nombre;
    private int codigo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Universidad{" + "nombre=" + nombre + ", codigo=" + codigo + '}';
    }

    public Universidad() {
    }

    public Universidad(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
}
