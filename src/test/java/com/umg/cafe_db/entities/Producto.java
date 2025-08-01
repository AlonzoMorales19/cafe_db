package com.umg.cafe_db.entities;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProducto;

    @ManyToOne
    @JoinColumn(name = "id_tipo", nullable = false)
    private Tipo tipo;

    @ManyToOne
    @JoinColumn(name = "id_presentacion")
    private Presentacion presentacion;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    @Column(nullable = false)
    @Min(value = 0, message = "El precio de compra no puede ser negativo")
    private double precioCompra;

    @Column(nullable = false)
    @Min(value = 0, message = "La existencia no puede ser negativa")
    private int existencia;

    // Constructores, Getters y Setters...
    public Producto() {
    }

    public Producto(Integer idProducto, Tipo tipo, Presentacion presentacion, Categoria categoria,
                    double precioCompra, int existencia) {
        this.idProducto = idProducto;
        this.tipo = tipo;
        this.presentacion = presentacion;
        this.categoria = categoria;
        this.precioCompra = precioCompra;
        this.existencia = existencia;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Presentacion getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(Presentacion presentacion) {
        this.presentacion = presentacion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
}
