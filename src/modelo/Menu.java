package modelo;

/**
 * @author Gomez Jon Darian, Guardia Lucero Santiago Agustín, Heredia Leandro
 */
public class Menu {
    private int idMenu;
    private String tipoMenu;
    private double costo;
    private Alojamiento alojamiento;
    private boolean activo;

    // Constructores;
    public Menu(String tipoMenu, double costo, Alojamiento alojamiento, boolean activo) {
        this.tipoMenu = tipoMenu;
        this.costo = costo;
        this.alojamiento = alojamiento;
        this.activo = activo;
    }

    public Menu() {
    }

    public Menu(int idMenu, String tipoMenu, double costo, Alojamiento alojamiento, boolean activo) {
        this.idMenu = idMenu;
        this.tipoMenu = tipoMenu;
        this.costo = costo;
        this.alojamiento = alojamiento;
        this.activo = activo;
    }

    // Getters & Setters;
    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public String getTipoMenu() {
        return tipoMenu;
    }

    public void setTipoMenu(String tipoMenu) {
        this.tipoMenu = tipoMenu;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Alojamiento getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
}