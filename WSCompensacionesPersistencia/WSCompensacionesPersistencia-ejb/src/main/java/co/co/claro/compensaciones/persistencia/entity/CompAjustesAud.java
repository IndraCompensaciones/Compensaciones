package co.co.claro.compensaciones.persistencia.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "COMP_AJUSTES_AUD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompAjustesAud.findAll", query = "SELECT c FROM "
            + "CompAjustesAud c")
    ,
    @NamedQuery(name = "CompAjustesAud.findById", query = "SELECT c FROM "
            + "CompAjustesAud c WHERE c.id = :id")
    ,
    @NamedQuery(name = "CompAjustesAud.findByIdAjuste", query = "SELECT c "
            + "FROM CompAjustesAud c WHERE c.idAjuste = :idAjuste")
    ,    
    @NamedQuery(name = "CompAjustesAud.findByDescripcion", query = "SELECT c "
            + "FROM CompAjustesAud c WHERE c.descripcion = :descripcion")
    ,
    @NamedQuery(name = "CompAjustesAud.findByCodAjuste", query = "SELECT c "
            + "FROM CompAjustesAud c WHERE c.codAjuste = :codAjuste")
    ,
    @NamedQuery(name = "CompAjustesAud.findByEstado", query = "SELECT c FROM "
            + "CompAjustesAud c WHERE c.estado = :estado")
    ,
    @NamedQuery(name = "CompAjustesAud.findByUsuarioModifico", query = "SELECT "
            + "c FROM CompAjustesAud c WHERE c.usuarioModifico "
            + "= :usuarioModifico")
    ,
    @NamedQuery(name = "CompAjustesAud.findByOperacion", query = "SELECT c "
            + "FROM CompAjustesAud c WHERE c.operacion = :operacion")
    ,
    @NamedQuery(name = "CompAjustesAud.findByIp", query = "SELECT c FROM "
            + "CompAjustesAud c WHERE c.ip = :ip")
    ,
    @NamedQuery(name = "CompAjustesAud.findByFechaModificacion", query
            = "SELECT c FROM CompAjustesAud c WHERE c.fechaModificacion = "
            + ":fechaModificacion")

})

public class CompAjustesAud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "ID_AJUSTE")
    private Long idAjuste;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "COD_AJUSTE")
    private String codAjuste;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private Long estado;
    @Column(name = "USUARIO_MODIFICO")
    private String usuarioModifico;
    @Column(name = "OPERACION")
    private String operacion;
    @Column(name = "IP")
    private String ip;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_MODIFICACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;
    @Basic(optional = false)
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public CompAjustesAud() {
    }

    /**
     *
     * @param id
     */
    public CompAjustesAud(Long id) {
        this.id = id;
    }

    /**
     *
     * @param id
     * @param idAjuste
     * @param descripcion
     * @param codAjuste
     * @param estado
     */
    public CompAjustesAud(Long id, Long idAjuste, String descripcion,
            String codAjuste, Long estado) {
        this.id = id;
        this.idAjuste = idAjuste;
        this.descripcion = descripcion;
        this.codAjuste = codAjuste;
        this.estado = estado;
    }

    /**
     *
     * @return Long
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
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
    public String getUsuarioModifico() {
        return usuarioModifico;
    }

    /**
     *
     * @param usuarioModifico
     */
    public void setUsuarioModifico(String usuarioModifico) {
        this.usuarioModifico = usuarioModifico;
    }

    /**
     *
     * @return String
     */
    public String getOperacion() {
        return operacion;
    }

    /**
     *
     * @param operacion
     */
    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    /**
     *
     * @return String
     */
    public String getIp() {
        return ip;
    }

    /**
     *
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    /**
     *
     * @param object
     * @return boolean
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompAjustesAud)) {
            return false;
        }
        CompAjustesAud other = (CompAjustesAud) object;
        if ((this.id == null && other.id != null) || (this.id != null
                && !this.id.equals(other.id))) {
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
        return "javaapplication1.CompAjustesAud[ id=" + id + " ]";
    }

    /**
     * @return Date
     */
    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    /**
     * @param fechaModificacion
     */
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

}
