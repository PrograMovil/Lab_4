
package LogicaNegocio;

import java.util.ArrayList;

public class Grupo {
    
    private int numero;
    private ArrayList<Estudiante> estudiantes;

    public Grupo(int numero) {
        this.numero = numero;
        this.estudiantes = null;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    
}
