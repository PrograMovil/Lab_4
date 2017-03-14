
package LogicaNegocio;


import java.io.Serializable;

public class Usuario implements Serializable{
    
    private String id;
    private String clave;

    public Usuario(String id, String clave) {
        this.id = id;
        this.clave = clave;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
