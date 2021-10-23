package modelo;

import java.time.LocalDate;

/**
 * @author Gomez Jon Darian, Guardia Lucero Santiago Agustín, Heredia Leandro
 */
public class Paquete {
    private int idPaquete;
    private Cliente cliente;
    private Transporte transporte;
    private Alojamiento alojamiento;
    private Menu menu;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private int cantPersonas;
    private double costoTotal;
    private boolean activo;
    
    // Constructores;
    public Paquete(Cliente cliente, Transporte transporte, Alojamiento alojamiento, Menu menu, LocalDate fechaInicio, LocalDate fechaFinal, int cantPersonas, double costoTotal, boolean activo) {
        this.cliente = cliente;
        this.transporte = transporte;
        this.alojamiento = alojamiento;
        this.menu = menu;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.cantPersonas = cantPersonas;
        this.costoTotal = costoTotal;
        this.activo = activo;
    }

    public Paquete() {
    }

    public Paquete(int idPaquete, Cliente cliente, Transporte transporte, Alojamiento alojamiento, Menu menu, LocalDate fechaInicio, LocalDate fechaFinal, int cantPersonas, double costoTotal, boolean activo) {
        this.idPaquete = idPaquete;
        this.cliente = cliente;
        this.transporte = transporte;
        this.alojamiento = alojamiento;
        this.menu = menu;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.cantPersonas = cantPersonas;
        this.costoTotal = costoTotal;
        this.activo = activo;
    }
    
    // Getters & Setters
    public int getIdPaquete() {
        return idPaquete;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public Alojamiento getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
}