package modelo;

/**
 * @author Gomez Jon Darian, Guardia Lucero Santiago Agustín, Heredia Leandro
 */
public class Cliente {
    private int idCliente;
    private String nombre;
    private int dni;
    private String contacto;
    private int celular;
    private boolean activo;
    
    // Constructores
    public Cliente() {
    }

    public Cliente(int idCliente, String nombre, int dni, String contacto, int celular, boolean activo) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.dni = dni;
        this.contacto = contacto;
        this.celular = celular;
        this.activo = activo;
    }

    public Cliente(String nombre, int dni, String contacto, int celular, boolean activo) {
        this.nombre = nombre;
        this.dni = dni;
        this.contacto = contacto;
        this.celular = celular;
        this.activo = activo;
    }
    
    // Getters & Setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "ID: " + idCliente + ", Nombre: " + nombre + "\n";
    }
}