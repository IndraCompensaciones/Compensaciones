package co.com.claro.compensaciones.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author vcastril
 * @author henry.javier.almarza.canizalez@everis.com
 * @version 1.0
 */
@Embeddable
public class CompEstratoAjustePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ID_ESTRATO")
    private Long idEstrato;
    @Basic(optional = false)
    @Column(name = "ID_AJUSTE")
    private Long idAjuste;
    @Basic(optional = false)
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public CompEstratoAjustePK() {
    }

    /**
     * 
     * @param idEstrato
     * @param idAjuste 
     */
    public CompEstratoAjustePK(Long idEstrato, Long idAjuste) {
        this.idEstrato = idEstrato;
        this.idAjuste = idAjuste;
    }

    /**
     * 
     * @return Long
     */
    public Long getIdEstrato() {
        return idEstrato;
    }

    /**
     * 
     * @param idEstrato 
     */
    public void setIdEstrato(Long idEstrato) {
        this.idEstrato = idEstrato;
    }

    /**
     * 
     * @return Long
     */
    public Long getIdAjuste() {
        return idAjuste;
    }

    /**
     * 
     * @param idAjuste 
     */
    public void setIdAjuste(Long idAjuste) {
        this.idAjuste = idAjuste;
    }

    /**
     * 
     * @return Date
     */
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * 
     * @param fechaCreacion 
     */
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * 
     * @return int
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (Long) idEstrato;
        hash += (Long) idAjuste;
        return hash;
    }

    /**
     * 
     * @param object
     * @return boolean
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompEstratoAjustePK)) {
            return false;
        }
        CompEstratoAjustePK other = (CompEstratoAjustePK) object;
        if (this.idEstrato != other.idEstrato) {
            return false;
        }
        if (this.idAjuste != other.idAjuste) {
            return false;
        }
        return true;
    }

    /**
     * 
     * @return String
     */
    @Override
    public String toString() {
        return "javaapplication4.CompEstratoAjustePK[ idEstrato=" 
                + idEstrato + ", idAjuste=" + idAjuste + " ]";
    }

}
