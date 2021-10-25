package modelo;

/**
 * @author Gomez Jon Darian, Guardia Lucero Santiago Agustín, Heredia Leandro
 */
public class Destino {
    private int idDestino;
    private String nombre;
    private String pais;
    private Alojamiento alojamiento;
    private Transporte transporte;
    private boolean activo;

    public Destino() {
        
    }

    public Destino(String nombre, String pais, Alojamiento alojamiento, Transporte transporte, boolean activo) {
        this.nombre = nombre;
        this.pais = pais;
        this.alojamiento = alojamiento;
        this.transporte = transporte;
        this.activo = activo;
    }

    public Destino(int idDestino, String nombre, String pais, Alojamiento alojamiento, Transporte transporte, boolean activo) {
        this.idDestino = idDestino;
        this.nombre = nombre;
        this.pais = pais;
        this.alojamiento = alojamiento;
        this.transporte = transporte;
        this.activo = activo;
    }

    public int getIdDestino() {
        return idDestino;
    }

    public void setIdDestino(int idDestino) {
        this.idDestino = idDestino;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Alojamiento getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
