/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplojframeenviodeobjetos;

/**
 *
 * @author viti
 */
public class Datos {
    
    public Empresa empresas [][];
    public Estudiante estudiantes [];
    public Universidad universidad;

    public Datos() {
        // inicialización de datos
        empresas= new Empresa[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                empresas[i][j]=new  Empresa(""+i+j, "nombreEmpresa"+i+"-"+j, EstadoEmpresa.Activo);
            }
        }
        universidad = new Universidad("Fidelita", 0);
        estudiantes= new Estudiante[3];
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i]= new Estudiante(i+"", "Estudiante"+i, "No aplica", universidad);
        }
        
    }

    @Override
    public String toString() {
        String imprimirEmpresa="";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                imprimirEmpresa += empresas[i][j].toString();
            }
        }
        String imprimirEstudiante="";
        for (int i = 0; i < estudiantes.length; i++) {
            imprimirEstudiante+=estudiantes[i].toString();
        }
        
        return "Datos{" + "empresas=\n" + imprimirEmpresa + ", estudiantes=\n" + imprimirEstudiante + ", universidad=" + universidad.toString() + '}';
    }
    
   
    
    
    
    
    
    
}
