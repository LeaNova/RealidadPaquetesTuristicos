package modelo;

import java.time.LocalDate;

/**
 * @author Gomez Jon Darian, Guardia Lucero Santiago Agustín, Heredia Leandro
 */
public class Transporte {
    private int idTransporte;
    private String tipodetransporte;
    private String destino;
    private LocalDate fechallegada;
    private LocalDate fechapartida;
    private double costo;
    private boolean activo;

    // Constructores
    public Transporte() {
    }

    public Transporte(String tipodetransporte, String destino, LocalDate fechallegada, LocalDate fechapartida, double costo, boolean activo) {
        this.tipodetransporte = tipodetransporte;
        this.destino = destino;
        this.fechallegada = fechallegada;
        this.fechapartida = fechapartida;
        this.costo = costo;
        this.activo = activo;
    }

    public Transporte(int idTransporte, String tipodetransporte, String destino, LocalDate fechallegada, LocalDate fechapartida, double costo, boolean activo) {
        this.idTransporte = idTransporte;
        this.tipodetransporte = tipodetransporte;
        this.destino = destino;
        this.fechallegada = fechallegada;
        this.fechapartida = fechapartida;
        this.costo = costo;
        this.activo = activo;
    }

    // Getters & Setters
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

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    
    public LocalDate getFechallegada() {
        return fechallegada;
    }

    public void setFechallegada(LocalDate fechallegada) {
        this.fechallegada = fechallegada;
    }

    public LocalDate getFechapartida() {
        return fechapartida;
    }

    public void setFechapartida(LocalDate fechapartida) {
        this.fechapartida = fechapartida;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return tipodetransporte + "\n";
    }

    @Override
    public int hashCode() {
        return this.idTransporte;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Transporte)) {
            return false;
        } else {
            
            Transporte viene = (Transporte)obj;
            return this.idTransporte == viene.idTransporte;
        }
    }
}