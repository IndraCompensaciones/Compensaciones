/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.compensaciones.entity;

import java.io.Serializable;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author millanja
 */
@Entity
@Table(name = "COMP_SINTOMAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompSintomas.findAll", query = "SELECT c FROM CompSintomas c")
    , @NamedQuery(name = "CompSintomas.findByIdSintoma", query = "SELECT c FROM CompSintomas c WHERE c.idSintoma = :idSintoma")
    , @NamedQuery(name = "CompSintomas.findByDescripcion", query = "SELECT c FROM CompSintomas c WHERE c.descripcion = :descripcion")
    , @NamedQuery(name = "CompSintomas.findByEstado", query = "SELECT c FROM CompSintomas c WHERE c.estado = :estado")
    , @NamedQuery(name = "CompSintomas.findByUsuario", query = "SELECT c FROM CompSintomas c WHERE c.usuario = :usuario")
    , @NamedQuery(name = "CompSintomas.findByFechaCreacion", query = "SELECT c FROM CompSintomas c WHERE c.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "CompSintomas.findByIdOrigen", query = "SELECT c FROM CompSintomas c WHERE c.idOrigen = :idOrigen")
    , @NamedQuery(name = "CompSintomas.findByCodSintoma", query = "SELECT c FROM CompSintomas c WHERE c.codSintoma = :codSintoma")
    , @NamedQuery(name = "CompSintomas.findByOrigen", query = "SELECT c FROM CompSintomas c WHERE c.origen = :origen")
    , @NamedQuery(name = "CompSintomas.findByTv", query = "SELECT c FROM CompSintomas c WHERE c.tv = :tv")
    , @NamedQuery(name = "CompSintomas.findByInt1", query = "SELECT c FROM CompSintomas c WHERE c.int1 = :int1")
    , @NamedQuery(name = "CompSintomas.findByTel", query = "SELECT c FROM CompSintomas c WHERE c.tel = :tel")})
public class CompSintomas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SINTOMA")
    @SequenceGenerator(name = "COMP_SINTOMAS_SEQ",
            sequenceName = "COMP_SINTOMAS_SEQ",
            initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO,
            generator = "COMP_SINTOMAS_SEQ")
    private Long idSintoma;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESTADO")
    private Long estado;
    @Size(max = 30)
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ORIGEN")
    private Long idOrigen;
    @Size(max = 255)
    @Column(name = "COD_SINTOMA")
    private String codSintoma;
    @Size(max = 255)
    @Column(name = "ORIGEN")
    private String origen;
    @Size(max = 10)
    @Column(name = "TV")
    private String tv;
    @Size(max = 10)
    @Column(name = "INT")
    private String int1;
    @Size(max = 10)
    @Column(name = "TEL")
    private String tel;

    public CompSintomas() {
    }

    public CompSintomas(Long idSintoma) {
        this.idSintoma = idSintoma;
    }

    public CompSintomas(Long idSintoma, String descripcion, Long estado, String usuario, 
            Date fechaCreacion, Long idOrigen, String codSintoma, String origen, 
            String tv, String int1, String tel) {
        this.idSintoma = idSintoma;
        this.descripcion = descripcion;
        this.estado = estado;
        this.usuario = usuario;
        this.fechaCreacion = fechaCreacion;
        this.idOrigen = idOrigen;
        this.codSintoma = codSintoma;
        this.origen = origen;
        this.tv = tv;
        this.int1 = int1;
        this.tel = tel;
    }



    public Long getIdSintoma() {
        return idSintoma;
    }

    public void setIdSintoma(Long idSintoma) {
        this.idSintoma = idSintoma;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Long getIdOrigen() {
        return idOrigen;
    }

    public void setIdOrigen(Long idOrigen) {
        this.idOrigen = idOrigen;
    }

    public String getCodSintoma() {
        return codSintoma;
    }

    public void setCodSintoma(String codSintoma) {
        this.codSintoma = codSintoma;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getInt1() {
        return int1;
    }

    public void setInt1(String int1) {
        this.int1 = int1;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSintoma != null ? idSintoma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompSintomas)) {
            return false;
        }
        CompSintomas other = (CompSintomas) object;
        if ((this.idSintoma == null && other.idSintoma != null) || (this.idSintoma != null && !this.idSintoma.equals(other.idSintoma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.compensaciones.entity.CompSintomas[ idSintoma=" + idSintoma + " ]";
    }
    
}
