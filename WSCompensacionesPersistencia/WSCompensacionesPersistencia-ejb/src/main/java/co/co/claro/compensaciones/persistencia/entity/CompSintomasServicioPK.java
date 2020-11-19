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
public class CompSintomasServicioPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ID_SERVICIO")
    private Long idServicio;
    @Basic(optional = false)
    @Column(name = "ID_SINTOMA")
    private Long idSintoma;
    @Basic(optional = false)
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public CompSintomasServicioPK() {
    }

    /**
     * 
     * @param idServicio
     * @param idSintoma 
     */
    public CompSintomasServicioPK(Long idServicio, Long idSintoma) {
        this.idServicio = idServicio;
        this.idSintoma = idSintoma;
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
    public float getIdSintoma() {
        return idSintoma;
    }

    /**
     * 
     * @param idSintoma 
     */
    public void setIdSintoma(Long idSintoma) {
        this.idSintoma = idSintoma;
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
        hash += (Long) idSintoma;
        return hash;
    }

    /**
     * 
     * @param object
     * @return 
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompSintomasServicioPK)) {
            return false;
        }
        CompSintomasServicioPK other = (CompSintomasServicioPK) object;
        if (this.idServicio != other.idServicio) {
            return false;
        }
        if (this.idSintoma != other.idSintoma) {
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
        return "newpackage.CompSintomasServicioPK[ idServicio=" + 
                idServicio + ", idSintoma=" + idSintoma + " ]";
    }

}
