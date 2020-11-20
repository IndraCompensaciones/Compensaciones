package co.com.claro.compensaciones.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author candradh
 * @author eloaiza - everis
 * @author henry.javier.almarza.canizalez@everis.com
 * @version 1.0
 */
@Entity
@Table(name = "COMP_CAUSA_SERVICIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompCausaServicio.findAll", query = "SELECT c FROM "
            + "CompCausaServicio c")
    ,
    @NamedQuery(name = "CompCausaServicio.findByCompServiciosidServicio", 
            query = "SELECT c FROM CompCausaServicio c WHERE c."
                    + "compCausaServicioPK.compServiciosidServicio "
                    + "= :compServiciosidServicio")
    ,
    @NamedQuery(name = "CompCausaServicio.findByIdCausa", query = "SELECT c "
            + "FROM CompCausaServicio c WHERE c.compCausaServicioPK.idCausa "
            + "= :idCausa")
    ,
    @NamedQuery(name = "CompCausaServicio.findByIdCausaIdServicio", query = 
            "SELECT c FROM CompCausaServicio c WHERE c.compCausaServicioPK."
                    + "idCausa = :idCausa and c.compCausaServicioPK."
                    + "compServiciosidServicio = :compServiciosidServicio")
    ,
    @NamedQuery(name = "CompCausaServicio.findByCompensa", query = "SELECT c "
            + "FROM CompCausaServicio c WHERE c.compensa = :compensa")})
public class CompCausaServicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CompCausaServicioPK compCausaServicioPK;
    @Basic(optional = false)
    @Column(name = "COMPENSA")
    private Long compensa;
    @JoinColumn(name = "ID_CAUSA", referencedColumnName = "ID_CAUSA", 
            insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CompCausas compCausas;
    @JoinColumn(name = "COMP_SERVICIOSID_SERVICIO", referencedColumnName = 
            "ID_SERVICIO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CompServicios compServicios;
    @Basic(optional = false)
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public CompCausaServicio() {
    }

    /**
     * 
     * @param compCausaServicioPK 
     */
    public CompCausaServicio(CompCausaServicioPK compCausaServicioPK) {
        this.compCausaServicioPK = compCausaServicioPK;
    }

    /**
     * 
     * @param compCausaServicioPK
     * @param compensa 
     */
    public CompCausaServicio(CompCausaServicioPK compCausaServicioPK, 
            Long compensa) {
        this.compCausaServicioPK = compCausaServicioPK;
        this.compensa = compensa;
    }

    /**
     * 
     * @param compServiciosidServicio
     * @param idCausa 
     */
    public CompCausaServicio(Long compServiciosidServicio, Long idCausa) {
        this.compCausaServicioPK = new CompCausaServicioPK(
                compServiciosidServicio, idCausa);
    }

    /**
     * 
     * @return CompCausaServicioPK
     */
    public CompCausaServicioPK getCompCausaServicioPK() {
        return compCausaServicioPK;
    }

    /**
     * 
     * @param compCausaServicioPK 
     */
    public void setCompCausaServicioPK(CompCausaServicioPK 
            compCausaServicioPK) {
        this.compCausaServicioPK = compCausaServicioPK;
    }

    /**
     * 
     * @return Long
     */
    public Long getCompensa() {
        return compensa;
    }

    /**
     * 
     * @param compensa 
     */
    public void setCompensa(Long compensa) {
        this.compensa = compensa;
    }

    /**
     * 
     * @return CompCausas
     */
    public CompCausas getCompCausas() {
        return compCausas;
    }

    /**
     * 
     * @param compCausas 
     */
    public void setCompCausas(CompCausas compCausas) {
        this.compCausas = compCausas;
    }

    /**
     * 
     * @return CompServicios
     */
    public CompServicios getCompServicios() {
        return compServicios;
    }

    /**
     * 
     * @param compServicios 
     */
    public void setCompServicios(CompServicios compServicios) {
        this.compServicios = compServicios;
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
        hash += (compCausaServicioPK != null ? compCausaServicioPK.hashCode() 
                : 0);
        return hash;
    }

    /**
     * 
     * @param object
     * @return boolean
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompCausaServicio)) {
            return false;
        }
        CompCausaServicio other = (CompCausaServicio) object;
        if ((this.compCausaServicioPK == null && other.compCausaServicioPK 
                != null) || (this.compCausaServicioPK != null && !this.
                        compCausaServicioPK.equals(other.
                                compCausaServicioPK))) {
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
        return "co.com.claro.compensaciones.entity.CompCausaServicio"
                + "[ compCausaServicioPK=" + compCausaServicioPK + " ]";
    }

}
