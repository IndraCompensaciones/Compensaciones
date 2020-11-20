package co.co.claro.compensaciones.persistencia.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vcastril
 * @author henry.javier.almarza.canizalez@everis.com
 * @version 1.0
 */
@Entity
@Table(name = "COMP_ESTRATOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompEstratos.findAll", query = "SELECT c FROM "
            + "CompEstratos c"),
    @NamedQuery(name = "CompEstratos.findByIdEstrato", query = "SELECT c FROM "
            + "CompEstratos c WHERE c.idEstrato = :idEstrato"),
    @NamedQuery(name = "CompEstratos.findByEstrato", query = "SELECT c FROM "
            + "CompEstratos c WHERE c.estrato = :estrato"),
    @NamedQuery(name = "CompEstratos.findByDescripcion", query = "SELECT c "
            + "FROM CompEstratos c WHERE c.descripcion = :descripcion")})
public class CompEstratos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_ESTRATO")
    private Long idEstrato;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ESTRATO")
    private String estrato;
    @Size(max = 255)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "compEstratos")
    private List<CompEstratoAjuste> compEstratoAjusteList;
    @Basic(optional = false)
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public CompEstratos() {
    }

    /**
     * 
     * @param idEstrato 
     */
    public CompEstratos(Long idEstrato) {
        this.idEstrato = idEstrato;
    }

    /**
     * 
     * @param idEstrato
     * @param estrato 
     */
    public CompEstratos(Long idEstrato, String estrato) {
        this.idEstrato = idEstrato;
        this.estrato = estrato;
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
     * @return String
     */
    public String getEstrato() {
        return estrato;
    }

    /**
     * 
     * @param estrato 
     */
    public void setEstrato(String estrato) {
        this.estrato = estrato;
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
     * @return List
     */
    @XmlTransient
    public List<CompEstratoAjuste> getCompEstratoAjusteList() {
        return compEstratoAjusteList;
    }

    /**
     * 
     * @param compEstratoAjusteList 
     */
    public void setCompEstratoAjusteList(List<CompEstratoAjuste> compEstratoAjusteList) {
        this.compEstratoAjusteList = compEstratoAjusteList;
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
        hash += (idEstrato != null ? idEstrato.hashCode() : 0);
        return hash;
    }

    /**
     * 
     * @param object
     * @return boolean
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompEstratos)) {
            return false;
        }
        CompEstratos other = (CompEstratos) object;
        if ((this.idEstrato == null && other.idEstrato != null) || 
                (this.idEstrato != null && !this.idEstrato.equals(
                        other.idEstrato))) {
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
        return "co.com.ces3.rest.CompEstratos[ idEstrato=" + idEstrato + " ]";
    }
    
}
