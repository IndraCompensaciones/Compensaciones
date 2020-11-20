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
 * @author vcastril
 * @author henry.javier.almarza.canizalez@everis.com
 * @version 1.0
 */
@Entity
@Table(name = "COMP_AJUSTE_SERVICIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompAjusteServicio.findAll", query = "SELECT c FROM "
            + "CompAjusteServicio c")
    ,
    @NamedQuery(name = "CompAjusteServicio.findByIdServicio", query = "SELECT "
            + "c FROM CompAjusteServicio c WHERE c.compAjusteServicioPK."
            + "idServicio = :idServicio")
    ,
    @NamedQuery(name = "CompAjusteServicio.findByIdAjuste", query = "SELECT "
            + "c FROM CompAjusteServicio c WHERE c.compAjusteServicioPK."
            + "idAjuste = :idAjuste")
    ,
    @NamedQuery(name = "CompAjusteServicio.findByIdAjusteIdServicio", query = 
            "SELECT c FROM CompAjusteServicio c "
            + "WHERE c.compAjusteServicioPK.idAjuste = :idAjuste and "
                    + "c.compAjusteServicioPK.idServicio = :idServicio")
    ,
    @NamedQuery(name = "CompAjusteServicio.findByEstado", query = "SELECT c "
            + "FROM CompAjusteServicio c WHERE c.estado = :estado")})
public class CompAjusteServicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CompAjusteServicioPK compAjusteServicioPK;
    @Column(name = "ESTADO")
    private Long estado;
    @JoinColumn(name = "ID_AJUSTE", referencedColumnName = "ID_AJUSTE", 
            insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CompAjustes compAjustes;
    @JoinColumn(name = "ID_SERVICIO", referencedColumnName = "ID_SERVICIO", 
            insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CompServicios compServicios;
    @Basic(optional = false)
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public CompAjusteServicio() {
    }

    /**
     * 
     * @param compAjusteServicioPK 
     */
    public CompAjusteServicio(CompAjusteServicioPK compAjusteServicioPK) {
        this.compAjusteServicioPK = compAjusteServicioPK;
    }

    /**
     * 
     * @param idServicio
     * @param idAjuste 
     */
    public CompAjusteServicio(Long idServicio, Long idAjuste) {
        this.compAjusteServicioPK = new CompAjusteServicioPK(idServicio, 
                idAjuste);
    }

    /**
     * 
     * @return CompAsjusteServicioPK
     */
    public CompAjusteServicioPK getCompAjusteServicioPK() {
        return compAjusteServicioPK;
    }

    /**
     * 
     * @param compAjusteServicioPK 
     */
    public void setCompAjusteServicioPK(CompAjusteServicioPK 
            compAjusteServicioPK) {
        this.compAjusteServicioPK = compAjusteServicioPK;
    }

    /**
     * 
     * @return Long
     */
    public Long getEstado() {
        return estado;
    }

    /**
     * 
     * @param estado 
     */
    public void setEstado(Long estado) {
        this.estado = estado;
    }

    /**
     * 
     * @return CompAjustes
     */
    public CompAjustes getCompAjustes() {
        return compAjustes;
    }

    /**
     * 
     * @param compAjustes 
     */
    public void setCompAjustes(CompAjustes compAjustes) {
        this.compAjustes = compAjustes;
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
        hash += (compAjusteServicioPK != null ? 
                compAjusteServicioPK.hashCode() : 0);
        return hash;
    }

    /**
     * 
     * @param object
     * @return boolean
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompAjusteServicio)) {
            return false;
        }
        CompAjusteServicio other = (CompAjusteServicio) object;
        if ((this.compAjusteServicioPK == null && other.compAjusteServicioPK 
                != null) || (this.compAjusteServicioPK != null && 
                !this.compAjusteServicioPK.equals(other.
                        compAjusteServicioPK))) {
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
        return "javaapplication4.CompAjusteServicio[ compAjusteServicioPK=" + 
                compAjusteServicioPK + " ]";
    }

}
