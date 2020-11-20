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
 * Mapea la tabla de base de datos de COMP_ESTADOS
 *
 * @author vcastril-@everis
 * @version 1.0 
 * @since 04/09/2018
 */
@Entity
@Table(name = "COMP_ESTADO_SISTEMA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompEstadoSistema.findAll", 
            query = "SELECT c FROM CompEstadoSistema c"),
    @NamedQuery(name = "CompEstadoSistema.findByIdEstado",
            query = "SELECT c FROM CompEstadoSistema c "
                    + "WHERE c.idEstado = :idEstado"),
    @NamedQuery(name = "CompEstadoSistema.findByDescripcion", 
            query = "SELECT c FROM CompEstadoSistema c "
                    + "WHERE c.descripcion = :descripcion"),
    @NamedQuery(name = "CompEstadoSistema.findByCompensa", 
            query = "SELECT c FROM CompEstadoSistema c "
                    + "WHERE c.compensa = :compensa"),
    @NamedQuery(name = "CompEstadoSistema.findByEstado", 
            query = "SELECT c FROM CompEstadoSistema c "
                    + "WHERE c.estado = :estado"),
    @NamedQuery(name = "CompEstadoSistema.findByUsuario",
            query = "SELECT c FROM CompEstadoSistema c "
                    + "WHERE c.usuario = :usuario")})
public class CompEstadoSistema implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_ESTADO")
    private Long idEstado;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "COMPENSA")
    private Long compensa;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private Long estado;
    @Column(name = "USUARIO")
    private String usuario;
    @Basic(optional = false)
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public CompEstadoSistema() {
    }

    /**
     * 
     * @param idEstado 
     */
    public CompEstadoSistema(Long idEstado) {
        this.idEstado = idEstado;
    }

     /**
      * 
      * @param idEstado
      * @param descripcion
      * @param compensa
      * @param estado 
      */
    public CompEstadoSistema(Long idEstado, String descripcion, 
            Long compensa, Long estado) {
        this.idEstado = idEstado;
        this.descripcion = descripcion;
        this.compensa = compensa;
        this.estado = estado;
    }
    
    /**
     * 
     * @return Long
     */
    public Long getIdEstado() {
        return idEstado;
    }

    /**
     * 
     * @param idEstado 
     */
    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
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
    public Long getCompensa() {
        return compensa;
    }

    /**
     * 
     * @param compensa 
     */
    public void setCompensa(Long compensa) {
        this.compensa = compensa;
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
        hash += (idEstado != null ? idEstado.hashCode() : 0);
        return hash;
    }

    /**
     * 
     * @param object
     * @return boolean
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompEstadoSistema)) {
            return false;
        }
        CompEstadoSistema other = (CompEstadoSistema) object;
        if ((this.idEstado == null && other.idEstado != null) || 
                (this.idEstado != null &&
                !this.idEstado.equals(other.idEstado))) {
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
        return "co.com.claro.compensaciones.entity[ "
                + "idEstado=" + idEstado + " ]";
    }
    
}
