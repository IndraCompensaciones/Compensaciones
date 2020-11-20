/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.compensaciones.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pradod
 */
@Entity
@Table(name = "COMP_MAXIMO_V2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompMaximoV2.findAll", query = "SELECT c FROM CompMaximoV2 c")
    , @NamedQuery(name = "CompMaximoV2.findByIdMaximo", query = "SELECT c FROM CompMaximoV2 c WHERE c.idMaximo = :idMaximo")
    , @NamedQuery(name = "CompMaximoV2.findByIncidencia", query = "SELECT c FROM CompMaximoV2 c WHERE c.incidencia = :incidencia")
    , @NamedQuery(name = "CompMaximoV2.findByDescripcionIncidencia", query = "SELECT c FROM CompMaximoV2 c WHERE c.descripcionIncidencia = :descripcionIncidencia")
    , @NamedQuery(name = "CompMaximoV2.findByEstado", query = "SELECT c FROM CompMaximoV2 c WHERE c.estado = :estado")
    , @NamedQuery(name = "CompMaximoV2.findByDescripcionEstado", query = "SELECT c FROM CompMaximoV2 c WHERE c.descripcionEstado = :descripcionEstado")
    , @NamedQuery(name = "CompMaximoV2.findByCiPrincipal", query = "SELECT c FROM CompMaximoV2 c WHERE c.ciPrincipal = :ciPrincipal")
    , @NamedQuery(name = "CompMaximoV2.findByDescripcionCiPrincipal", query = "SELECT c FROM CompMaximoV2 c WHERE c.descripcionCiPrincipal = :descripcionCiPrincipal")
    , @NamedQuery(name = "CompMaximoV2.findByUbicacion", query = "SELECT c FROM CompMaximoV2 c WHERE c.ubicacion = :ubicacion")
    , @NamedQuery(name = "CompMaximoV2.findByProblema", query = "SELECT c FROM CompMaximoV2 c WHERE c.problema = :problema")
    , @NamedQuery(name = "CompMaximoV2.findByDescripcionProblema", query = "SELECT c FROM CompMaximoV2 c WHERE c.descripcionProblema = :descripcionProblema")
    , @NamedQuery(name = "CompMaximoV2.findByCausa", query = "SELECT c FROM CompMaximoV2 c WHERE c.causa = :causa")
    , @NamedQuery(name = "CompMaximoV2.findByDescripcionCausa", query = "SELECT c FROM CompMaximoV2 c WHERE c.descripcionCausa = :descripcionCausa")
    , @NamedQuery(name = "CompMaximoV2.findByResolucion", query = "SELECT c FROM CompMaximoV2 c WHERE c.resolucion = :resolucion")
    , @NamedQuery(name = "CompMaximoV2.findByDescripcionResolucion", query = "SELECT c FROM CompMaximoV2 c WHERE c.descripcionResolucion = :descripcionResolucion")
    , @NamedQuery(name = "CompMaximoV2.findByModificadoPor", query = "SELECT c FROM CompMaximoV2 c WHERE c.modificadoPor = :modificadoPor")
    , @NamedQuery(name = "CompMaximoV2.findByFechaModificacion", query = "SELECT c FROM CompMaximoV2 c WHERE c.fechaModificacion = :fechaModificacion")
    , @NamedQuery(name = "CompMaximoV2.findByRegional", query = "SELECT c FROM CompMaximoV2 c WHERE c.regional = :regional")
    , @NamedQuery(name = "CompMaximoV2.findByPrioridad", query = "SELECT c FROM CompMaximoV2 c WHERE c.prioridad = :prioridad")
    , @NamedQuery(name = "CompMaximoV2.findByDepartamento", query = "SELECT c FROM CompMaximoV2 c WHERE c.departamento = :departamento")
    , @NamedQuery(name = "CompMaximoV2.findByCiudad", query = "SELECT c FROM CompMaximoV2 c WHERE c.ciudad = :ciudad")
    , @NamedQuery(name = "CompMaximoV2.findBySds", query = "SELECT c FROM CompMaximoV2 c WHERE c.sds = :sds")
    , @NamedQuery(name = "CompMaximoV2.findByDescripcionCi", query = "SELECT c FROM CompMaximoV2 c WHERE c.descripcionCi = :descripcionCi")
    , @NamedQuery(name = "CompMaximoV2.findByNombreCi", query = "SELECT c FROM CompMaximoV2 c WHERE c.nombreCi = :nombreCi")
    , @NamedQuery(name = "CompMaximoV2.findByClasificacion", query = "SELECT c FROM CompMaximoV2 c WHERE c.clasificacion = :clasificacion")
    , @NamedQuery(name = "CompMaximoV2.findByJustificacionRetraso", query = "SELECT c FROM CompMaximoV2 c WHERE c.justificacionRetraso = :justificacionRetraso")
    , @NamedQuery(name = "CompMaximoV2.findByFechaJustificacion", query = "SELECT c FROM CompMaximoV2 c WHERE c.fechaJustificacion = :fechaJustificacion")
    , @NamedQuery(name = "CompMaximoV2.findByFechaNotifiacion", query = "SELECT c FROM CompMaximoV2 c WHERE c.fechaNotifiacion = :fechaNotifiacion")
    , @NamedQuery(name = "CompMaximoV2.findByFechaResolucion", query = "SELECT c FROM CompMaximoV2 c WHERE c.fechaResolucion = :fechaResolucion")
    , @NamedQuery(name = "CompMaximoV2.findByHoraNotificacion", query = "SELECT c FROM CompMaximoV2 c WHERE c.horaNotificacion = :horaNotificacion")
    , @NamedQuery(name = "CompMaximoV2.findByHoraResolucion", query = "SELECT c FROM CompMaximoV2 c WHERE c.horaResolucion = :horaResolucion")
    , @NamedQuery(name = "CompMaximoV2.findByDuracionIncidencia", query = "SELECT c FROM CompMaximoV2 c WHERE c.duracionIncidencia = :duracionIncidencia")
    , @NamedQuery(name = "CompMaximoV2.findByFechaInicioFalla", query = "SELECT c FROM CompMaximoV2 c WHERE c.fechaInicioFalla = :fechaInicioFalla")
    , @NamedQuery(name = "CompMaximoV2.findByFechaFinFalla", query = "SELECT c FROM CompMaximoV2 c WHERE c.fechaFinFalla = :fechaFinFalla")
    , @NamedQuery(name = "CompMaximoV2.findByHoraInicioFalla", query = "SELECT c FROM CompMaximoV2 c WHERE c.horaInicioFalla = :horaInicioFalla")
    , @NamedQuery(name = "CompMaximoV2.findByDuracionAfectacionCi", query = "SELECT c FROM CompMaximoV2 c WHERE c.duracionAfectacionCi = :duracionAfectacionCi")
    , @NamedQuery(name = "CompMaximoV2.findByCodigoAreaResponsable", query = "SELECT c FROM CompMaximoV2 c WHERE c.codigoAreaResponsable = :codigoAreaResponsable")
    , @NamedQuery(name = "CompMaximoV2.findByNombreAreaResponsable", query = "SELECT c FROM CompMaximoV2 c WHERE c.nombreAreaResponsable = :nombreAreaResponsable")
    , @NamedQuery(name = "CompMaximoV2.findByUsuariosAfectadosInternet", query = "SELECT c FROM CompMaximoV2 c WHERE c.usuariosAfectadosInternet = :usuariosAfectadosInternet")
    , @NamedQuery(name = "CompMaximoV2.findByUsuariosAfectadosTv", query = "SELECT c FROM CompMaximoV2 c WHERE c.usuariosAfectadosTv = :usuariosAfectadosTv")
    , @NamedQuery(name = "CompMaximoV2.findByUsuarisoAfectadosVoz", query = "SELECT c FROM CompMaximoV2 c WHERE c.usuarisoAfectadosVoz = :usuarisoAfectadosVoz")
    , @NamedQuery(name = "CompMaximoV2.findByCodigoIngCreador", query = "SELECT c FROM CompMaximoV2 c WHERE c.codigoIngCreador = :codigoIngCreador")
    , @NamedQuery(name = "CompMaximoV2.findByNombreIngCreador", query = "SELECT c FROM CompMaximoV2 c WHERE c.nombreIngCreador = :nombreIngCreador")
    , @NamedQuery(name = "CompMaximoV2.findByDireccionEquipo", query = "SELECT c FROM CompMaximoV2 c WHERE c.direccionEquipo = :direccionEquipo")
    , @NamedQuery(name = "CompMaximoV2.findByCodIngResponsable", query = "SELECT c FROM CompMaximoV2 c WHERE c.codIngResponsable = :codIngResponsable")
    , @NamedQuery(name = "CompMaximoV2.findByMotivoExclusion", query = "SELECT c FROM CompMaximoV2 c WHERE c.motivoExclusion = :motivoExclusion")})

