
package com.Tienda.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data //Para la creacion automatica de los set y get de los atributos
@Entity //Para que la clase sea una entidad
@Table(name = "categoria")
public class Categoria implements Serializable {
    
    private static final long serialVersionUID = 1l;
    
    // @Column(name = "id_categoria") ...para cambiar el nombre, se debe realizar un import...
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria; //hiberlat cuando transforma a la base, lo transforma en id_categoria
    private String descripcion;
    private String rutaImagen;  
    private boolean activo;
    
    public Categoria() {}

    public Categoria(String descripcion, String rutaImagen, boolean activo) {
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
    
}
