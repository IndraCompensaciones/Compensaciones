/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.compensaciones.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pradod
 */
@Entity
@Table(name = "VW_VALIDACION_NODOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwValidacionNodos.findAll", query = "SELECT v FROM VwValidacionNodos v")
    , @NamedQuery(name = "VwValidacionNodos.findByIdNodo", query = "SELECT v FROM VwValidacionNodos v WHERE v.idNodo = :idNodo")
    , @NamedQuery(name = "VwValidacionNodos.findByNombreCi", query = "SELECT v FROM VwValidacionNodos v WHERE v.nombreCi = :nombreCi")
    , @NamedQuery(name = "VwValidacionNodos.findByIncidencia", query = "SELECT v FROM VwValidacionNodos v WHERE v.incidencia = :incidencia")
    , @NamedQuery(name = "VwValidacionNodos.findByCiPrincipal", query = "SELECT v FROM VwValidacionNodos v WHERE v.ciPrincipal = :ciPrincipal")
    , @NamedQuery(name = "VwValidacionNodos.findByDuracion", query = "SELECT v FROM VwValidacionNodos v WHERE v.duracion = :duracion")
    , @NamedQuery(name = "VwValidacionNodos.findByIdServicio", query = "SELECT v FROM VwValidacionNodos v WHERE v.idServicio = :idServicio")
    , @NamedQuery(name = "VwValidacionNodos.findByEstadoVerificar", query = "SELECT v FROM VwValidacionNodos v WHERE v.estadoVerificar = :estadoVerificar")
    , @NamedQuery(name = "VwValidacionNodos.findByObservacion", query = "SELECT v FROM VwValidacionNodos v WHERE v.observacion = :observacion")})
public class VwValidacionNodos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_NODO")
    private long idNodo;
    @Size(max = 100)
    @Column(name = "NOMBRE_CI")
    private String nombreCi;
    @Size(max = 20)
    @Column(name = "INCIDENCIA")
    private String incidencia;
    @Size(max = 30)
    @Column(name = "CI_PRINCIPAL")
    private String ciPrincipal;
    @Size(max = 20)
    @Column(name = "DURACION")
    private String duracion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_SERVICIO")
    private Long idServicio;
    @Size(max = 100)
    @Column(name = "ESTADO_VERIFICAR")
    private String estadoVerificar;
    @Size(max = 100)
    @Column(name = "OBSERVACION")
    private String observacion;
    @Size(max = 100)
    @Column(name = "NOMBRE_ESTADO")
    private String nombreEstado;

    public VwValidacionNodos() {
    }

    public long getIdNodo() {
        return idNodo;
    }

    public void setIdNodo(long idNodo) {
        this.idNodo = idNodo;
    }

    public String getNombreCi() {
        return nombreCi;
    }

    public void setNombreCi(String nombreCi) {
        this.nombreCi = nombreCi;
    }

    public String getIncidencia() {
        return incidencia;
    }

    public void setIncidencia(String incidencia) {
        this.incidencia = incidencia;
    }

    public String getCiPrincipal() {
        return ciPrincipal;
    }

    public void setCiPrincipal(String ciPrincipal) {
        this.ciPrincipal = ciPrincipal;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Long getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Long idServicio) {
        this.idServicio = idServicio;
    }

    public String getEstadoVerificar() {
        return estadoVerificar;
    }

    public void setEstadoVerificar(String estadoVerificar) {
        this.estadoVerificar = estadoVerificar;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getNombreEstado() {
        return nombreEstado;
    }

    public void setNombreEstado(String nombreEstado) {
        this.nombreEstado = nombreEstado;
    }
    
}
