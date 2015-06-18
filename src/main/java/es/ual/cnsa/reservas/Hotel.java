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
@Table(name = "hotel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hotel.findAll", query = "SELECT h FROM Hotel h"),
    @NamedQuery(name = "Hotel.findById", query = "SELECT h FROM Hotel h WHERE h.id = :id"),
    @NamedQuery(name = "Hotel.findByCodpostal", query = "SELECT h FROM Hotel h WHERE h.codpostal = :codpostal"),
    @NamedQuery(name = "Hotel.findByNombre", query = "SELECT h FROM Hotel h WHERE h.nombre = :nombre"),
    @NamedQuery(name = "Hotel.findByCategoria", query = "SELECT h FROM Hotel h WHERE h.categoria = :categoria"),
    @NamedQuery(name = "Hotel.findByLocalidad", query = "SELECT h FROM Hotel h WHERE h.localidad = :localidad"),
    @NamedQuery(name = "Hotel.findByDomicilio", query = "SELECT h FROM Hotel h WHERE h.domicilio = :domicilio"),
    @NamedQuery(name = "Hotel.findByTelefono", query = "SELECT h FROM Hotel h WHERE h.telefono = :telefono"),
    @NamedQuery(name = "Hotel.findByDescripcion", query = "SELECT h FROM Hotel h WHERE h.descripcion = :descripcion"),
    @NamedQuery(name = "Hotel.findByProvincia", query = "SELECT h FROM Hotel h WHERE h.provincia = :provincia"),
    @NamedQuery(name = "Hotel.findByVersion", query = "SELECT h FROM Hotel h WHERE h.version = :version"),
    @NamedQuery(name = "Hotel.findByAdministradorId", query = "SELECT h FROM Hotel h WHERE h.administradorId = :administradorId")})
public class Hotel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Size(max = 255)
    @Column(name = "CODPOSTAL")
    private String codpostal;
    @Size(max = 255)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 255)
    @Column(name = "CATEGORIA")
    private String categoria;
    @Size(max = 255)
    @Column(name = "LOCALIDAD")
    private String localidad;
    @Size(max = 255)
    @Column(name = "DOMICILIO")
    private String domicilio;
    @Size(max = 255)
    @Column(name = "TELEFONO")
    private String telefono;
    @Size(max = 255)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Size(max = 255)
    @Column(name = "PROVINCIA")
    private String provincia;
    @Column(name = "VERSION")
    private Integer version;
    @Column(name = "ADMINISTRADOR_ID")
    private BigInteger administradorId;

    public Hotel() {
    }

    public Hotel(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public BigInteger getAdministradorId() {
        return administradorId;
    }

    public void setAdministradorId(BigInteger administradorId) {
        this.administradorId = administradorId;
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
        if (!(object instanceof Hotel)) {
            return false;
        }
        Hotel other = (Hotel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "es.ual.cnsa.reservas.Hotel[ id=" + id + " ]";
    }
    
}
