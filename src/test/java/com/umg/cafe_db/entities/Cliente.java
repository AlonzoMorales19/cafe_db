package com.umg.cafe_db.entities;
import jakarta.persistence.*;
import jakarta.persistence.Id;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;

    @Column(nullable = false)
    private String nombre;

    private String correo;

    private String direccion;

    // Constructores, Getters y Setters...
    public Cliente() {
    }

    public Cliente(Integer idCliente, String nombre, String correo, String direccion) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
