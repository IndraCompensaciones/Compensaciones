package co.com.claro.compensaciones.entity;

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
@Table(name = "COMP_PRIORIDADES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompPrioridades.findAll", query = "SELECT c FROM "
            + "CompPrioridades c")
    ,
    @NamedQuery(name = "CompPrioridades.findById", query = "SELECT c FROM "
            + "CompPrioridades c WHERE c.idPrioridad = :idPrioridad")
    ,
    @NamedQuery(name = "CompPrioridades.findByCodPrioridad", query = "SELECT c "
            + "FROM CompPrioridades c WHERE c.codPrioridad = :codPrioridad")
    ,
    @NamedQuery(name = "CompPrioridades.findByDescripcionPrioridad", query = 
            "SELECT c FROM CompPrioridades c WHERE c.descripcionPrioridad "
                    + "= :descripcionPrioridad")
    ,
    @NamedQuery(name = "CompPrioridades.findByEstado", query = "SELECT c FROM "
            + "CompPrioridades c WHERE c.estado = :estado")
    ,
    @NamedQuery(name = "CompPrioridades.findByCompensaNodos", query = "SELECT "
            + "c FROM CompPrioridades c WHERE c.compensaNodos = :compensaNodos")
    ,
    @NamedQuery(name = "CompPrioridades.findByCompensaCuentas", query = 
            "SELECT c FROM CompPrioridades c WHERE c.compensaCuentas "
                    + "= :compensaCuentas")})

@SequenceGenerator(name = "idPrioridad", sequenceName = "COMP_PRIORIDADES_SEQ",
        initialValue = 1, allocationSize = 1)
public class CompPrioridades implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PRIORIDAD")
    @GeneratedValue(generator = "idPrioridad",
            strategy = GenerationType.SEQUENCE)
    private Long idPrioridad;
    @Basic(optional = false)
    @Column(name = "COD_PRIORIDAD")
    private Long codPrioridad;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION_PRIORIDAD")
    private String descripcionPrioridad;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private Long estado;
    @Basic(optional = false)
    @Column(name = "COMPENSA_NODOS")
    private Long compensaNodos;
    @Basic(optional = false)
    @Column(name = "COMPENSA_CUENTAS")
    private Long compensaCuentas;
    @Basic(optional = false)
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public CompPrioridades() {
    }

    /**
     * 
     * @param idPrioridad 
     */
    public CompPrioridades(Long idPrioridad) {
        this.idPrioridad = idPrioridad;
    }

    /**
     * 
     * @param idPrioridad
     * @param codPrioridad
     * @param descripcionPrioridad
     * @param estado
     * @param compensaNodos
     * @param compensaCuentas 
     */
    public CompPrioridades(Long idPrioridad, Long codPrioridad, String 
            descripcionPrioridad, Long estado, Long compensaNodos, Long 
                    compensaCuentas) {
        this.idPrioridad = idPrioridad;
        this.codPrioridad = codPrioridad;
        this.descripcionPrioridad = descripcionPrioridad;
        this.estado = estado;
        this.compensaNodos = compensaNodos;
        this.compensaCuentas = compensaCuentas;
    }

    /**
     * 
     * @return Long
     */
    public Long getCodPrioridad() {
        return codPrioridad;
    }

    /**
     * 
     * @param codPrioridad 
     */
    public void setCodPrioridad(Long codPrioridad) {
        this.codPrioridad = codPrioridad;
    }

    /**
     * 
     * @return String
     */
    public String getDescripcionPrioridad() {
        return descripcionPrioridad;
    }

    /**
     * 
     * @param descripcionPrioridad 
     */
    public void setDescripcionPrioridad(String descripcionPrioridad) {
        this.descripcionPrioridad = descripcionPrioridad;
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
     * @return Long
     */
    public Long getCompensaNodos() {
        return compensaNodos;
    }

    /**
     * 
     * @param compensaNodos 
     */
    public void setCompensaNodos(Long compensaNodos) {
        this.compensaNodos = compensaNodos;
    }

    /**
     * 
     * @return Long
     */
    public Long getCompensaCuentas() {
        return compensaCuentas;
    }

    public void setCompensaCuentas(Long compensaCuentas) {
        this.compensaCuentas = compensaCuentas;
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
        hash += (getIdPrioridad() != null ? getIdPrioridad().hashCode() : 0);
        return hash;
    }

    /**
     * 
     * @param object
     * @return boolean
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompPrioridades)) {
            return false;
        }
        CompPrioridades other = (CompPrioridades) object;
        if ((this.getIdPrioridad() == null && other.getIdPrioridad() != null) 
                || (this.getIdPrioridad() != null && !this.idPrioridad.equals(
                        other.idPrioridad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proymapeo.CompPrioridades[ idPrioridad=" + getIdPrioridad() 
                + " ]";
    }

    /**
     * @return Long
     */
    public Long getIdPrioridad() {
        return idPrioridad;
    }

    /**
     * @param idPrioridad
     */
    public void setIdPrioridad(Long idPrioridad) {
        this.idPrioridad = idPrioridad;
    }

}
