package co.com.claro.compensaciones.entity;

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
 * @author candradh
 * @author henry.javier.almarza.canizalez@everis.com
 * @version 1.0
 */
@Entity
@Table(name = "COMP_SERVICIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompServicios.findAll", query = "SELECT c FROM "
            + "CompServicios c")
    ,
    @NamedQuery(name = "CompServicios.findByIdServicio", query = "SELECT c "
            + "FROM CompServicios c WHERE c.idServicio = :idServicio")
    ,
    @NamedQuery(name = "CompServicios.findByNombreServicio", query = "SELECT c "
            + "FROM CompServicios c WHERE c.nombreServicio = :nombreServicio")
    ,
    @NamedQuery(name = "CompServicios.findByCodServicio", query = "SELECT c "
            + "FROM CompServicios c WHERE c.codServicio = :codServicio")
    ,
    @NamedQuery(name = "CompServicios.findByDescripcion", query = "SELECT c "
            + "FROM CompServicios c WHERE c.descripcion = :descripcion")})
public class CompServicios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SERVICIO")
    private Long idServicio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "NOMBRE_SERVICIO")
    private String nombreServicio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "COD_SERVICIO")
    private String codServicio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "compServicios")
    private List<CompCausaServicio> compCausaServicioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "compServicios")
    private List<CompAjusteServicio> compAjusteServicioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "compServicios")
    private List<CompSintomasServicio> compSintomasServicioList;
    @Basic(optional = false)
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public CompServicios() {
    }

    /**
     * 
     * @param idServicio 
     */
    public CompServicios(Long idServicio) {
        this.idServicio = idServicio;
    }

    /**
     * 
     * @param idServicio
     * @param nombreServicio
     * @param codServicio
     * @param descripcion 
     */
    public CompServicios(Long idServicio, String nombreServicio, String 
            codServicio, String descripcion) {
        this.idServicio = idServicio;
        this.nombreServicio = nombreServicio;
        this.codServicio = codServicio;
        this.descripcion = descripcion;
    }

    /**
     * 
     * @return Long
     */
    public Long getIdServicio() {
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
     * @return String
     */
    public String getNombreServicio() {
        return nombreServicio;
    }

    /**
     * 
     * @param nombreServicio 
     */
    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    /**
     * 
     * @return String
     */
    public String getCodServicio() {
        return codServicio;
    }

    /**
     * 
     * @param codServicio 
     */
    public void setCodServicio(String codServicio) {
        this.codServicio = codServicio;
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
    public List<CompCausaServicio> getCompCausaServicioList() {
        return compCausaServicioList;
    }

    /**
     * 
     * @param compCausaServicioList 
     */
    public void setCompCausaServicioList(List<CompCausaServicio> 
            compCausaServicioList) {
        this.compCausaServicioList = compCausaServicioList;
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
     * @return List
     */
    public List<CompSintomasServicio> getCompSintomasServicioList() {
        return compSintomasServicioList;
    }

    /**
     * 
     * @param compSintomasServicioList 
     */
    public void setCompSintomasServicioList(List<CompSintomasServicio> 
            compSintomasServicioList) {
        this.compSintomasServicioList = compSintomasServicioList;
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
        hash += (idServicio != null ? idServicio.hashCode() : 0);
        return hash;
    }

    /**
     * 
     * @param object
     * @return boolean
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompServicios)) {
            return false;
        }
        CompServicios other = (CompServicios) object;
        if ((this.idServicio == null && other.idServicio != null) || 
                (this.idServicio != null && !this.idServicio.equals(
                        other.idServicio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.compensaciones.entity.CompServicios[ idServicio=" 
                + idServicio + " ]";
    }

}
