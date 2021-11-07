package modelo;

import java.time.LocalDate;

/**
 * @author Gomez Jon Darian, Guardia Lucero Santiago Agustín, Heredia Leandro
 */
public class Destino {
    private int idDestino;
    private String nombre;
    private String pais;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private boolean activo;

    // Constructores
    public Destino() {
        
    }

    public Destino(String nombre, String pais, LocalDate fechaInicial, LocalDate fechaFinal, boolean activo) {
        this.nombre = nombre;
        this.pais = pais;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.activo = activo;
    }

    public Destino(int idDestino, String nombre, String pais, LocalDate fechaInicial, LocalDate fechaFinal, boolean activo) {
        this.idDestino = idDestino;
        this.nombre = nombre;
        this.pais = pais;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.activo = activo;
    }
    
    // Getters & Setters
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

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(LocalDate fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "ID: " + idDestino + ", " + nombre + "\n";
    }
    
    @Override
    public boolean equals(Object obj) {
        return this.idDestino == ((Destino)obj).idDestino;
    }
}