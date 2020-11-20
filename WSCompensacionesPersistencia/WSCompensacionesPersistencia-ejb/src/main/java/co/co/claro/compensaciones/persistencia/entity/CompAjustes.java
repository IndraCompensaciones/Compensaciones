package co.co.claro.compensaciones.persistencia.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Mapea la tabla de base de datos de COMP_AJUSTES
 *
 * @author vcastril-@everis
 * @author henry.javier.almarza.canizalez@everis.com
 * @version 1.0
 * @since 04/09/2018
 */
@Entity
@Table(name = "COMP_AJUSTES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompAjustes.findAll",
            query = "SELECT c FROM CompAjustes c")
    ,
    @NamedQuery(name = "CompAjustes.findByIdAjuste",
            query = "SELECT c FROM CompAjustes c WHERE c.idAjuste = :idAjuste")
    ,
    @NamedQuery(name = "CompAjustes.findByCodAjuste",
            query = "SELECT c FROM CompAjustes c "
            + "WHERE c.codAjuste = :codAjuste")
    ,
    @NamedQuery(name = "CompAjustes.findByDescripcion",
            query = "SELECT c FROM CompAjustes c "
            + "WHERE c.descripcion = :descripcion")
    ,
    @NamedQuery(name = "CompAjustes.findBy",
            query = "SELECT c FROM CompAjustes c "
            + "WHERE c.descripcion = :descripcion")
    ,
        @NamedQuery(name = "CompAjustes.findBySerivicio",
            query = "SELECT md FROM CompAjustes c JOIN "
            + "c.compAjusteServicioList md where "
            + "md.compAjusteServicioPK.idAjuste = :idAjuste")
    ,
    @NamedQuery(name = "CompAjustes.findByEstado",
            query = "SELECT c FROM CompAjustes c "
            + "WHERE c.estado = :estado")})
@SequenceGenerator(name = "idAjuste", sequenceName = "COMP_AJUSTES_SEQ",
        initialValue = 1, allocationSize = 1)
public class CompAjustes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_AJUSTE")
    @GeneratedValue(generator = "idAjuste",
            strategy = GenerationType.SEQUENCE)
    private Long idAjuste;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "COD_AJUSTE")
    private String codAjuste;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESTADO")
    private Long estado;
    @Basic(optional = false)
    @Size(min = 1, max = 30)
    @Column(name = "USUARIO")
    private String usuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "compAjustes")
    private List<CompAjusteServicio> compAjusteServicioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "compAjustes")
    private List<CompEstratoAjuste> compEstratoAjusteList;
    @Basic(optional = false)
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public CompAjustes() {
    }

    /**
     *
     * @param idAjuste
     */
    public CompAjustes(Long idAjuste) {
        this.idAjuste = idAjuste;
    }

    /**
     *
     * @param idAjuste
     * @param codAjuste
     * @param descripcion
     * @param estado
     */
    public CompAjustes(Long idAjuste, String codAjuste,
            String descripcion, Long estado) {
        this.idAjuste = idAjuste;
        this.codAjuste = codAjuste;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    /**
     * 
     * @return Long
     */
    public Long getIdAjuste() {
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
     * @return String
     */
    public String getCodAjuste() {
        return codAjuste;
    }

    /**
     * 
     * @param codAjuste 
     */
    public void setCodAjuste(String codAjuste) {
        this.codAjuste = codAjuste;
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
     * @return String
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * 
     * @param usuario 
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
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
    public void setCompEstratoAjusteList(List<CompEstratoAjuste> 
            compEstratoAjusteList) {
        this.compEstratoAjusteList = compEstratoAjusteList;
    }

    /**
     * 
     * @return List
     */
    @XmlTransient
    public List<CompAjusteServicio> getCompAjusteServicioList() {
        return compAjusteServicioList;
    }

    /**
     * 
     * @param compAjusteServicioList 
     */
    public void setCompAjusteServicioList(List<CompAjusteServicio> 
            compAjusteServicioList) {
        this.compAjusteServicioList = compAjusteServicioList;
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
        hash += (idAjuste != null ? idAjuste.hashCode() : 0);
        return hash;
    }

    /**
     * 
     * @param object
     * @return boolean
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompAjustes)) {
            return false;
        }
        CompAjustes other = (CompAjustes) object;
        if ((this.idAjuste == null && other.idAjuste != null)
                || (this.idAjuste != null && !this.idAjuste.equals(
                        other.idAjuste))) {
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
        return "co.com.ces3.rest.CompAjustes[ idAjuste=" + idAjuste + " ]";
    }

}
