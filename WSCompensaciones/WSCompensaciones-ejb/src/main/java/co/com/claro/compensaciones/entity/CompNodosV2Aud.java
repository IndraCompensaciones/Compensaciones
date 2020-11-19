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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pradod
 */
@Entity
@Table(name = "COMP_NODOS_V2_$AUD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompNodosV2Aud.findAll", query = "SELECT c FROM CompNodosV2Aud c")
    , @NamedQuery(name = "CompNodosV2Aud.findByIdNodoAud", query = "SELECT c FROM CompNodosV2Aud c WHERE c.idNodoAud = :idNodoAud")
    , @NamedQuery(name = "CompNodosV2Aud.findByNombreCi", query = "SELECT c FROM CompNodosV2Aud c WHERE c.nombreCi = :nombreCi")
    , @NamedQuery(name = "CompNodosV2Aud.findByEstado", query = "SELECT c FROM CompNodosV2Aud c WHERE c.estado = :estado")
    , @NamedQuery(name = "CompNodosV2Aud.findByPrioridad", query = "SELECT c FROM CompNodosV2Aud c WHERE c.prioridad = :prioridad")
    , @NamedQuery(name = "CompNodosV2Aud.findByCausaInternet", query = "SELECT c FROM CompNodosV2Aud c WHERE c.causaInternet = :causaInternet")
    , @NamedQuery(name = "CompNodosV2Aud.findBySintomaInternet", query = "SELECT c FROM CompNodosV2Aud c WHERE c.sintomaInternet = :sintomaInternet")
    , @NamedQuery(name = "CompNodosV2Aud.findByHorasInternet", query = "SELECT c FROM CompNodosV2Aud c WHERE c.horasInternet = :horasInternet")
    , @NamedQuery(name = "CompNodosV2Aud.findByCausaTelefonia", query = "SELECT c FROM CompNodosV2Aud c WHERE c.causaTelefonia = :causaTelefonia")
    , @NamedQuery(name = "CompNodosV2Aud.findBySintomaTelefonia", query = "SELECT c FROM CompNodosV2Aud c WHERE c.sintomaTelefonia = :sintomaTelefonia")
    , @NamedQuery(name = "CompNodosV2Aud.findByHorasTelefonia", query = "SELECT c FROM CompNodosV2Aud c WHERE c.horasTelefonia = :horasTelefonia")
    , @NamedQuery(name = "CompNodosV2Aud.findByCausaTelevision", query = "SELECT c FROM CompNodosV2Aud c WHERE c.causaTelevision = :causaTelevision")
    , @NamedQuery(name = "CompNodosV2Aud.findBySintomaTelevision", query = "SELECT c FROM CompNodosV2Aud c WHERE c.sintomaTelevision = :sintomaTelevision")
    , @NamedQuery(name = "CompNodosV2Aud.findByHorasTelevision", query = "SELECT c FROM CompNodosV2Aud c WHERE c.horasTelevision = :horasTelevision")
    , @NamedQuery(name = "CompNodosV2Aud.findByEstadoVerificar", query = "SELECT c FROM CompNodosV2Aud c WHERE c.estadoVerificar = :estadoVerificar")
    , @NamedQuery(name = "CompNodosV2Aud.findByUsuarioVerificar", query = "SELECT c FROM CompNodosV2Aud c WHERE c.usuarioVerificar = :usuarioVerificar")
    , @NamedQuery(name = "CompNodosV2Aud.findByFechaVerificar", query = "SELECT c FROM CompNodosV2Aud c WHERE c.fechaVerificar = :fechaVerificar")
    , @NamedQuery(name = "CompNodosV2Aud.findByObservacion", query = "SELECT c FROM CompNodosV2Aud c WHERE c.observacion = :observacion")
    , @NamedQuery(name = "CompNodosV2Aud.findByFechaCreacion", query = "SELECT c FROM CompNodosV2Aud c WHERE c.fechaCreacion = :fechaCreacion")})
