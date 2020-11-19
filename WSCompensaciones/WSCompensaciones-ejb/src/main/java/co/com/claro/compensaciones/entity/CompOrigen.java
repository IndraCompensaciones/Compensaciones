/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.compensaciones.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pradod
 */
@Entity
@Table(name = "COMP_ORIGEN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompOrigen.findAll",
            query = "SELECT c FROM CompOrigen c")
    , @NamedQuery(name = "CompOrigen.findByIdOrigen",
            query = "SELECT c FROM CompOrigen c WHERE c.idOrigen = :idOrigen")
    , @NamedQuery(name = "CompOrigen.findByNomOrigen",
            query = "SELECT c FROM CompOrigen c WHERE c.nomOrigen = :nomOrigen")
    , @NamedQuery(name = "CompOrigen.findByDescripcion",
            query = "SELECT c FROM CompOrigen c WHERE c.descripcion = :descripcion")
    , @NamedQuery(name = "CompOrigen.findByEstado",
            query = "SELECT c FROM CompOrigen c WHERE c.estado = :estado")
})
public class CompOrigen implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ORIGEN")
    private Long idOrigen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NOM_ORIGEN")
    private String nomOrigen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESTADO")
    private Long estado;

    public CompOrigen() {
    }

    public CompOrigen(Long idOrigen) {
        this.idOrigen = idOrigen;
    }

    public CompOrigen(Long idOrigen, String nomOrigen, String descripcion,
            Long estado) {
        this.idOrigen = idOrigen;
        this.nomOrigen = nomOrigen;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Long getIdOrigen() {
        return idOrigen;
    }

    public void setIdOrigen(Long idOrigen) {
        this.idOrigen = idOrigen;
    }

    public String getNomOrigen() {
        return nomOrigen;
    }

    public void setNomOrigen(String nomOrigen) {
        this.nomOrigen = nomOrigen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getEstado() {
        return estado;
    }

    public void setEstado(Long estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOrigen != null ? idOrigen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompOrigen)) {
            return false;
        }
        CompOrigen other = (CompOrigen) object;
        if ((this.idOrigen == null && other.idOrigen != null) || (this.idOrigen != null && !this.idOrigen.equals(other.idOrigen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.compensaciones.entity.CompOrigen[ idOrigen=" + idOrigen + " ]";
    }

}
