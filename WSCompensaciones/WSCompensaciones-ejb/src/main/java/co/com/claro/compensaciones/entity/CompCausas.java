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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vargascarr
 */
@Entity
@Table(name = "COMP_CAUSAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompCausas.findAll", query = "SELECT c FROM CompCausas c")
    , @NamedQuery(name = "CompCausas.findByIdCausa", query = "SELECT c FROM CompCausas c WHERE c.idCausa = :idCausa")
    , @NamedQuery(name = "CompCausas.findByCodCausa", query = "SELECT c FROM CompCausas c WHERE c.codCausa = :codCausa")
    , @NamedQuery(name = "CompCausas.findByDescrpcion", query = "SELECT c FROM CompCausas c WHERE c.descrpcion = :descrpcion")
    , @NamedQuery(name = "CompCausas.findByEstado", query = "SELECT c FROM CompCausas c WHERE c.estado = :estado")
    , @NamedQuery(name = "CompCausas.findByIdTipoOrigen", query = "SELECT c FROM CompCausas c WHERE c.idTipoOrigen = :idTipoOrigen")
    , @NamedQuery(name = "CompCausas.findByCausas", query = "SELECT c FROM CompCausas c WHERE c.causas = :causas")
    , @NamedQuery(name = "CompCausas.findByUsuario", query = "SELECT c FROM CompCausas c WHERE c.usuario = :usuario")
    , @NamedQuery(name = "CompCausas.findByFechaCreacion", query = "SELECT c FROM CompCausas c WHERE c.fechaCreacion = :fechaCreacion")
    , @NamedQuery(name = "CompCausas.findByIdOrigen", query = "SELECT c FROM CompCausas c WHERE c.idOrigen = :idOrigen")
    , @NamedQuery(name = "CompCausas.findByIdCodigoAnomalia", query = "SELECT c FROM CompCausas c WHERE c.idCodigoAnomalia = :idCodigoAnomalia")
    , @NamedQuery(name = "CompCausas.findByDescripcionCodigoAnomalia", query = "SELECT c FROM CompCausas c WHERE c.descripcionCodigoAnomalia = :descripcionCodigoAnomalia")
    , @NamedQuery(name = "CompCausas.findByIdProblema", query = "SELECT c FROM CompCausas c WHERE c.idProblema = :idProblema")
    , @NamedQuery(name = "CompCausas.findByDescripcionIdProblema", query = "SELECT c FROM CompCausas c WHERE c.descripcionIdProblema = :descripcionIdProblema")
    , @NamedQuery(name = "CompCausas.findByTv", query = "SELECT c FROM CompCausas c WHERE c.tv = :tv")
    , @NamedQuery(name = "CompCausas.findByInt1", query = "SELECT c FROM CompCausas c WHERE c.int1 = :int1")
    , @NamedQuery(name = "CompCausas.findByTel", query = "SELECT c FROM CompCausas c WHERE c.tel = :tel")
    , @NamedQuery(name = "CompCausas.valExist", query = "SELECT COUNT(c) FROM CompCausas c "
            + "WHERE c.codCausa = :codCausa and c.idProblema = :idProblema and c.idCodigoAnomalia = :idCodigoAnomalia")
})
public class CompCausas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_CAUSA")
    @SequenceGenerator(name = "COMP_CAUSAS_SEQ",
            sequenceName = "COMP_CAUSAS_SEQ",
            initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO,
            generator = "COMP_CAUSAS_SEQ")
    private Long idCausa;
    @Basic(optional = false)
    @NotNull(message = "Debe ingresar Código de Anomalía")
    @Size(message = "Debe ingresar un tamaño exacto", min = 1, max = 255)
    @Pattern(message = "El Código Anomalía no permite caracteres especiales (*,$,#,%,etc...)", regexp = "[^a-zA-Z0-9\\u00f1\\u00d1]+")
    @Column(name = "COD_CAUSA")
    private String codCausa;
    @Basic(optional = false)
    @NotNull(message = "Debe ingresar descrpcion de Anomalía")
    @Size(min = 1, max = 255)
    @Column(name = "DESCRPCION")
    private String descrpcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ESTADO")
    private String estado;
    @Column(name = "CAUSAS")
    private String causas;
    @Size(max = 30)
    @Column(name = "USUARIO")
    private String usuario;
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    @JoinColumn(name = "ID_ORIGEN", referencedColumnName = "ID_ORIGEN")
    @ManyToOne(optional = false)
    private CompOrigen idOrigen;

    @JoinColumn(name = "ID_TIPO_ORIGEN", referencedColumnName = "ID_TIPO_ORIGEN")
    @ManyToOne(optional = false)
    private CompTipoOrigen idTipoOrigen;

    @Column(name = "ID_CODIGO_ANOMALIA")
    private String idCodigoAnomalia;
    @Size(max = 255)
    @Column(name = "DESCRIPCION_CODIGO_ANOMALIA")
    private String descripcionCodigoAnomalia;
    @Basic(optional = false)
    @Size(min = 1, max = 255)
    @Column(name = "ID_PROBLEMA")
    private String idProblema;
    @Size(max = 255)
    @Column(name = "DESCRIPCION_ID_PROBLEMA")
    private String descripcionIdProblema;
    @Size(max = 10)
    @Column(name = "TV")
    private String tv;
    @Size(max = 10)
    @Column(name = "INT")
    private String int1;
    @Size(max = 10)
    @Column(name = "TEL")
    private String tel;

    public CompCausas() {
    }

    public CompCausas(Long idCausa) {
        this.idCausa = idCausa;
    }

    public CompCausas(Long idCausa, String codCausa, String descrpcion, String estado,
            String causas, String usuario, Date fechaCreacion, CompOrigen idOrigen,
            CompTipoOrigen idTipoOrigen, String idCodigoAnomalia,
            String descripcionCodigoAnomalia, String idProblema,
            String descripcionIdProblema, String tv, String int1, String tel) {
        this.idCausa = idCausa;
        this.codCausa = codCausa;
        this.descrpcion = descrpcion;
        this.estado = estado;
        this.causas = causas;
        this.usuario = usuario;
        this.fechaCreacion = fechaCreacion;
        this.idOrigen = idOrigen;
        this.idTipoOrigen = idTipoOrigen;
        this.idCodigoAnomalia = idCodigoAnomalia;
        this.descripcionCodigoAnomalia = descripcionCodigoAnomalia;
        this.idProblema = idProblema;
        this.descripcionIdProblema = descripcionIdProblema;
        this.tv = tv;
        this.int1 = int1;
        this.tel = tel;
    }

    public Long getIdCausa() {
        return idCausa;
    }

    public void setIdCausa(Long idCausa) {
        this.idCausa = idCausa;
    }

    public String getCodCausa() {
        return codCausa;
    }

    public void setCodCausa(String codCausa) {
        this.codCausa = codCausa;
    }

    public String getDescrpcion() {
        return descrpcion;
    }

    public void setDescrpcion(String descrpcion) {
        this.descrpcion = descrpcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public CompTipoOrigen getIdTipoOrigen() {
        return idTipoOrigen;
    }

    public void setIdTipoOrigen(CompTipoOrigen idTipoOrigen) {
        this.idTipoOrigen = idTipoOrigen;
    }

    public String getCausas() {
        return causas;
    }

    public void setCausas(String causas) {
        this.causas = causas;
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

    public CompOrigen getIdOrigen() {
        return idOrigen;
    }

    public void setIdOrigen(CompOrigen idOrigen) {
        this.idOrigen = idOrigen;
    }

    public String getIdCodigoAnomalia() {
        return idCodigoAnomalia;
    }

    public void setIdCodigoAnomalia(String idCodigoAnomalia) {
        this.idCodigoAnomalia = idCodigoAnomalia;
    }

    public String getDescripcionCodigoAnomalia() {
        return descripcionCodigoAnomalia;
    }

    public void setDescripcionCodigoAnomalia(String descripcionCodigoAnomalia) {
        this.descripcionCodigoAnomalia = descripcionCodigoAnomalia;
    }

    public String getIdProblema() {
        return idProblema;
    }

    public void setIdProblema(String idProblema) {
        this.idProblema = idProblema;
    }

    public String getDescripcionIdProblema() {
        return descripcionIdProblema;
    }

    public void setDescripcionIdProblema(String descripcionIdProblema) {
        this.descripcionIdProblema = descripcionIdProblema;
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
        hash += (idCausa != null ? idCausa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompCausas)) {
            return false;
        }
        CompCausas other = (CompCausas) object;
        if ((this.idCausa == null && other.idCausa != null) || (this.idCausa != null && !this.idCausa.equals(other.idCausa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.compensaciones.entity.CompCausas[ idCausa=" + idCausa + " ]";
    }

}
