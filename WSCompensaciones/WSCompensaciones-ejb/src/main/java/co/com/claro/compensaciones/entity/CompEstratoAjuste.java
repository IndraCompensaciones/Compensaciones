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
@Table(name = "COMP_ESTRATO_AJUSTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompEstratoAjuste.findAll",
            query = "SELECT c FROM CompEstratoAjuste c")
    ,
    @NamedQuery(name = "CompEstratoAjuste.findByIdEstrato",
            query = "SELECT c FROM CompEstratoAjuste c "
            + "WHERE c.compEstratoAjustePK.idEstrato = :idEstrato")
    ,
    @NamedQuery(name = "CompEstratoAjuste.findByIdAjuste",
            query = "SELECT c FROM CompEstratoAjuste c "
            + "WHERE c.compEstratoAjustePK.idAjuste = :idAjuste")
    ,
    @NamedQuery(name = "CompEstratoAjuste.findByIdAjusteIdEstrato", query = 
            "SELECT c FROM CompEstratoAjuste c "
            + "WHERE c.compEstratoAjustePK.idAjuste = :idAjuste and "
                    + "c.compEstratoAjustePK.idEstrato = :idEstrato")
    ,
    @NamedQuery(name = "CompEstratoAjuste.findByEstado",
            query = "SELECT c FROM CompEstratoAjuste c "
            + "WHERE c.estado = :estado")})
public class CompEstratoAjuste implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CompEstratoAjustePK compEstratoAjustePK;
    @Column(name = "ESTADO")
    private Long estado;
    @JoinColumn(name = "ID_AJUSTE", referencedColumnName = "ID_AJUSTE", 
            insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CompAjustes compAjustes;
    @JoinColumn(name = "ID_ESTRATO", referencedColumnName = "ID_ESTRATO", 
            insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CompEstratos compEstratos;
    @Basic(optional = false)
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public CompEstratoAjuste() {
    }

    /**
     * 
     * @param compEstratoAjustePK 
     */
    public CompEstratoAjuste(CompEstratoAjustePK compEstratoAjustePK) {
        this.compEstratoAjustePK = compEstratoAjustePK;
    }

    /**
     * 
     * @param idEstrato
     * @param idAjuste 
     */
    public CompEstratoAjuste(Long idEstrato, Long idAjuste) {
        this.compEstratoAjustePK = new CompEstratoAjustePK(idEstrato, idAjuste);
    }

    /**
     * 
     * @return 
     */
    public CompEstratoAjustePK getCompEstratoAjustePK() {
        return compEstratoAjustePK;
    }

    /**
     * 
     * @param compEstratoAjustePK 
     */
    public void setCompEstratoAjustePK(CompEstratoAjustePK compEstratoAjustePK) {
        this.compEstratoAjustePK = compEstratoAjustePK;
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
     * @return CompEstratos
     */
    public CompEstratos getCompEstratos() {
        return compEstratos;
    }

    /**
     * 
     * @param compEstratos 
     */
    public void setCompEstratos(CompEstratos compEstratos) {
        this.compEstratos = compEstratos;
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
        hash += (compEstratoAjustePK != null ? compEstratoAjustePK.hashCode() 
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
        if (!(object instanceof CompEstratoAjuste)) {
            return false;
        }
        CompEstratoAjuste other = (CompEstratoAjuste) object;
        if ((this.compEstratoAjustePK == null && other.compEstratoAjustePK != 
                null) || (this.compEstratoAjustePK != null && 
                !this.compEstratoAjustePK.equals(other.compEstratoAjustePK))) {
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
        return "javaapplication4.CompEstratoAjuste[ compEstratoAjustePK=" 
                + compEstratoAjustePK + " ]";
    }

}
