
package LogicaNegocio;
import java.util.Date;

public class Estudiante extends Persona {
    private Date fechaNac;
    private Carrera carrera;
    private int notaAdmi;

    public Estudiante(String nombre, String cedula, String telefono, String direccion, String email, Date fechaNac, Carrera carrera, int notaAdmi) {
        super(nombre, cedula, telefono, email, direccion);
        this.fechaNac = fechaNac;
        this.carrera = carrera;
        this.notaAdmi = notaAdmi;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public void setNotaAdmi(int notaAdmi) {
        this.notaAdmi = notaAdmi;
    }
}
