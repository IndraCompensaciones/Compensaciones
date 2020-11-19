/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.co.claro.compensaciones.persistencia.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author pradod
 */
@Entity
@Table(name = "COMP_TIPO_ORIGEN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompTipoOrigen.findAll",
            query = "SELECT c FROM CompTipoOrigen c")
    ,
    @NamedQuery(name = "CompTipoOrigen.findByIdTipoOrigen",
            query = "SELECT c FROM CompTipoOrigen c WHERE c.idTipoOrigen = :idTipoOrigen")
    , 
    @NamedQuery(name = "CompTipoOrigen.findByNomTipoOrigen",
            query = "SELECT c FROM CompTipoOrigen c WHERE c.nomTipoOrigen = :nomTipoOrigen")
    , 
    @NamedQuery(name = "CompTipoOrigen.findByDescripcion",
            query = "SELECT c FROM CompTipoOrigen c WHERE c.descripcion = :descripcion")
    ,
    @NamedQuery(name = "CompTipoOrigen.findByEstado",
            query = "SELECT c FROM CompTipoOrigen c WHERE c.estado = :estado")
//     ,
//    @NamedQuery(name = "CompTipoOrigen.findByNombreDescripcion",
//            query = "SELECT c.nomTipoOrigen, c.descripcion FROM CompTipoOrigen c "
//                    + " WHERE c.nomTipoOrigen = :nomTipoOrigen AND "
//                    + "c.descripcion = :descripcion ")
})

public class CompTipoOrigen implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipoOrigen")
    private Collection<CompCausas> compCausasCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_TIPO_ORIGEN")
    @SequenceGenerator(name = "COMP_TIPO_ORIGEN_SEQ",
            sequenceName = "COMP_TIPO_ORIGEN_SEQ",
            initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "COMP_TIPO_ORIGEN_SEQ")
    private Long idTipoOrigen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NOM_TIPO_ORIGEN")
    private String nomTipoOrigen;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "COMPENSA")
    private Long compensa;
    @Column(name = "ESTADO")
    private Long estado;
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "FECHA_MODIFICACION")
    private Date fechaModificacion;
    
    
    public CompTipoOrigen() {
    }

    public CompTipoOrigen(Long idTipoOrigen) {
        this.idTipoOrigen = idTipoOrigen;
    }

    public CompTipoOrigen(Long idTipoOrigen, String nomTipoOrigen, 
            String descripcion, Long compensa, Long estado, String usuario,
            Date fechaModificacion) {
        this.idTipoOrigen = idTipoOrigen;
        this.nomTipoOrigen = nomTipoOrigen;
        this.descripcion = descripcion;
        this.compensa = compensa;
        this.estado = estado;
        this.usuario = usuario;
        this.fechaModificacion = fechaModificacion;
    }

    public Long getIdTipoOrigen() {
        return idTipoOrigen;
    }

    public void setIdTipoOrigen(Long idTipoOrigen) {
        this.idTipoOrigen = idTipoOrigen;
    }

    public String getNomTipoOrigen() {
        return nomTipoOrigen;
    }

    public void setNomTipoOrigen(String nomTipoOrigen) {
        this.nomTipoOrigen = nomTipoOrigen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Long getCompensa() {
        return compensa;
    }

    public void setCompensa(Long compensa) {
        this.compensa = compensa;
    }

    public Long getEstado() {
        return estado;
    }

    public void setEstado(Long estado) {
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    
    

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoOrigen != null ? idTipoOrigen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompTipoOrigen)) {
            return false;
        }
        CompTipoOrigen other = (CompTipoOrigen) object;
        if ((this.idTipoOrigen == null && other.idTipoOrigen != null)
                || (this.idTipoOrigen != null
                && !this.idTipoOrigen.equals(other.idTipoOrigen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.compensaciones.entity.CompTipoOrigen[ idTipoOrigen="
                + idTipoOrigen + " ]";
    }

    @XmlTransient
    public Collection<CompCausas> getCompCausasCollection() {
        return compCausasCollection;
    }

    public void setCompCausasCollection(Collection<CompCausas> compCausasCollection) {
        this.compCausasCollection = compCausasCollection;
    }

}
