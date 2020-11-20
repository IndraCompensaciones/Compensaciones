/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.co.claro.compensaciones.persistencia.entity;

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
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.SequenceGenerator;
import javax.persistence.StoredProcedureParameter;
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
@Table(name = "COMP_NODOS_V2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompNodosV2.findAll", query = "SELECT c FROM CompNodosV2 c")
    , @NamedQuery(name = "CompNodosV2.findByIdNodo", query = "SELECT c FROM CompNodosV2 c WHERE c.idNodo = :idNodo")
    , @NamedQuery(name = "CompNodosV2.findByNombreCi", query = "SELECT c FROM CompNodosV2 c WHERE c.nombreCi = :nombreCi")
    , @NamedQuery(name = "CompNodosV2.findByEstado", query = "SELECT c FROM CompNodosV2 c WHERE c.estado = :estado")
    , @NamedQuery(name = "CompNodosV2.findByPrioridad", query = "SELECT c FROM CompNodosV2 c WHERE c.prioridad = :prioridad")
    , @NamedQuery(name = "CompNodosV2.findByCausaInternet", query = "SELECT c FROM CompNodosV2 c WHERE c.causaInternet = :causaInternet")
    , @NamedQuery(name = "CompNodosV2.findBySintomaInternet", query = "SELECT c FROM CompNodosV2 c WHERE c.sintomaInternet = :sintomaInternet")
    , @NamedQuery(name = "CompNodosV2.findByHorasInternet", query = "SELECT c FROM CompNodosV2 c WHERE c.horasInternet = :horasInternet")
    , @NamedQuery(name = "CompNodosV2.findByCausaTelefonia", query = "SELECT c FROM CompNodosV2 c WHERE c.causaTelefonia = :causaTelefonia")
    , @NamedQuery(name = "CompNodosV2.findBySintomaTelefonia", query = "SELECT c FROM CompNodosV2 c WHERE c.sintomaTelefonia = :sintomaTelefonia")
    , @NamedQuery(name = "CompNodosV2.findByHorasTelefonia", query = "SELECT c FROM CompNodosV2 c WHERE c.horasTelefonia = :horasTelefonia")
    , @NamedQuery(name = "CompNodosV2.findByCausaTelevision", query = "SELECT c FROM CompNodosV2 c WHERE c.causaTelevision = :causaTelevision")
    , @NamedQuery(name = "CompNodosV2.findBySintomaTelevision", query = "SELECT c FROM CompNodosV2 c WHERE c.sintomaTelevision = :sintomaTelevision")
    , @NamedQuery(name = "CompNodosV2.findByHorasTelevision",
            query = "SELECT c FROM CompNodosV2 c "
                  + "WHERE c.horasTelevision = :horasTelevision")
    , @NamedQuery(name = "CompNodosV2.findByEstadoVerificar", 
            query = "SELECT c FROM CompNodosV2 c "
                  + "WHERE c.estadoVerificar IS NULL")
    , @NamedQuery(name = "CompNodosV2.findByUsuarioVerificar", query = "SELECT c FROM CompNodosV2 c WHERE c.usuarioVerificar = :usuarioVerificar")
    , @NamedQuery(name = "CompNodosV2.findByFechaVerificar", query = "SELECT c FROM CompNodosV2 c WHERE c.fechaVerificar = :fechaVerificar")
    , @NamedQuery(name = "CompNodosV2.findByObservacion", query = "SELECT c FROM CompNodosV2 c WHERE c.observacion = :observacion")
})
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
        name = "SP_COMP_NODOS_V2_$AUD",
        procedureName = "SP_COMP_NODOS_V2_$AUD",
        parameters = {
            @StoredProcedureParameter(mode = ParameterMode.IN,
                    type = Integer.class, name = "VI_ID_NODO")
        }
    )
})

public class CompNodosV2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_NODO", nullable = false)
    @SequenceGenerator(name = "COMP_NODOS_V2_SEQ",
            sequenceName = "COMP_NODOS_V2_SEQ", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "COMP_NODOS_V2_SEQ")
    private Long idNodo;
    @Size(max = 500)
    @Column(name = "NOMBRE_CI", length = 500)
    private String nombreCi;
    @Size(max = 10)
    @Column(name = "ESTADO", length = 10)
    private String estado;
    @Size(max = 10)
    @Column(name = "PRIORIDAD", length = 10)
    private String prioridad;
    @Size(max = 10)
    @Column(name = "CAUSA_INTERNET", length = 10)
    private String causaInternet;
    @Size(max = 10)
    @Column(name = "SINTOMA_INTERNET", length = 10)
    private String sintomaInternet;
    @Size(max = 100)
    @Column(name = "HORAS_INTERNET", length = 100)
    private String horasInternet;
    @Size(max = 10)
    @Column(name = "CAUSA_TELEFONIA", length = 10)
    private String causaTelefonia;
    @Size(max = 10)
    @Column(name = "SINTOMA_TELEFONIA", length = 10)
    private String sintomaTelefonia;
    @Size(max = 100)
    @Column(name = "HORAS_TELEFONIA", length = 100)
    private String horasTelefonia;
    @Size(max = 10)
    @Column(name = "CAUSA_TELEVISION", length = 10)
    private String causaTelevision;
    @Size(max = 10)
    @Column(name = "SINTOMA_TELEVISION", length = 10)
    private String sintomaTelevision;
    @Size(max = 100)
    @Column(name = "HORAS_TELEVISION", length = 100)
    private String horasTelevision;
    @Size(max = 100)
    @Column(name = "ESTADO_VERIFICAR", length = 100)
    private String estadoVerificar;
    @Size(max = 100)
    @Column(name = "USUARIO_VERIFICAR", length = 100)
    private String usuarioVerificar;
    @Column(name = "FECHA_VERIFICAR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVerificar;
    @Size(max = 100)
    @Column(name = "OBSERVACION", length = 100)
    private String observacion;

    public CompNodosV2() {
    }

    public CompNodosV2(Long idNodo) {
        this.idNodo = idNodo;
    }

    public Long getIdNodo() {
        return idNodo;
    }

    public void setIdNodo(Long idNodo) {
        this.idNodo = idNodo;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNodo != null ? idNodo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompNodosV2)) {
            return false;
        }
        CompNodosV2 other = (CompNodosV2) object;
        if ((this.idNodo == null && other.idNodo != null) || (this.idNodo != null && !this.idNodo.equals(other.idNodo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.compensaciones.entity.CompNodosV2[ idNodo=" + idNodo + " ]";
    }
    
}
