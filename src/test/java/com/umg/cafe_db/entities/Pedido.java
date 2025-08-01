package com.umg.cafe_db.entities;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
import java.time.LocalDateTime;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPedido;

    @Column(nullable = false)
    private LocalDateTime fechaCreado;

    @Column(nullable = false)
    private String estado;

    @Column(nullable = false)
    @Positive(message = "La cantidad debe ser mayor que cero")
    private int cantidad;

    @Column(nullable = false)
    @Min(value = 0, message = "El precio de venta no puede ser negativo")
    private double precioVenta;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    // Constructores, Getters y Setters...
    public Pedido() {
        this.fechaCreado = LocalDateTime.now();
        this.estado = "pendiente";
    }

    public Pedido(Integer idPedido, LocalDateTime fechaCreado, String estado, int cantidad,
                  double precioVenta, Producto producto, Cliente cliente) {
        this.idPedido = idPedido;
        this.fechaCreado = fechaCreado;
        this.estado = estado;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.producto = producto;
        this.cliente = cliente;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public LocalDateTime getFechaCreado() {
        return fechaCreado;
    }

    public void setFechaCreado(LocalDateTime fechaCreado) {
        this.fechaCreado = fechaCreado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

