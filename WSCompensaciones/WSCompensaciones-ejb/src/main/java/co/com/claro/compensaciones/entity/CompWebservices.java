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
 * @author vcastril
 * @author henry.javier.almarza.canizalez@everis.com
 * @version 1.0
 */
@Entity
@Table(name = "COMP_WEBSERVICES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompWebservices.findAll", query = "SELECT c FROM "
            + "CompWebservices c")
    ,
    @NamedQuery(name = "CompWebservices.findByIdws", query = "SELECT c FROM "
            + "CompWebservices c WHERE c.idws = :idws")
    ,
    @NamedQuery(name = "CompWebservices.findByUrl", query = "SELECT c FROM "
            + "CompWebservices c WHERE c.url = :url")
    ,
    @NamedQuery(name = "CompWebservices.findByDescripcion", query = "SELECT c "
            + "FROM CompWebservices c WHERE c.descripcion = :descripcion")
    ,
    @NamedQuery(name = "CompWebservices.findByEstado", query = "SELECT c FROM "
            + "CompWebservices c WHERE c.estado = :estado")
    ,
    @NamedQuery(name = "CompWebservices.findByIdusuario", query = "SELECT c "
            + "FROM CompWebservices c WHERE c.idusuario = :idusuario")
    ,
    @NamedQuery(name = "CompWebservices.findByFecha", query = "SELECT c FROM "
            + "CompWebservices c WHERE c.fecha = :fecha")
    ,
    @NamedQuery(name = "CompWebservices.findByIdusuarioMod", query = "SELECT c "
            + "FROM CompWebservices c WHERE c.idusuarioMod = :idusuarioMod")
    ,
    @NamedQuery(name = "CompWebservices.findByFechaMod", query = "SELECT c "
            + "FROM CompWebservices c WHERE c.fechaMod = :fechaMod")
    ,
    @NamedQuery(name = "CompWebservices.findByDescEst",
            query = "SELECT m FROM CompWebservices m "
            + "WHERE m.descripcion = "
            + ":descripcion and m.estado =:estado")

})

@SequenceGenerator(name = "idws", sequenceName = "COMP_WEBSERVICES_SEQ",
        initialValue = 1, allocationSize = 1)
public class CompWebservices implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDWS")
    @GeneratedValue(generator = "idws",
            strategy = GenerationType.SEQUENCE)
    private Long idws;
    @Basic(optional = false)
    @Column(name = "URL")
    private String url;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private Long estado;
    @Basic(optional = false)
    @Column(name = "IDUSUARIO")
    private Long idusuario;
    @Basic(optional = false)
    @Column(name = "FECHA")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @Column(name = "IDUSUARIO_MOD")
    private Long idusuarioMod;
    @Column(name = "FECHA_MOD")
    @Temporal(TemporalType.DATE)
    private Date fechaMod;

    public CompWebservices() {
    }

    /**
     * 
     * @param idws 
     */
    public CompWebservices(Long idws) {
        this.idws = idws;
    }

    /**
     * 
     * @param idws
     * @param url
     * @param descripcion
     * @param estado
     * @param idusuario
     * @param fecha
     * @param idusuarioMod 
     */
    public CompWebservices(Long idws, String url, String descripcion, 
            Long estado, Long idusuario, Date fecha, Long idusuarioMod) {
        this.idws = idws;
        this.url = url;
        this.descripcion = descripcion;
        this.estado = estado;
        this.idusuario = idusuario;
        this.fecha = fecha;
        this.idusuarioMod = idusuarioMod;
    }

    /**
     * 
     * @return Long
     */
    public Long getIdws() {
        return idws;
    }

    /**
     * 
     * @param idws 
     */
    public void setIdws(Long idws) {
        this.idws = idws;
    }

    /**
     * 
     * @return String
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url 
     */
    public void setUrl(String url) {
        this.url = url;
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
     * @return float
     */
    public float getEstado() {
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
     * @return float
     */
    public float getIdusuario() {
        return idusuario;
    }

    /**
     * 
     * @param idusuario 
     */
    public void setIdusuario(Long idusuario) {
        this.idusuario = idusuario;
    }

    /**
     * 
     * @return Date
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * 
     * @param fecha 
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * 
     * @return float
     */
    public float getIdusuarioMod() {
        return idusuarioMod;
    }

    /**
     * 
     * @param idusuarioMod 
     */
    public void setIdusuarioMod(Long idusuarioMod) {
        this.idusuarioMod = idusuarioMod;
    }

    /**
     * 
     * @return Date
     */
    public Date getFechaMod() {
        return fechaMod;
    }

    /**
     * 
     * @param fechaMod 
     */
    public void setFechaMod(Date fechaMod) {
        this.fechaMod = fechaMod;
    }


    /**
     * 
     * @return int
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idws != null ? idws.hashCode() : 0);
        return hash;
    }

    /**
     * 
     * @param object
     * @return boolean
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompWebservices)) {
            return false;
        }
        CompWebservices other = (CompWebservices) object;
        if ((this.idws == null && other.idws != null)
                || (this.idws != null && !this.idws.equals(other.idws))) {
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
        return "xml.restaurante.CompWebservices[ idws=" + idws + " ]";
    }

}
