package co.com.claro.compensaciones.entity;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Mapea la tabla de base de datos de COMP_PARAM_MAXIMO
 *
 * @author vcastril-@everis
 * @author henry.javier.almarza.canizalez@everis.com
 * @version 1.0
 * @since 04/09/2018
 */
@Entity
@Table(name = "COMP_PARAM_MAXIMO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompParamMaximo.findAll",
            query = "SELECT c FROM CompParamMaximo c")
    ,
    @NamedQuery(name = "CompParamMaximo.findByIdParamSap",
            query = "SELECT c FROM CompParamMaximo c "
            + "WHERE c.idParamSap = :idParamSap")
    ,
    @NamedQuery(name = "CompParamMaximo.findByUrl",
            query = "SELECT c FROM CompParamMaximo c "
            + "WHERE c.url = :url")
    ,
    @NamedQuery(name = "CompParamMaximo.findByDominioAutenticacion",
            query = "SELECT c FROM CompParamMaximo c WHERE "
            + "c.dominioAutenticacion = :dominioAutenticacion")
    ,
    @NamedQuery(name = "CompParamMaximo.findByUsuarioAutenticacion",
            query = "SELECT c FROM CompParamMaximo c WHERE "
            + "c.usuarioAutenticacion = :usuarioAutenticacion")
    ,
    @NamedQuery(name = "CompParamMaximo.findByPasswordAutenticacion",
            query = "SELECT c FROM CompParamMaximo c WHERE"
            + " c.passwordAutenticacion = :passwordAutenticacion")
    ,
    @NamedQuery(name = "CompParamMaximo.findByHora",
            query = "SELECT c FROM CompParamMaximo c WHERE c.hora = :hora")
    ,
    @NamedQuery(name = "CompParamMaximo.findByEstado",
            query = "SELECT c FROM CompParamMaximo c WHERE c.estado = :estado")
    ,
    @NamedQuery(name = "CompParamMaximo.findByUsuario",
            query = "SELECT c FROM CompParamMaximo c "
            + "WHERE c.usuario = :usuario")})
public class CompParamMaximo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_PARAM_SAP")
    private Long idParamSap;
    @Basic(optional = false)
    @Column(name = "URL")
    private String url;
    @Basic(optional = false)
    @Column(name = "DOMINIO_AUTENTICACION")
    private String dominioAutenticacion;
    @Basic(optional = false)
    @Column(name = "USUARIO_AUTENTICACION")
    private String usuarioAutenticacion;
    @Basic(optional = false)
    @Column(name = "PASSWORD_AUTENTICACION")
    private String passwordAutenticacion;
    @Basic(optional = false)
    @Column(name = "HORA")
    private String hora;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private Long estado;
    @Column(name = "USUARIO")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public CompParamMaximo() {
    }

    /**
     * 
     * @param idParamSap 
     */
    public CompParamMaximo(Long idParamSap) {
        this.idParamSap = idParamSap;
    }

    /**
     * 
     * @param idParamSap
     * @param url
     * @param dominioAutenticacion
     * @param usuarioAutenticacion
     * @param passwordAutenticacion
     * @param hora
     * @param estado 
     */
    public CompParamMaximo(Long idParamSap, String url,
            String dominioAutenticacion,
            String usuarioAutenticacion,
            String passwordAutenticacion, String hora, Long estado) {
        this.idParamSap = idParamSap;
        this.url = url;
        this.dominioAutenticacion = dominioAutenticacion;
        this.usuarioAutenticacion = usuarioAutenticacion;
        this.passwordAutenticacion = passwordAutenticacion;
        this.hora = hora;
        this.estado = estado;
    }

    /**
     * 
     * @return Long
     */
    public Long getIdParamSap() {
        return idParamSap;
    }

    /**
     * 
     * @param idParamSap 
     */
    public void setIdParamSap(Long idParamSap) {
        this.idParamSap = idParamSap;
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
    public String getDominioAutenticacion() {
        return dominioAutenticacion;
    }

    /**
     * 
     * @param dominioAutenticacion 
     */
    public void setDominioAutenticacion(String dominioAutenticacion) {
        this.dominioAutenticacion = dominioAutenticacion;
    }

    /**
     * 
     * @return String
     */
    public String getUsuarioAutenticacion() {
        return usuarioAutenticacion;
    }

    /**
     * 
     * @param usuarioAutenticacion 
     */
    public void setUsuarioAutenticacion(String usuarioAutenticacion) {
        this.usuarioAutenticacion = usuarioAutenticacion;
    }

    /**
     * 
     * @return String
     */
    public String getPasswordAutenticacion() {
        return passwordAutenticacion;
    }

    /**
     * 
     * @param passwordAutenticacion 
     */
    public void setPasswordAutenticacion(String passwordAutenticacion) {
        this.passwordAutenticacion = passwordAutenticacion;
    }

    /**
     * 
     * @return String
     */
    public String getHora() {
        return hora;
    }

    /**
     * 
     * @param hora 
     */
    public void setHora(String hora) {
        this.hora = hora;
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
        hash += (idParamSap != null ? idParamSap.hashCode() : 0);
        return hash;
    }

    /**
     * 
     * @param object
     * @return boolean
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompParamMaximo)) {
            return false;
        }
        CompParamMaximo other = (CompParamMaximo) object;
        if ((this.idParamSap == null && other.idParamSap != null)
                || (this.idParamSap != null
                && !this.idParamSap.equals(other.idParamSap))) {
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
        return "newpackage.CompParamMaximo[ idParamSap=" + idParamSap + " ]";
    }

}
