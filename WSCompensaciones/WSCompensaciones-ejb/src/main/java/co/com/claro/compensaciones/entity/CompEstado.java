package co.com.claro.compensaciones.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author henry.javier.almarza.canizalez@everis.com
 * @version 1.0
 */
@Entity
@Table(name = "COMP_ESTADO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompEstado.findAll", query = "SELECT c FROM "
            + "CompEstado c")
    ,
    @NamedQuery(name = "CompEstado.findByDescription", query = "SELECT c FROM "
            + "CompEstado c where c.descripcion = :descripcion")
    ,
    @NamedQuery(name = "CompEstado.findByProceso", query = "SELECT c FROM "
            + "CompEstado c where c.proceso = :proceso")
})
public class CompEstado implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_ESTADOS")
    private Long idEstados;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "PROCESO")
    private String proceso;
    
    @Basic(optional = false)
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public CompEstado() {
    }

    public CompEstado(Long idEstados, String descripcion, String proceso, Date fechaCreacion) {
        this.idEstados = idEstados;
        this.descripcion = descripcion;
        this.proceso = proceso;
        this.fechaCreacion = fechaCreacion;
    }
    
    

    /**
     * 
     * @return Long
     */
    public Long getIdEstados() {
        return this.idEstados;
    }

    /**
     * 
     * @param idEstados 
     */
    public void setIdEstados(Long idEstados) {
        this.idEstados = idEstados;
    }

    /**
     * 
     * @return String
     */
    public String getDescripcion() {
        return this.descripcion;
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
    public String getProceso() {
        return this.proceso;
    }

    /**
     * 
     * @param proceso 
     */
    public void setProceso(String proceso) {
        this.proceso = proceso;
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
