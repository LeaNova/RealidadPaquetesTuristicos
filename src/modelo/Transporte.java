package modelo;

/**
 * @author Gomez Jon Darian, Guardia Lucero Santiago Agustín, Heredia Leandro
 */
public class Transporte {
    private int idTransporte;
    private String tipodetransporte;
    private String nombre;
    private double costo;
    private Destino destino;
    private boolean activo;

    public Transporte(int idTransporte, String tipodetransporte, String nombre, double costo, Destino destino, boolean activo) {
        this.idTransporte = idTransporte;
        this.tipodetransporte = tipodetransporte;
        this.nombre = nombre;
        this.costo = costo;
        this.destino = destino;
        this.activo = activo;
    }

    public Transporte(String tipodetransporte, String nombre, double costo, Destino destino, boolean activo) {
        this.tipodetransporte = tipodetransporte;
        this.nombre = nombre;
        this.costo = costo;
        this.destino = destino;
        this.activo = activo;
    }

    public Transporte() {
        
    }

    public int getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(int idTransporte) {
        this.idTransporte = idTransporte;
    }

    public String getTipodetransporte() {
        return tipodetransporte;
    }

    public void setTipodetransporte(String tipodetransporte) {
        this.tipodetransporte = tipodetransporte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    
}
