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
@Table(name = "COMP_INICIO_SESION_AUD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompInicioSesionAud.findAll", query = "SELECT c FROM "
            + "CompInicioSesionAud c")
    ,
    @NamedQuery(name = "CompInicioSesionAud.findByIdSesion", query = "SELECT "
            + "c FROM CompInicioSesionAud c WHERE c.idSesion = :idSesion")
    ,
    @NamedQuery(name = "CompInicioSesionAud.findByAccion", query = "SELECT c "
            + "FROM CompInicioSesionAud c WHERE c.accion = :accion")
    ,
    @NamedQuery(name = "CompInicioSesionAud.findByUsuarioModifico", query = 
            "SELECT c FROM CompInicioSesionAud c WHERE c.usuarioModifico = :usuarioModifico")
    ,
    @NamedQuery(name = "CompInicioSesionAud.findByIp", query = "SELECT c FROM "
            + "CompInicioSesionAud c WHERE c.ip = :ip")
    ,
    @NamedQuery(name = "CompInicioSesionAud.findByFechaModificacion", query = 
            "SELECT c FROM CompInicioSesionAud c WHERE c.fechaModificacion = :fechaModificacion")})

@SequenceGenerator(name = "idSesion", 
        sequenceName = "COMP_INICIO_SESION_AUD_SEQ",
        initialValue = 1, allocationSize = 1)
public class CompInicioSesionAud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SESION")
    @GeneratedValue(generator = "idSesion",
            strategy = GenerationType.SEQUENCE)
    private Long idSesion;
    @Basic(optional = false)
    @Column(name = "ACCION")
    private String accion;
    @Basic(optional = false)
    @Column(name = "USUARIO_MODIFICO")
    private String usuarioModifico;
    @Basic(optional = false)
    @Column(name = "IP")
    private String ip;
    @Basic(optional = false)
    @Column(name = "FECHA_MODIFICACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;
    @Basic(optional = false)
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public CompInicioSesionAud() {
    }

    /**
     * 
     * @param idSesion 
     */
    public CompInicioSesionAud(Long idSesion) {
        this.idSesion = idSesion;
    }

    /**
     * 
     * @param idSesion
     * @param accion
     * @param usuarioModifico
     * @param ip
     * @param fechaModificacion 
     */
    public CompInicioSesionAud(Long idSesion, String accion, String 
            usuarioModifico, String ip, Date fechaModificacion) {
        this.idSesion = idSesion;
        this.accion = accion;
        this.usuarioModifico = usuarioModifico;
        this.ip = ip;
        this.fechaModificacion = fechaModificacion;
    }

    /**
     * 
     * @return Long
     */
    public Long getIdSesion() {
        return idSesion;
    }

    /**
     * 
     * @param idSesion 
     */
    public void setIdSesion(Long idSesion) {
        this.idSesion = idSesion;
    }

    /**
     * 
     * @return String
     */
    public String getAccion() {
        return accion;
    }

    /**
     * 
     * @param accion 
     */
    public void setAccion(String accion) {
        this.accion = accion;
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
    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    /**
     * 
     * @param fechaModificacion 
     */
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
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
        hash += (idSesion != null ? idSesion.hashCode() : 0);
        return hash;
    }

    /**
     * 
     * @param object
     * @return boolean
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompInicioSesionAud)) {
            return false;
        }
        CompInicioSesionAud other = (CompInicioSesionAud) object;
        if ((this.idSesion == null && other.idSesion != null) || 
                (this.idSesion != null && !this.idSesion.equals(
                        other.idSesion))) {
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
        return "co.com.claro.compensaciones.entity.CompInicioSesionAud[ "
                + "idSesion=" + idSesion + " ]";
    }

}
