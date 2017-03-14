
package LogicaNegocio;

public class Estudiante extends Persona {
    private String fechaNac;
    private Carrera carrera;
    private int notaAdmi;

    public Estudiante(String nombre, String cedula, String telefono, String direccion, String email, String fechaNac, Carrera carrera, int notaAdmi) {
        super(nombre, cedula, telefono, email, direccion);
        this.fechaNac = fechaNac;
        this.carrera = carrera;
        this.notaAdmi = notaAdmi;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
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

    public int getNotaAdmi() {
        return notaAdmi;
    }
}
