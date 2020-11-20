package co.co.claro.compensaciones.persistencia.entity;

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
public class CompAjusteServicioPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ID_SERVICIO")
    private Long idServicio;
    @Basic(optional = false)
    @Column(name = "ID_AJUSTE")
    private Long idAjuste;
    @Basic(optional = false)
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public CompAjusteServicioPK() {
    }

    /**
     * 
     * @param idServicio
     * @param idAjuste 
     */
    public CompAjusteServicioPK(Long idServicio, Long idAjuste) {
        this.idServicio = idServicio;
        this.idAjuste = idAjuste;
    }

    /**
     * 
     * @return float
     */
    public float getIdServicio() {
        return idServicio;
    }

    /**
     * 
     * @param idServicio 
     */
    public void setIdServicio(Long idServicio) {
        this.idServicio = idServicio;
    }

    /**
     * 
     * @return float
     */
    public float getIdAjuste() {
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
        hash += (Long) idServicio;
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
        if (!(object instanceof CompAjusteServicioPK)) {
            return false;
        }
        CompAjusteServicioPK other = (CompAjusteServicioPK) object;
        if (this.idServicio != other.idServicio) {
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
        return "javaapplication4.CompAjusteServicioPK[ idServicio=" + 
                idServicio + ", idAjuste=" + idAjuste + " ]";
    }
    
}
