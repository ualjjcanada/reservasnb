/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package es.ual.cnsa.reservas;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Joaquin
 */
@Entity
@Table(name = "reserva")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reserva.findAll", query = "SELECT r FROM Reserva r"),
    @NamedQuery(name = "Reserva.findById", query = "SELECT r FROM Reserva r WHERE r.id = :id"),
    @NamedQuery(name = "Reserva.findByOcupacion", query = "SELECT r FROM Reserva r WHERE r.ocupacion = :ocupacion"),
    @NamedQuery(name = "Reserva.findByPrecio", query = "SELECT r FROM Reserva r WHERE r.precio = :precio"),
    @NamedQuery(name = "Reserva.findByCantidad", query = "SELECT r FROM Reserva r WHERE r.cantidad = :cantidad"),
    @NamedQuery(name = "Reserva.findByFechafin", query = "SELECT r FROM Reserva r WHERE r.fechafin = :fechafin"),
    @NamedQuery(name = "Reserva.findByNombretomador", query = "SELECT r FROM Reserva r WHERE r.nombretomador = :nombretomador"),
    @NamedQuery(name = "Reserva.findByFechainicio", query = "SELECT r FROM Reserva r WHERE r.fechainicio = :fechainicio"),
    @NamedQuery(name = "Reserva.findByVersion", query = "SELECT r FROM Reserva r WHERE r.version = :version"),
    @NamedQuery(name = "Reserva.findByTipohabitacionId", query = "SELECT r FROM Reserva r WHERE r.tipohabitacionId = :tipohabitacionId"),
    @NamedQuery(name = "Reserva.findByClienteId", query = "SELECT r FROM Reserva r WHERE r.clienteId = :clienteId")})
public class Reserva implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Column(name = "OCUPACION")
    private Integer ocupacion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECIO")
    private Double precio;
    @Column(name = "CANTIDAD")
    private Integer cantidad;
    @Column(name = "FECHAFIN")
    @Temporal(TemporalType.DATE)
    private Date fechafin;
    @Size(max = 255)
    @Column(name = "NOMBRETOMADOR")
    private String nombretomador;
    @Column(name = "FECHAINICIO")
    @Temporal(TemporalType.DATE)
    private Date fechainicio;
    @Column(name = "VERSION")
    private Integer version;
    @Column(name = "TIPOHABITACION_ID")
    private BigInteger tipohabitacionId;
    @Column(name = "CLIENTE_ID")
    private BigInteger clienteId;

    public Reserva() {
    }

    public Reserva(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(Integer ocupacion) {
        this.ocupacion = ocupacion;
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

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public String getNombretomador() {
        return nombretomador;
    }

    public void setNombretomador(String nombretomador) {
        this.nombretomador = nombretomador;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public BigInteger getTipohabitacionId() {
        return tipohabitacionId;
    }

    public void setTipohabitacionId(BigInteger tipohabitacionId) {
        this.tipohabitacionId = tipohabitacionId;
    }

    public BigInteger getClienteId() {
        return clienteId;
    }

    public void setClienteId(BigInteger clienteId) {
        this.clienteId = clienteId;
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
        if (!(object instanceof Reserva)) {
            return false;
        }
        Reserva other = (Reserva) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.ual.cnsa.reservas.Reserva[ id=" + id + " ]";
    }
    
}
