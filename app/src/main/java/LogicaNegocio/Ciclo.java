
package LogicaNegocio;

import java.io.Serializable;
import java.util.Date;


public class Ciclo implements Serializable{
    private int anio;
    private int numero;

    public Ciclo(int anio, int numero) {
        this.anio = anio;
        this.numero = numero;
    }

    public Ciclo() {
        this.anio = 0;
        this.numero = 0;
    }
    

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }



    
    
    
}
