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
@Table(name = "COMP_CONSTANTES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompConstantes.findAll", query = "SELECT c FROM "
            + "CompConstantes c")
    ,
    @NamedQuery(name = "CompConstantes.findByCodigo", query = "SELECT c FROM "
            + "CompConstantes c WHERE c.codigo = :codigo")
    ,
    @NamedQuery(name = "CompConstantes.findByNombre", query = "SELECT c FROM "
            + "CompConstantes c WHERE c.nombre = :nombre")
    ,
    @NamedQuery(name = "CompConstantes.findByValor", query = "SELECT c FROM "
            + "CompConstantes c WHERE c.valor = :valor")
    ,
    @NamedQuery(name = "CompConstantes.findByDescripcion", query = "SELECT c "
            + "FROM CompConstantes c WHERE c.descripcion = :descripcion")
    ,
    @NamedQuery(name = "CompConstantes.findByUsuarioCreacion", query = 
            "SELECT c FROM CompConstantes c WHERE c.usuarioCreacion "
                    + "= :usuarioCreacion")
    ,
    @NamedQuery(name = "CompConstantes.findByFechaCreacion", query = "SELECT "
            + "c FROM CompConstantes c WHERE c.fechaCreacion = :fechaCreacion")
    ,
    @NamedQuery(name = "CompConstantes.findByUsuarioModificacion", query = 
            "SELECT c FROM CompConstantes c WHERE c.usuarioModificacion "
                    + "= :usuarioModificacion")
    ,
    @NamedQuery(name = "CompConstantes.findByFechaModificacion", query = 
            "SELECT c FROM CompConstantes c WHERE c.fechaModificacion "
                    + "= :fechaModificacion")
    ,
    @NamedQuery(name = "CompConstantes.findByEstado", query = "SELECT c FROM "
            + "CompConstantes c WHERE c.estado = :estado")
    ,
     @NamedQuery(name = "CompConstantes.findByUsuEst",
            query = "SELECT m FROM CompConstantes m "
            + "WHERE m.nombre = "
            + ":nombre and m.estado =:estado")

})

@SequenceGenerator(name = "codigo", sequenceName = "COMP_CONSTANTES_SEQ",
        initialValue = 1, allocationSize = 1)
public class CompConstantes implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO")
    @GeneratedValue(generator = "codigo",
            strategy = GenerationType.SEQUENCE)
    private Long codigo;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "VALOR")
    private String valor;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "USUARIO_CREACION")
    private String usuarioCreacion;
    @Basic(optional = false)
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;
    @Column(name = "USUARIO_MODIFICACION")
    private String usuarioModificacion;
    @Column(name = "FECHA_MODIFICACION")
    @Temporal(TemporalType.DATE)
    private Date fechaModificacion;
    @Basic(optional = false)
    @Column(name = "ESTADO")
    private Long estado;

    public CompConstantes() {
    }

    public CompConstantes(Long codigo) {
        this.codigo = codigo;
    }

    /**
     * 
     * @param codigo
     * @param nombre
     * @param valor
     * @param descripcion
     * @param fechaCreacion
     * @param estado 
     */
    public CompConstantes(Long codigo, String nombre, String valor, 
            String descripcion, Date fechaCreacion, Long estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.valor = valor;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
    }

    /**
     * 
     * @return Long
     */
    public Long getCodigo() {
        return codigo;
    }

    /**
     * 
     * @param codigo 
     */
    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    /**
     * 
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return String
     */
    public String getValor() {
        return valor;
    }

    /**
     * 
     * @param valor 
     */
    public void setValor(String valor) {
        this.valor = valor;
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
    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    /**
     * 
     * @param usuarioCreacion 
     */
    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
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
     * @return String
     */
    public String getUsuarioModificacion() {
        return usuarioModificacion;
    }

    /**
     * 
     * @param usuarioModificacion 
     */
    public void setUsuarioModificacion(String usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
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
     * @return int
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    /**
     * 
     * @param object
     * @return boolean
     */
    @Override
    public boolean equals(Object object) {
        if (!(object instanceof CompConstantes)) {
            return false;
        }
        CompConstantes other = (CompConstantes) object;
        if ((this.codigo == null && other.codigo != null)
                || (this.codigo != null && !this.codigo.equals(other.codigo))) {
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
        return "xml.restaurante.CompConstantes[ codigo=" + codigo + " ]";
    }

}