@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(
        name = "COMP_REGLAS_NODOS",
        procedureName = "COMP_REGLAS_NODOS",
        parameters = {
            @StoredProcedureParameter(mode = ParameterMode.IN,
                    type = String.class, name = "FECHA_INICIO"),
            @StoredProcedureParameter(mode = ParameterMode.IN,
                    type = String.class, name = "FECHA_CORTE")
        }
    )
})
@NamedNativeQueries(
        @NamedNativeQuery(
        name = "getdata",
        query = "{ call test_cursor()}"
))


public class CompMaximoV2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_MAXIMO")
    @SequenceGenerator(name = "COMP_MAXIMO_V2_SEQ2",
            sequenceName = "COMP_MAXIMO_V2_SEQ2", initialValue = 1,
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "COMP_MAXIMO_V2_SEQ2")
    private Long idMaximo;

    @Size(max = 20)
    @Column(name = "INCIDENCIA")
    private String incidencia;

    @Size(max = 1000)
    @Column(name = "DESCRIPCION_INCIDENCIA")
    private String descripcionIncidencia;

    @Size(max = 20)
    @Column(name = "ESTADO")
    private String estado;

    @Size(max = 1000)
    @Column(name = "DESCRIPCION_ESTADO")
    private String descripcionEstado;

    @Column(name = "CI_PRINCIPAL")
    private String ciPrincipal;

    @Size(max = 1000)
    @Column(name = "DESCRIPCION_CI_PRINCIPAL")
    private String descripcionCiPrincipal;

    @Size(max = 50)
    @Column(name = "UBICACION")
    private String ubicacion;

    @Size(max = 250)
    @Column(name = "PROBLEMA")
    private String problema;

    @Size(max = 1000)
    @Column(name = "DESCRIPCION_PROBLEMA")
    private String descripcionProblema;

    @Size(max = 200)
    @Column(name = "CAUSA")
    private String causa;

    @Size(max = 1000)
    @Column(name = "DESCRIPCION_CAUSA")
    private String descripcionCausa;

    @Size(max = 50)
    @Column(name = "RESOLUCION")
    private String resolucion;

    @Size(max = 1000)
    @Column(name = "DESCRIPCION_RESOLUCION")
    private String descripcionResolucion;

    @Size(max = 50)
    @Column(name = "MODIFICADO_POR")
    private String modificadoPor;

    @Column(name = "FECHA_MODIFICACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;

    @Size(max = 50)
    @Column(name = "REGIONAL")
    private String regional;

    @Column(name = "PRIORIDAD")
    private BigInteger prioridad;

    @Size(max = 50)
    @Column(name = "DEPARTAMENTO")
    private String departamento;

    @Size(max = 100)
    @Column(name = "CIUDAD")
    private String ciudad;

    @Size(max = 100)
    @Column(name = "SDS")
    private String sds;

    @Size(max = 1000)
    @Column(name = "DESCRIPCION_CI")
    private String descripcionCi;

    @Size(max = 100)
    @Column(name = "NOMBRE_CI")
    private String nombreCi;

    @Size(max = 200)
    @Column(name = "CLASIFICACION")
    private String clasificacion;

    @Size(max = 1000)
    @Column(name = "JUSTIFICACION_RETRASO")
    private String justificacionRetraso;

    @Column(name = "FECHA_JUSTIFICACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaJustificacion;

    @Column(name = "FECHA_NOTIFIACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaNotifiacion;

    @Column(name = "FECHA_RESOLUCION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaResolucion;

    @Size(max = 20)
    @Column(name = "HORA_NOTIFICACION")
    private String horaNotificacion;

    @Size(max = 20)
    @Column(name = "HORA_RESOLUCION")
    private String horaResolucion;

    @Size(max = 100)
    @Column(name = "DURACION_INCIDENCIA")
    private String duracionIncidencia;

    @Column(name = "FECHA_INICIO_FALLA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaInicioFalla;

    @Column(name = "FECHA_FIN_FALLA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFinFalla;

    @Size(max = 20)
    @Column(name = "HORA_INICIO_FALLA")
    private String horaInicioFalla;

    @Size(max = 20)
    @Column(name = "HORA_FIN_FALLA")
    private String horaFinFalla;

    @Size(max = 100)
    @Column(name = "DURACION_AFECTACION_CI")
    private String duracionAfectacionCi;

    @Size(max = 100)
    @Column(name = "TIPO_AFECTACION")
    private String tipoAfectacion;

    @Size(max = 100)
    @Column(name = "CODIGO_AREA_RESPONSABLE")
    private String codigoAreaResponsable;

    @Size(max = 200)
    @Column(name = "NOMBRE_AREA_RESPONSABLE")
    private String nombreAreaResponsable;

    @Column(name = "USUARIOS_AFECTADOS_INTERNET")
    private BigInteger usuariosAfectadosInternet;

    @Column(name = "USUARIOS_AFECTADOS_TV")
    private BigInteger usuariosAfectadosTv;

    @Column(name = "USUARIOS_AFECTADOS_VOZ")
    private BigInteger usuarisoAfectadosVoz;

    @Size(max = 50)
    @Column(name = "CODIGO_ING_CREADOR")
    private String codigoIngCreador;

    @Size(max = 50)
    @Column(name = "NOMBRE_ING_CREADOR")
    private String nombreIngCreador;

    @Size(max = 200)
    @Column(name = "DIRECCION_EQUIPO")
    private String direccionEquipo;

    @Size(max = 50)
    @Column(name = "COD_ING_RESPONSABLE")
    private String codIngResponsable;

    @Size(max = 100)
    @Column(name = "NOM_INGENIERO_RESPONSABLE")
    private String nomIngenieroResponsable;

    @Size(max = 100)
    @Column(name = "TICKET_EXTERNO")
    private String ticketExterno;

    @Size(max = 100)
    @Column(name = "EXCLUIDO")
    private String excluido;

    @Size(max = 1000)
    @Column(name = "MOTIVO_EXCLUSION")
    private String motivoExclusion;

    @Column(name = "COD_ANOMALIA")
    private String codAnomalia;

    @Column(name = "DESC_COD_ANOMALIA")
    private String descCodAnomalia;


    public CompMaximoV2() {
    }

    public CompMaximoV2(Long idMaximo) {
        this.idMaximo = idMaximo;
    }

    public Long getIdMaximo() {
        return idMaximo;
    }

    public void setIdMaximo(Long idMaximo) {
        this.idMaximo = idMaximo;
    }

    public String getIncidencia() {
        return incidencia;
    }

    public void setIncidencia(String incidencia) {
        this.incidencia = incidencia;
    }

    public String getDescripcionIncidencia() {
        return descripcionIncidencia;
    }

    public void setDescripcionIncidencia(String descripcionIncidencia) {
        this.descripcionIncidencia = descripcionIncidencia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcionEstado() {
        return descripcionEstado;
    }

    public void setDescripcionEstado(String descripcionEstado) {
        this.descripcionEstado = descripcionEstado;
    }

    public String getCiPrincipal() {
        return ciPrincipal;
    }

    public void setCiPrincipal(String ciPrincipal) {
        this.ciPrincipal = ciPrincipal;
    }

    public String getDescripcionCiPrincipal() {
        return descripcionCiPrincipal;
    }

    public void setDescripcionCiPrincipal(String descripcionCiPrincipal) {
        this.descripcionCiPrincipal = descripcionCiPrincipal;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getDescripcionProblema() {
        return descripcionProblema;
    }

    public void setDescripcionProblema(String descripcionProblema) {
        this.descripcionProblema = descripcionProblema;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public String getDescripcionCausa() {
        return descripcionCausa;
    }

    public void setDescripcionCausa(String descripcionCausa) {
        this.descripcionCausa = descripcionCausa;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getDescripcionResolucion() {
        return descripcionResolucion;
    }

    public void setDescripcionResolucion(String descripcionResolucion) {
        this.descripcionResolucion = descripcionResolucion;
    }

    public String getModificadoPor() {
        return modificadoPor;
    }

    public void setModificadoPor(String modificadoPor) {
        this.modificadoPor = modificadoPor;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public String getRegional() {
        return regional;
    }

    public void setRegional(String regional) {
        this.regional = regional;
    }

    public BigInteger getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(BigInteger prioridad) {
        this.prioridad = prioridad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getSds() {
        return sds;
    }

    public void setSds(String sds) {
        this.sds = sds;
    }

    public String getDescripcionCi() {
        return descripcionCi;
    }

    public void setDescripcionCi(String descripcionCi) {
        this.descripcionCi = descripcionCi;
    }

    public String getNombreCi() {
        return nombreCi;
    }

    public void setNombreCi(String nombreCi) {
        this.nombreCi = nombreCi;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getJustificacionRetraso() {
        return justificacionRetraso;
    }

    public void setJustificacionRetraso(String justificacionRetraso) {
        this.justificacionRetraso = justificacionRetraso;
    }

    public Date getFechaJustificacion() {
        return fechaJustificacion;
    }

    public void setFechaJustificacion(Date fechaJustificacion) {
        this.fechaJustificacion = fechaJustificacion;
    }

    public Date getFechaNotifiacion() {
        return fechaNotifiacion;
    }

    public void setFechaNotifiacion(Date fechaNotifiacion) {
        this.fechaNotifiacion = fechaNotifiacion;
    }

    public Date getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(Date fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public String getHoraNotificacion() {
        return horaNotificacion;
    }

    public void setHoraNotificacion(String horaNotificacion) {
        this.horaNotificacion = horaNotificacion;
    }

    public String getHoraResolucion() {
        return horaResolucion;
    }

    public void setHoraResolucion(String horaResolucion) {
        this.horaResolucion = horaResolucion;
    }

    public String getDuracionIncidencia() {
        return duracionIncidencia;
    }

    public void setDuracionIncidencia(String duracionIncidencia) {
        this.duracionIncidencia = duracionIncidencia;
    }

    public Date getFechaInicioFalla() {
        return fechaInicioFalla;
    }

    public void setFechaInicioFalla(Date fechaInicioFalla) {
        this.fechaInicioFalla = fechaInicioFalla;
    }

    public Date getFechaFinFalla() {
        return fechaFinFalla;
    }

    public void setFechaFinFalla(Date fechaFinFalla) {
        this.fechaFinFalla = fechaFinFalla;
    }

    public String getHoraInicioFalla() {
        return horaInicioFalla;
    }

    public void setHoraInicioFalla(String horaInicioFalla) {
        this.horaInicioFalla = horaInicioFalla;
    }

    public String getDuracionAfectacionCi() {
        return duracionAfectacionCi;
    }

    public void setDuracionAfectacionCi(String duracionAfectacionCi) {
        this.duracionAfectacionCi = duracionAfectacionCi;
    }

    public String getCodigoAreaResponsable() {
        return codigoAreaResponsable;
    }

    public void setCodigoAreaResponsable(String codigoAreaResponsable) {
        this.codigoAreaResponsable = codigoAreaResponsable;
    }

    public String getNombreAreaResponsable() {
        return nombreAreaResponsable;
    }

    public void setNombreAreaResponsable(String nombreAreaResponsable) {
        this.nombreAreaResponsable = nombreAreaResponsable;
    }

    public BigInteger getUsuariosAfectadosInternet() {
        return usuariosAfectadosInternet;
    }

    public void setUsuariosAfectadosInternet(BigInteger usuariosAfectadosInternet) {
        this.usuariosAfectadosInternet = usuariosAfectadosInternet;
    }

    public BigInteger getUsuariosAfectadosTv() {
        return usuariosAfectadosTv;
    }

    public void setUsuariosAfectadosTv(BigInteger usuariosAfectadosTv) {
        this.usuariosAfectadosTv = usuariosAfectadosTv;
    }

    public BigInteger getUsuarisoAfectadosVoz() {
        return usuarisoAfectadosVoz;
    }

    public void setUsuarisoAfectadosVoz(BigInteger usuarisoAfectadosVoz) {
        this.usuarisoAfectadosVoz = usuarisoAfectadosVoz;
    }

    public String getCodigoIngCreador() {
        return codigoIngCreador;
    }

    public void setCodigoIngCreador(String codigoIngCreador) {
        this.codigoIngCreador = codigoIngCreador;
    }

    public String getNombreIngCreador() {
        return nombreIngCreador;
    }

    public void setNombreIngCreador(String nombreIngCreador) {
        this.nombreIngCreador = nombreIngCreador;
    }

    public String getDireccionEquipo() {
        return direccionEquipo;
    }

    public void setDireccionEquipo(String direccionEquipo) {
        this.direccionEquipo = direccionEquipo;
    }

    public String getCodIngResponsable() {
        return codIngResponsable;
    }

    public void setCodIngResponsable(String codIngResponsable) {
        this.codIngResponsable = codIngResponsable;
    }

    public String getMotivoExclusion() {
        return motivoExclusion;
    }

    public void setMotivoExclusion(String motivoExclusion) {
        this.motivoExclusion = motivoExclusion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMaximo != null ? idMaximo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompMaximoV2)) {
            return false;
        }
        CompMaximoV2 other = (CompMaximoV2) object;
        if ((this.idMaximo == null && other.idMaximo != null) || (this.idMaximo != null && !this.idMaximo.equals(other.idMaximo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.claro.compensaciones.entity.CompMaximoV2[ idMaximo=" + idMaximo + " ]";
    }

    public String getHoraFinFalla() {
        return horaFinFalla;
    }

    public void setHoraFinFalla(String horaFinFalla) {
        this.horaFinFalla = horaFinFalla;
    }

    public String getTipoAfectacion() {
        return tipoAfectacion;
    }

    public void setTipoAfectacion(String tipoAfectacion) {
        this.tipoAfectacion = tipoAfectacion;
    }

    public String getNomIngenieroResponsable() {
        return nomIngenieroResponsable;
    }

    public void setNomIngenieroResponsable(String nomIngenieroResponsable) {
        this.nomIngenieroResponsable = nomIngenieroResponsable;
    }

    public String getTicketExterno() {
        return ticketExterno;
    }

    public void setTicketExterno(String ticketExterno) {
        this.ticketExterno = ticketExterno;
    }

    public String getExcluido() {
        return excluido;
    }

    public void setExcluido(String excluido) {
        this.excluido = excluido;
    }

    public String getCodAnomalia() {
        return codAnomalia;
    }

    public void setCodAnomalia(String codAnomalia) {
        this.codAnomalia = codAnomalia;
    }

    public String getDescCodAnomalia() {
        return descCodAnomalia;
    }

    public void setDescCodAnomalia(String descCodAnomalia) {
        this.descCodAnomalia = descCodAnomalia;
    }
}
