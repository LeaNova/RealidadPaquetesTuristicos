package modelo;

/**
 * @author Gomez Jon Darian, Guardia Lucero Santiago Agustín, Heredia Leandro
 */
public class Alojamiento {
    private int idAlojamiento;
    private String nombre;
    private String tipoAlojamiento;
    private String ubicacion;
    private double costo;
    private Menu menu;
    private Destino destino;
    private boolean activo;

    public Alojamiento() {
        
    }

    public Alojamiento(String nombre, String tipoAlojamiento, String ubicacion, double costo, Menu menu, Destino destino, boolean activo) {
        this.nombre = nombre;
        this.tipoAlojamiento = tipoAlojamiento;
        this.ubicacion = ubicacion;
        this.costo = costo;
        this.menu = menu;
        this.destino = destino;
        this.activo = activo;
    }

    public Alojamiento(int idAlojamiento, String nombre, String tipoAlojamiento, String ubicacion, double costo, Menu menu, Destino destino, boolean activo) {
        this.idAlojamiento = idAlojamiento;
        this.nombre = nombre;
        this.tipoAlojamiento = tipoAlojamiento;
        this.ubicacion = ubicacion;
        this.costo = costo;
        this.menu = menu;
        this.destino = destino;
        this.activo = activo;
    }

    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAlojamiento() {
        return tipoAlojamiento;
    }

    public void setTipoAlojamiento(String tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
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
