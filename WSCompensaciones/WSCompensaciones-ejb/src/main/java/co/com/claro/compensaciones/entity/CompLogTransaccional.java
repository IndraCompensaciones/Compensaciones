/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.compensaciones.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "COMP_LOG_TRANSACCIONAL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompLogTransaccional.findAll",
            query = "SELECT c FROM CompLogTransaccional c")
    , @NamedQuery(name = "CompLogTransaccional.findByIdLog",
            query = "SELECT c FROM CompLogTransaccional c WHERE c.idLog = :idLog")
    , @NamedQuery(name = "CompLogTransaccional.findByNomTransaccion",
            query = "SELECT c FROM CompLogTransaccional c WHERE c.nomTransaccion = :nomTransaccion")
    , @NamedQuery(name = "CompLogTransaccional.findByFechaHora",
            query = "SELECT c FROM CompLogTransaccional c WHERE c.fechaHora = :fechaHora")
    , @NamedQuery(name = "CompLogTransaccional.findByEstado",
            query = "SELECT c FROM CompLogTransaccional c WHERE c.estado = :estado")
    , @NamedQuery(name = "CompLogTransaccional.findByDescripcionError",
            query = "SELECT c FROM CompLogTransaccional c WHERE c.descripcionError = :descripcionError")})


@SequenceGenerator(name = "idLog", sequenceName = "COMP_LOG_TRANSACCIONAL_SEQ",
        initialValue = 1, allocationSize = 1)

public class CompLogTransaccional implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID_LOG")
    @GeneratedValue(generator = "idLog",
            strategy = GenerationType.SEQUENCE)
    private Long idLog;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "NOM_TRANSACCION")
    private String nomTransaccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_HORA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESTADO")
    private Long estado;
    @Size(max = 500)
    @Column(name = "DESCRIPCION_ERROR")
    private String descripcionError;

    public CompLogTransaccional() {
    }

    public CompLogTransaccional(Long idLog) {
        this.idLog = idLog;
    }

    /**
     * 
     * @param idLog
     * @param nomTransaccion
     * @param fechaHora
     * @param estado 
     */
    public CompLogTransaccional(Long idLog, String nomTransaccion, Date fechaHora, Long estado) {
        this.idLog = idLog;
        this.nomTransaccion = nomTransaccion;
        this.fechaHora = fechaHora;
        this.estado = estado;
    }

    public Long getIdLog() {
        return idLog;
    }

    public void setIdLog(Long idLog) {
        this.idLog = idLog;
    }

    public String getNomTransaccion() {
        return nomTransaccion;
    }

    public void setNomTransaccion(String nomTransaccion) {
        this.nomTransaccion = nomTransaccion;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Long getEstado() {
        return estado;
    }

    public void setEstado(Long estado) {
        this.estado = estado;
    }

    public String getDescripcionError() {
        return descripcionError;
    }

    public void setDescripcionError(String descripcionError) {
        this.descripcionError = descripcionError;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLog != null ? idLog.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CompLogTransaccional)) {
            return false;
        }
        CompLogTransaccional other = (CompLogTransaccional) object;
        if ((this.idLog == null && other.idLog != null) 
                || (this.idLog != null && !this.idLog.equals(
                        other.idLog))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.compensaciones.entity.CompLogTransaccional[ idLog=" + idLog + " ]";
    }
    
}
