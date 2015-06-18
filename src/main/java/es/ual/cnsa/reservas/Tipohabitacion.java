/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ual.cnsa.reservas;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Joaquin
 */
@Entity
@Table(name = "tipohabitacion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipohabitacion.findAll", query = "SELECT t FROM Tipohabitacion t"),
    @NamedQuery(name = "Tipohabitacion.findById", query = "SELECT t FROM Tipohabitacion t WHERE t.id = :id"),
    @NamedQuery(name = "Tipohabitacion.findByNombre", query = "SELECT t FROM Tipohabitacion t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Tipohabitacion.findByPrecio", query = "SELECT t FROM Tipohabitacion t WHERE t.precio = :precio"),
    @NamedQuery(name = "Tipohabitacion.findByCantidad", query = "SELECT t FROM Tipohabitacion t WHERE t.cantidad = :cantidad"),
    @NamedQuery(name = "Tipohabitacion.findByDescripcion", query = "SELECT t FROM Tipohabitacion t WHERE t.descripcion = :descripcion"),
    @NamedQuery(name = "Tipohabitacion.findByCapacidad", query = "SELECT t FROM Tipohabitacion t WHERE t.capacidad = :capacidad"),
    @NamedQuery(name = "Tipohabitacion.findByVersion", query = "SELECT t FROM Tipohabitacion t WHERE t.version = :version"),
    @NamedQuery(name = "Tipohabitacion.findByHotelId", query = "SELECT t FROM Tipohabitacion t WHERE t.hotelId = :hotelId")})
public class Tipohabitacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Size(max = 255)
    @Column(name = "NOMBRE")
    private String nombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECIO")
    private Double precio;
    @Column(name = "CANTIDAD")
    private Integer cantidad;
    @Size(max = 255)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "CAPACIDAD")
    private Integer capacidad;
    @Column(name = "VERSION")
    private Integer version;
    @Column(name = "HOTEL_ID")
    private BigInteger hotelId;

    public Tipohabitacion() {
    }

    public Tipohabitacion(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public BigInteger getHotelId() {
        return hotelId;
    }

    public void setHotelId(BigInteger hotelId) {
        this.hotelId = hotelId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipohabitacion)) {
            return false;
        }
        Tipohabitacion other = (Tipohabitacion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.ual.cnsa.reservas.Tipohabitacion[ id=" + id + " ]";
    }
    
}
