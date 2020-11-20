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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author candradh
 * @author henry.javier.almarza.canizalez@everis.com
 * @version 1.0
 */
@Entity
@Table(name = "COMP_OBSERVACIONES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompObservaciones.findAll", query = "SELECT c FROM "
            + "CompObservaciones c")
    ,
    @NamedQuery(name = "CompObservaciones.findByIdObservaciones", query
            = "SELECT c FROM CompObservaciones c WHERE c.idObservaciones "
            + "= :idObservaciones")
    ,
    @NamedQuery(name = "CompObservaciones.findByDescripcion", query = "SELECT "
            + "c FROM CompObservaciones c WHERE c.descripcion = :descripcion")
    ,
    @NamedQuery(name = "CompObservaciones.findByProceso", query = "SELECT c "
            + "FROM CompObservaciones c WHERE c.proceso = :proceso")
    ,
    @NamedQuery(name = "CompObservaciones.findByEstado", query = "SELECT c "
            + "FROM CompObservaciones c WHERE c.estado = :estado")
    ,
    @NamedQuery(name = "CompObservaciones.findByCausaObservacion", query
            = "SELECT c FROM CompObservaciones c WHERE c.causaObservacion "
            + "= :causaObservacion")})

@SequenceGenerator(name = "idObservaciones",
        sequenceName = "COMP_OBSERVACIONES_SEQ",
        initialValue = 1, allocationSize = 1)
public class CompObservaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_OBSERVACIONES")
    @GeneratedValue(generator = "idObservaciones",
            strategy = GenerationType.SEQUENCE)
    private Long idObservaciones;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "PROCESO")
    private String proceso;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private Long estado;
    @Basic(optional = false)
    @Column(name = "CAUSA_OBSERVACION")
    private String causaObservacion;
    @Basic(optional = false)
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public CompObservaciones() {
    }

    /**
     * 
     * @param idObservaciones 
     */
    public CompObservaciones(Long idObservaciones) {
        this.idObservaciones = idObservaciones;
    }

    /**
     * 
     * @param idObservaciones
     * @param descripcion
     * @param proceso
     * @param estado
     * @param causaObservacion 
     */
    public CompObservaciones(Long idObservaciones, String descripcion, String 
            proceso, Long estado, String causaObservacion) {
        this.idObservaciones = idObservaciones;
        this.descripcion = descripcion;
        this.proceso = proceso;
        this.estado = estado;
        this.causaObservacion = causaObservacion;
    }

    /**
     * 
     * @return Long
     */
    public Long getIdObservaciones() {
        return idObservaciones;
    }

    /**
     * 
     * @param idObservaciones 
     */
    public void setIdObservaciones(Long idObservaciones) {
        this.idObservaciones = idObservaciones;
    }

    /**
     * 
     * @return String
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * 
     * @param descripcion 
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * 
     * @return String
     */
    public String getProceso() {
        return proceso;
    }

    /**
     * 
     * @param proceso 
     */
    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

    /**
     * 
     * @return 
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
     * @return String
     */
    public String getCausaObservacion() {
        return causaObservacion;
    }

    /**
     * 
     * @param causaObservacion 
     */
    public void setCausaObservacion(String causaObservacion) {
        this.causaObservacion = causaObservacion;
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
        hash += (idObservaciones != null ? idObservaciones.hashCode() : 0);
        return hash;
    }

    /**
     * 
     * @param object
     * @return boolean
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompObservaciones)) {
            return false;
        }
        CompObservaciones other = (CompObservaciones) object;
        if ((this.idObservaciones == null && other.idObservaciones != null) 
                || (this.idObservaciones != null && !this.idObservaciones.
                        equals(other.idObservaciones))) {
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
        return "co.com.claro.compensaciones.entity.CompObservaciones[ "
                + "idObservaciones=" + idObservaciones + " ]";
    }

}
