package com.umg.cafe_db.entities;
import jakarta.persistence.*;
import jakarta.persistence.Id;

@Entity
public class Presentacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPresentacion;

    @Column(nullable = false, unique = true)
    private String nombrePresentacion;

    // Constructores, Getters y Setters...
    public Presentacion() {
    }

    public Presentacion(Integer idPresentacion, String nombrePresentacion) {
        this.idPresentacion = idPresentacion;
        this.nombrePresentacion = nombrePresentacion;
    }

    public Integer getIdPresentacion() {
        return idPresentacion;
    }

    public void setIdPresentacion(Integer idPresentacion) {
        this.idPresentacion = idPresentacion;
    }

    public String getNombrePresentacion() {
        return nombrePresentacion;
    }

    public void setNombrePresentacion(String nombrePresentacion) {
        this.nombrePresentacion = nombrePresentacion;
    }
}
