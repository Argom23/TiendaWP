
package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="producto")
public class Producto implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto; // Hibernate Transforma el id en producto
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private String rutaImagen;
    private boolean activo;
    // private Long idCategoria;
    
    @ManyToOne
    @JoinColumn(name="id_categoria")
    Categoria categoria;
    
    public Producto() {
    }

    public Producto(String descripcion, String detalle, double precio, int existencias, String rutaImagen, boolean activo, Long idCategoria) {
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
        // this.idCategoria = idCategoria;
    }

    
    
    
    
}
