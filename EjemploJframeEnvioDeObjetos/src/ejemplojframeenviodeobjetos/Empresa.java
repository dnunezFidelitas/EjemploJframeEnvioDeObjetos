/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplojframeenviodeobjetos;

/**
 *
 * @author viti
 */
public class Empresa {
    private String id;
    private String nombreEmpresa;
    private EstadoEmpresa estado;

    public Empresa() {
    }

    public Empresa(String id, String nombreEmpresa, EstadoEmpresa estado) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.estado = estado;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public EstadoEmpresa getEstado() {
        return estado;
    }

    public void setEstado(EstadoEmpresa estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Empresa{" + "id=" + id + ", nombreEmpresa=" + nombreEmpresa + ", estado=" + estado + '}' +"\n";
    }
    
}
