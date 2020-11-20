package co.co.claro.compensaciones.persistencia.entity;

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
@Table(name = "COMP_SINTOMAS_SERVICIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompSintomasServicio.findAll", query = "SELECT c "
            + "FROM CompSintomasServicio c")
    ,
    @NamedQuery(name = "CompSintomasServicio.findByIdServicio", query
            = "SELECT c FROM CompSintomasServicio c WHERE "
            + "c.compSintomasServicioPK.idServicio = :idServicio")
    ,
    @NamedQuery(name = "CompSintomasServicio.findByIdSintoma", query
            = "SELECT c FROM CompSintomasServicio c WHERE "
            + "c.compSintomasServicioPK.idSintoma = :idSintoma")
    ,
    @NamedQuery(name = "CompSintomasServicio.findByIdSintomaIdServicio",
            query = "SELECT c FROM CompSintomasServicio c "
            + "WHERE c.compSintomasServicioPK.idSintoma = :idSintoma and "
            + "c.compSintomasServicioPK.idServicio = :idServicio")
    ,
    @NamedQuery(name = "CompSintomasServicio.findByEstado", query = "SELECT "
            + "c FROM CompSintomasServicio c WHERE c.estado = :estado")})
public class CompSintomasServicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CompSintomasServicioPK compSintomasServicioPK;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private Long estado;
    @JoinColumn(name = "ID_SERVICIO", referencedColumnName = "ID_SERVICIO", 
            insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CompServicios compServicios;
    @JoinColumn(name = "ID_SINTOMA", referencedColumnName = "ID_SINTOMA", 
            insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CompSintomas compSintomas;
    @Basic(optional = false)
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public CompSintomasServicio() {
    }

    /**
     * 
     * @param compSintomasServicioPK 
     */
    public CompSintomasServicio(CompSintomasServicioPK compSintomasServicioPK) {
        this.compSintomasServicioPK = compSintomasServicioPK;
    }

    /**
     * 
     * @param compSintomasServicioPK
     * @param estado 
     */
    public CompSintomasServicio(CompSintomasServicioPK compSintomasServicioPK, 
            Long estado) {
        this.compSintomasServicioPK = compSintomasServicioPK;
        this.estado = estado;
    }

    /**
     * 
     * @param idServicio
     * @param idSintoma 
     */
    public CompSintomasServicio(Long idServicio, Long idSintoma) {
        this.compSintomasServicioPK = new CompSintomasServicioPK(idServicio, 
                idSintoma);
    }

    public CompSintomasServicioPK getCompSintomasServicioPK() {
        return compSintomasServicioPK;
    }

    /**
     * 
     * @param compSintomasServicioPK 
     */
    public void setCompSintomasServicioPK(CompSintomasServicioPK 
            compSintomasServicioPK) {
        this.compSintomasServicioPK = compSintomasServicioPK;
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
     * @return CompSintomas
     */
    public CompSintomas getCompSintomas() {
        return compSintomas;
    }

    /**
     * 
     * @param compSintomas 
     */
    public void setCompSintomas(CompSintomas compSintomas) {
        this.compSintomas = compSintomas;
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
        hash += (compSintomasServicioPK != null ? 
                compSintomasServicioPK.hashCode() : 0);
        return hash;
    }

    /**
     * 
     * @param object
     * @return boolean
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompSintomasServicio)) {
            return false;
        }
        CompSintomasServicio other = (CompSintomasServicio) object;
        if ((this.compSintomasServicioPK == null && other.
                compSintomasServicioPK != null) || (this.
                compSintomasServicioPK != null && !this.
                        compSintomasServicioPK.equals(other.
                                compSintomasServicioPK))) {
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
        return "newpackage.CompSintomasServicio[ compSintomasServicioPK=" 
                + compSintomasServicioPK + " ]";
    }

}
