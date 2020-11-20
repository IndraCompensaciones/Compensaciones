package co.co.claro.compensaciones.persistencia.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author henry.javier.almarza.canizalezeveris.com
 * @version 1.0
 */


@Entity
@Table(name = "COMP_COMPENSACION_CONFIG")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompCompensacionConfig.findAll", query = "SELECT c "
            + "FROM CompCompensacionConfig c")
    ,
    @NamedQuery(name = "CompCompensacionConfig.findByEstado", query = "SELECT "
            + "c FROM CompCompensacionConfig c where c.estado= :estado")
})
@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
            name = "COMP_PROCESO_NODOS_SP",
            procedureName = "COMP_PROCESO_NODOS_SP",
            parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type
                        = String.class, name = "FECHA_CIERRE")
                ,
            @StoredProcedureParameter(mode = ParameterMode.IN, type
                        = String.class, name = "USUARIO")
                ,
            @StoredProcedureParameter(mode = ParameterMode.IN, type
                        = String.class, name = "FECHA_CORTE_INI")
                ,
            @StoredProcedureParameter(mode = ParameterMode.IN, type
                        = String.class, name = "FECHA_CORTE_FIN"),})
    ,
@NamedStoredProcedureQuery(
            name = "HORAS_DISCONTINUAS_NODOS_SP",
            procedureName = "HORAS_DISCONTINUAS_NODOS_SP",
            parameters = {
                @StoredProcedureParameter(mode = ParameterMode.IN, type
                        = String.class, name = "fecha_ini")
                ,
            @StoredProcedureParameter(mode = ParameterMode.IN, type
                        = String.class, name = "usuario")
            })
})
public class CompCompensacionConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    private Long estado;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_FIN")
    private Date fechaFin;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA_INICIO")
    private Date fechaInicio;

    @Temporal(TemporalType.TIMESTAMP)
    private Date hora;

    private Long periodicidad;
    
    @Basic(optional = false)
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public CompCompensacionConfig() {
    }

    /**
     * 
     * @return Long
     */
    public Long getId() {
        return this.id;
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
    public Date getFechaFin() {
        return this.fechaFin;
    }

    /**
     * 
     * @param fechaFin 
     */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * 
     * @return Date
     */
    public Date getFechaInicio() {
        return this.fechaInicio;
    }

    /**
     * 
     * @param fechaInicio 
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
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
     * @return Long
     */
    public Long getPeriodicidad() {
        return this.periodicidad;
    }

    /**
     * 
     *  @param periodicidad 
     */
    public void setPeriodicidad(Long periodicidad) {
        this.periodicidad = periodicidad;
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
