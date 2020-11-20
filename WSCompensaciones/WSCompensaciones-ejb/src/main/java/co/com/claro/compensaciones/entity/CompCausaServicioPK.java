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
 * @author eloaizao
 * @author henry.javier.almarza.canizalez@everis.com
 * @version 1.0
 */
@Embeddable
public class CompCausaServicioPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "COMP_SERVICIOSID_SERVICIO")
    private Long compServiciosidServicio;
    @Basic(optional = false)
    @Column(name = "ID_CAUSA")
    private Long idCausa;
    @Basic(optional = false)
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public CompCausaServicioPK() {
    }

    /**
     * 
     * @param compServiciosidServicio
     * @param idCausa 
     */
    public CompCausaServicioPK(Long compServiciosidServicio, Long idCausa) {
        this.compServiciosidServicio = compServiciosidServicio;
        this.idCausa = idCausa;
    }

    /**
     * 
     * @return Long
     */
    public Long getCompServiciosidServicio() {
        return compServiciosidServicio;
    }

    /**
     * 
     * @param compServiciosidServicio 
     */
    public void setCompServiciosidServicio(Long compServiciosidServicio) {
        this.compServiciosidServicio = compServiciosidServicio;
    }

    /**
     * 
     * @return Long
     */
    public Long getIdCausa() {
        return idCausa;
    }

    /**
     * 
     * @param idCausa 
     */
    public void setIdCausa(Long idCausa) {
        this.idCausa = idCausa;
    }

    /**
     * 
     * @return int
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (compServiciosidServicio != null ? compServiciosidServicio.
                hashCode() : 0);
        hash += (idCausa != null ? idCausa.hashCode() : 0);
        return hash;
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
     * @param object
     * @return boolean
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompCausaServicioPK)) {
            return false;
        }
        CompCausaServicioPK other = (CompCausaServicioPK) object;
        if (this.compServiciosidServicio != other.compServiciosidServicio) {
            return false;
        }
        if (this.idCausa != other.idCausa) {
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
        return "co.com.claro.compensaciones.entity.CompCausaServicioPK[ "
                + "compServiciosidServicio=" + compServiciosidServicio + 
                ", idCausa=" + idCausa + " ]";
    }

}
