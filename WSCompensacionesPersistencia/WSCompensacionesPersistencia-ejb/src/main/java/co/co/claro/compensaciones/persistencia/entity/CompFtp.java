package co.co.claro.compensaciones.persistencia.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author henry.javier.almarza.canizalez@everis.com
 * @version 1.0
 */
@Entity
@Table(name = "COMP_FTP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompFtp.findAll", query = "SELECT c FROM CompFtp c")
    ,
    @NamedQuery(name = "CompFtp.findByEstado", query = "SELECT c FROM CompFtp "
            + "c WHERE c.estado = :estado")
})
public class CompFtp implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_FTP")
    private Long idFtp;

    @Column(name = "DOMINIO_AUTENTICACION")
    private String dominioAutenticacion;

    @Column(name = "ESTADO")
    private Long estado;

    private Date hora;

    @Column(name = "PASSWORD_AUTENTICACION")
    private String passwordAutenticacion;

    @Column(name = "URL")
    private String url;

    @Column(name = "USUARIO")
    private String usuario;

    @Column(name = "USUARIO_AUTENTICACION")
    private String usuarioAutenticacion;

    @Basic(optional = false)
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public CompFtp() {
    }

    /**
     * 
     * @return Long
     */
    public Long getIdFtp() {
        return this.idFtp;
    }

    /**
     * 
     * @param idFtp 
     */
    public void setIdFtp(Long idFtp) {
        this.idFtp = idFtp;
    }

    /**
     * 
     * @return String
     */
    public String getDominioAutenticacion() {
        return this.dominioAutenticacion;
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
     * @return Long
     */
    public Long getEstado() {
        return this.estado;
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
     * @return Date
     */
    public Date getHora() {
        return this.hora;
    }

    /**
     * 
     * @param hora 
     */
    public void setHora(Date hora) {
        this.hora = hora;
    }

    /**
     * 
     * @return String
     */
    public String getPasswordAutenticacion() {
        return this.passwordAutenticacion;
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
    public String getUrl() {
        return this.url;
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
    public String getUsuario() {
        return this.usuario;
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
     * @return String
     */
    public String getUsuarioAutenticacion() {
        return this.usuarioAutenticacion;
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

}
