package modelo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author Gomez Jon Darian, Guardia Lucero Santiago Agustín, Heredia Leandro
 */
public class Paquete {
    private int idPaquete;
    private Cliente cliente;
    private Transporte transporte;
    private Alojamiento alojamiento;
    private Menu menu;
    private Destino destino;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private double costoTotal;
    private boolean activo;
    
    // Constructores;
    public Paquete(Cliente cliente, Transporte transporte, Alojamiento alojamiento, Menu menu, Destino destino, LocalDate fechaInicio, LocalDate fechaFinal, boolean activo) {
        this.cliente = cliente;
        this.transporte = transporte;
        this.alojamiento = alojamiento;
        this.menu = menu;
        this.destino = destino;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.costoTotal = calcularPrecio();
        this.activo = activo;
    }

    public Paquete() {
    }

    public Paquete(int idPaquete, Cliente cliente, Transporte transporte, Alojamiento alojamiento, Menu menu, Destino destino, LocalDate fechaInicio, LocalDate fechaFinal, boolean activo) {
        this.idPaquete = idPaquete;
        this.cliente = cliente;
        this.transporte = transporte;
        this.alojamiento = alojamiento;
        this.menu = menu;
        this.destino = destino;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.costoTotal = calcularPrecio();
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

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
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
    
    // Calculadores;
    private int calcularDias() {
        int dias = (int) ChronoUnit.DAYS.between(fechaInicio, fechaFinal);
        
        return dias;
    }
    
    public double obtenerAdicional() {
        int mes = fechaInicio.getMonth().getValue();
        switch (mes) {
            case 1:
            case 7:
                return 1.30;
            case 2:
            case 6:
                return 1.15;
            default:
                return 1;
        }
    }
    
    private double calcularPrecio() {
        double total = transporte.getCosto() + (alojamiento.getCosto() * calcularDias()) + menu.getCosto();
        
        return total * obtenerAdicional();
    }

    @Override
    public String toString() {
        return "ID del paquete: "+idPaquete + ", destino: " + destino;
    }
}