public class CompNodosV2Aud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_NODO_$AUD")
    private Long idNodoAud;
    @Size(max = 500)
    @Column(name = "NOMBRE_CI")
    private String nombreCi;
    @Size(max = 10)
    @Column(name = "ESTADO")
    private String estado;
    @Size(max = 10)
    @Column(name = "PRIORIDAD")
    private String prioridad;
    @Size(max = 10)
    @Column(name = "CAUSA_INTERNET")
    private String causaInternet;
    @Size(max = 10)
    @Column(name = "SINTOMA_INTERNET")
    private String sintomaInternet;
    @Size(max = 100)
    @Column(name = "HORAS_INTERNET")
    private String horasInternet;
    @Size(max = 10)
    @Column(name = "CAUSA_TELEFONIA")
    private String causaTelefonia;
    @Size(max = 10)
    @Column(name = "SINTOMA_TELEFONIA")
    private String sintomaTelefonia;
    @Size(max = 100)
    @Column(name = "HORAS_TELEFONIA")
    private String horasTelefonia;
    @Size(max = 10)
    @Column(name = "CAUSA_TELEVISION")
    private String causaTelevision;
    @Size(max = 10)
    @Column(name = "SINTOMA_TELEVISION")
    private String sintomaTelevision;
    @Size(max = 100)
    @Column(name = "HORAS_TELEVISION")
    private String horasTelevision;
    @Size(max = 100)
    @Column(name = "ESTADO_VERIFICAR")
    private String estadoVerificar;
    @Size(max = 100)
    @Column(name = "USUARIO_VERIFICAR")
    private String usuarioVerificar;
    @Column(name = "FECHA_VERIFICAR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVerificar;
    @Size(max = 100)
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    public CompNodosV2Aud() {
    }

    public CompNodosV2Aud(Long idNodoAud) {
        this.idNodoAud = idNodoAud;
    }

    public Long getIdNodoAud() {
        return idNodoAud;
    }

    public void setIdNodoAud(Long idNodoAud) {
        this.idNodoAud = idNodoAud;
    }

    public String getNombreCi() {
        return nombreCi;
    }

    public void setNombreCi(String nombreCi) {
        this.nombreCi = nombreCi;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getCausaInternet() {
        return causaInternet;
    }

    public void setCausaInternet(String causaInternet) {
        this.causaInternet = causaInternet;
    }

    public String getSintomaInternet() {
        return sintomaInternet;
    }

    public void setSintomaInternet(String sintomaInternet) {
        this.sintomaInternet = sintomaInternet;
    }

    public String getHorasInternet() {
        return horasInternet;
    }

    public void setHorasInternet(String horasInternet) {
        this.horasInternet = horasInternet;
    }

    public String getCausaTelefonia() {
        return causaTelefonia;
    }

    public void setCausaTelefonia(String causaTelefonia) {
        this.causaTelefonia = causaTelefonia;
    }

    public String getSintomaTelefonia() {
        return sintomaTelefonia;
    }

    public void setSintomaTelefonia(String sintomaTelefonia) {
        this.sintomaTelefonia = sintomaTelefonia;
    }

    public String getHorasTelefonia() {
        return horasTelefonia;
    }

    public void setHorasTelefonia(String horasTelefonia) {
        this.horasTelefonia = horasTelefonia;
    }

    public String getCausaTelevision() {
        return causaTelevision;
    }

    public void setCausaTelevision(String causaTelevision) {
        this.causaTelevision = causaTelevision;
    }

    public String getSintomaTelevision() {
        return sintomaTelevision;
    }

    public void setSintomaTelevision(String sintomaTelevision) {
        this.sintomaTelevision = sintomaTelevision;
    }

    public String getHorasTelevision() {
        return horasTelevision;
    }

    public void setHorasTelevision(String horasTelevision) {
        this.horasTelevision = horasTelevision;
    }

    public String getEstadoVerificar() {
        return estadoVerificar;
    }

    public void setEstadoVerificar(String estadoVerificar) {
        this.estadoVerificar = estadoVerificar;
    }

    public String getUsuarioVerificar() {
        return usuarioVerificar;
    }

    public void setUsuarioVerificar(String usuarioVerificar) {
        this.usuarioVerificar = usuarioVerificar;
    }

    public Date getFechaVerificar() {
        return fechaVerificar;
    }

    public void setFechaVerificar(Date fechaVerificar) {
        this.fechaVerificar = fechaVerificar;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNodoAud != null ? idNodoAud.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompNodosV2Aud)) {
            return false;
        }
        CompNodosV2Aud other = (CompNodosV2Aud) object;
        if ((this.idNodoAud == null && other.idNodoAud != null) || (this.idNodoAud != null && !this.idNodoAud.equals(other.idNodoAud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.compensaciones.entity.CompNodosV2Aud[ idNodoAud=" + idNodoAud + " ]";
    }
    
}
