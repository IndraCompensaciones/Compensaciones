package co.com.claro.compensaciones.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author henry.javier.almarza.canizalez@everis.com
 * @version 1.0
 * @since 24/10/2018
 */
@Entity
@Table(name = "COMP_NODOS")
@XmlRootElement
@NamedQuery(name = "CompNodos.findAll", query = "SELECT c FROM CompNodos c")
public class CompNodos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_COMP_NODO")
    private Long idCompNodo;

    @Column(name = "ID_MAXIMO")
    private Long idMaximo;

    @Column(name = "PRIORIDAD")
    private Long prioridad;

    @Column(name = "ESTADO_SISTEMA")
    private Long estadoSistema;

    @Column(name = "SIN_CORPORATIVO")
    private Long sinCorporativo;

    @Column(name = "SIN_AMPLIFICADOR")
    private Long sinAmplificador;

    @Column(name = "TRF_HORAS")
    private Float trfHoras;

    @Column(name = "MAYOR_16")
    private Long mayor16;

    @Column(name = "MAYOR_48")
    private Long mayor48;

    @Column(name = "CAUSA_APLICA_INTERNET")
    private Long causaAplicaInternet;

    @Column(name = "SINTOMA_APLICA_INTERNET")
    private Long sintomaAplicaInternet;

    @Column(name = "CAUSA_APLICA_TV")
    private Long causaAplicaTv;

    @Column(name = "SINTOMA_APLICA_TV")
    private Long sintomaAplicaTv;

    @Column(name = "CAUSA_APLICA_TEL")
    private Long causaAplicaTel;

    @Column(name = "SINTOMA_APLICA_TEL")
    private Long sintomaAplicaTel;

    @Column(name = "APLICAN_INTERNET")
    private Long aplicanInternet;

    @Column(name = "APLICAN_TV")
    private Long aplicanTv;

    @Column(name = "APLICAN_TEL")
    private Long aplicanTel;

    @Temporal(TemporalType.DATE)
    @Column(name = "FEC_VALIDACION")
    private Date fecValidacion;

    @Size(max = 32)
    @Column(name = "USUARIO_MODIFICA")
    private String usuarioModifica;

    @Column(name = "ESTADO_PROCESO")
    private Long estadoProceso;

    @Column(name = "ESTADO_TV")
    private Long estadoTv;

    @Column(name = "ESTADO_INT")
    private Long estadoInt;

    @Column(name = "ESTADO_TELF")
    private Long estadoTelf;

    @Column(name = "EST_VALIDA_INT")
    private Long estadoValidaInt;

    @Column(name = "EST_VALIDA_TEL")
    private Long estadoValidaTel;

    @Column(name = "EST_VALIDA_TV")
    private Long estadoValidaTv;

    @Column(name = "OBSRVACION_INT")
    private Long observacionInt;

    @Column(name = "OBSRVACION_TEL")
    private Long observacionTel;

    @Column(name = "OBSRVACION_Tv")
    private Long observacionTv;

    @Column(name = "ID_DISCONTINUA")
    private Long idDiscontinua;

    @Size(max = 20)
    @Column(name = "NODO_COM")
    private String nodoCom;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_INI_COM")
    private Date fechaIniCom;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_FIN_COM")
    private Date fechaFinCom;

    @Temporal(TemporalType.DATE)
    @Column(name = "HORA_INI_COM")
    private Date horaIniCom;

    @Temporal(TemporalType.DATE)
    @Column(name = "HORA_FIN_COM")
    private Date horaFinCom;
    
    @Basic(optional = false)
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public CompNodos() {
    }

    public CompNodos(Long idCompNodo) {
        this.idCompNodo = idCompNodo;
    }

    public CompNodos(Long idCompNodo, Long idMaximo, Long prioridad, 
            Long estadoSistema, Long sinCorporativo, Long sinAmplificador, 
            Float trfHoras, Long mayor16, Long mayor48, 
            Long causaAplicaInternet, Long sintomaAplicaInternet,
            Long causaAplicaTv, Long sintomaAplicaTv, Long causaAplicaTel,
            Long sintomaAplicaTel, Long aplicanInternet, Long aplicanTv, 
            Long aplicanTel, Date fecValidacion, String usuarioModifica, 
            Long estadoProceso, Long estadoTv, Long estadoInt, Long estadoTelf,
            Long estadoValidaInt, Long estadoValidaTel, Long estadoValidaTv,
            Long observacionInt, Long observacionTel, Long observacionTv, 
            Long idDiscontinua, String nodoCom, Date fechaIniCom, 
            Date fechaFinCom, Date horaIniCom, Date horaFinCom, 
            Date fechaCreacion) {
        this.idCompNodo = idCompNodo;
        this.idMaximo = idMaximo;
        this.prioridad = prioridad;
        this.estadoSistema = estadoSistema;
        this.sinCorporativo = sinCorporativo;
        this.sinAmplificador = sinAmplificador;
        this.trfHoras = trfHoras;
        this.mayor16 = mayor16;
        this.mayor48 = mayor48;
        this.causaAplicaInternet = causaAplicaInternet;
        this.sintomaAplicaInternet = sintomaAplicaInternet;
        this.causaAplicaTv = causaAplicaTv;
        this.sintomaAplicaTv = sintomaAplicaTv;
        this.causaAplicaTel = causaAplicaTel;
        this.sintomaAplicaTel = sintomaAplicaTel;
        this.aplicanInternet = aplicanInternet;
        this.aplicanTv = aplicanTv;
        this.aplicanTel = aplicanTel;
        this.fecValidacion = fecValidacion;
        this.usuarioModifica = usuarioModifica;
        this.estadoProceso = estadoProceso;
        this.estadoTv = estadoTv;
        this.estadoInt = estadoInt;
        this.estadoTelf = estadoTelf;
        this.estadoValidaInt = estadoValidaInt;
        this.estadoValidaTel = estadoValidaTel;
        this.estadoValidaTv = estadoValidaTv;
        this.observacionInt = observacionInt;
        this.observacionTel = observacionTel;
        this.observacionTv = observacionTv;
        this.idDiscontinua = idDiscontinua;
        this.nodoCom = nodoCom;
        this.fechaIniCom = fechaIniCom;
        this.fechaFinCom = fechaFinCom;
        this.horaIniCom = horaIniCom;
        this.horaFinCom = horaFinCom;
        this.fechaCreacion = fechaCreacion;
    }
    
    

    public Long getIdCompNodo() {
        return idCompNodo;
    }

    public void setIdCompNodo(Long idCompNodo) {
        this.idCompNodo = idCompNodo;
    }

    public Long getIdMaximo() {
        return idMaximo;
    }

    public void setIdMaximo(Long idMaximo) {
        this.idMaximo = idMaximo;
    }

    public Long getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Long prioridad) {
        this.prioridad = prioridad;
    }

    public Long getEstadoSistema() {
        return estadoSistema;
    }

    public void setEstadoSistema(Long estadoSistema) {
        this.estadoSistema = estadoSistema;
    }

    public Long getSinCorporativo() {
        return sinCorporativo;
    }

    public void setSinCorporativo(Long sinCorporativo) {
        this.sinCorporativo = sinCorporativo;
    }

    public Long getSinAmplificador() {
        return sinAmplificador;
    }

    public void setSinAmplificador(Long sinAmplificador) {
        this.sinAmplificador = sinAmplificador;
    }

    public Float getTrfHoras() {
        return trfHoras;
    }

    public void setTrfHoras(Float trfHoras) {
        this.trfHoras = trfHoras;
    }

    public Long getMayor16() {
        return mayor16;
    }

    public void setMayor16(Long mayor16) {
        this.mayor16 = mayor16;
    }

    public Long getMayor48() {
        return mayor48;
    }

    public void setMayor48(Long mayor48) {
        this.mayor48 = mayor48;
    }

    public Long getCausaAplicaInternet() {
        return causaAplicaInternet;
    }

    public void setCausaAplicaInternet(Long causaAplicaInternet) {
        this.causaAplicaInternet = causaAplicaInternet;
    }

    public Long getSintomaAplicaInternet() {
        return sintomaAplicaInternet;
    }

    public void setSintomaAplicaInternet(Long sintomaAplicaInternet) {
        this.sintomaAplicaInternet = sintomaAplicaInternet;
    }

    public Long getCausaAplicaTv() {
        return causaAplicaTv;
    }

    public void setCausaAplicaTv(Long causaAplicaTv) {
        this.causaAplicaTv = causaAplicaTv;
    }

    public Long getSintomaAplicaTv() {
        return sintomaAplicaTv;
    }

    public void setSintomaAplicaTv(Long sintomaAplicaTv) {
        this.sintomaAplicaTv = sintomaAplicaTv;
    }

    public Long getCausaAplicaTel() {
        return causaAplicaTel;
    }

    public void setCausaAplicaTel(Long causaAplicaTel) {
        this.causaAplicaTel = causaAplicaTel;
    }

    public Long getSintomaAplicaTel() {
        return sintomaAplicaTel;
    }

    public void setSintomaAplicaTel(Long sintomaAplicaTel) {
        this.sintomaAplicaTel = sintomaAplicaTel;
    }

    public Long getAplicanInternet() {
        return aplicanInternet;
    }

    public void setAplicanInternet(Long aplicanInternet) {
        this.aplicanInternet = aplicanInternet;
    }

    public Long getAplicanTv() {
        return aplicanTv;
    }

    public void setAplicanTv(Long aplicanTv) {
        this.aplicanTv = aplicanTv;
    }

    public Long getAplicanTel() {
        return aplicanTel;
    }

    public void setAplicanTel(Long aplicanTel) {
        this.aplicanTel = aplicanTel;
    }

    public Date getFecValidacion() {
        return fecValidacion;
    }

    public void setFecValidacion(Date fecValidacion) {
        this.fecValidacion = fecValidacion;
    }

    public String getUsuarioModifica() {
        return usuarioModifica;
    }

    public void setUsuarioModifica(String usuarioModifica) {
        this.usuarioModifica = usuarioModifica;
    }

    public Long getEstadoProceso() {
        return estadoProceso;
    }

    public void setEstadoProceso(Long estadoProceso) {
        this.estadoProceso = estadoProceso;
    }

    public Long getEstadoTv() {
        return estadoTv;
    }

    public void setEstadoTv(Long estadoTv) {
        this.estadoTv = estadoTv;
    }

    public Long getEstadoInt() {
        return estadoInt;
    }

    public void setEstadoInt(Long estadoInt) {
        this.estadoInt = estadoInt;
    }

    public Long getEstadoTelf() {
        return estadoTelf;
    }

    public void setEstadoTelf(Long estadoTelf) {
        this.estadoTelf = estadoTelf;
    }

    public Long getEstadoValidaInt() {
        return estadoValidaInt;
    }

    public void setEstadoValidaInt(Long estadoValidaInt) {
        this.estadoValidaInt = estadoValidaInt;
    }

    public Long getEstadoValidaTel() {
        return estadoValidaTel;
    }

    public void setEstadoValidaTel(Long estadoValidaTel) {
        this.estadoValidaTel = estadoValidaTel;
    }

    public Long getEstadoValidaTv() {
        return estadoValidaTv;
    }

    public void setEstadoValidaTv(Long estadoValidaTv) {
        this.estadoValidaTv = estadoValidaTv;
    }

    public Long getObservacionInt() {
        return observacionInt;
    }

    public void setObservacionInt(Long observacionInt) {
        this.observacionInt = observacionInt;
    }

    public Long getObservacionTel() {
        return observacionTel;
    }

    public void setObservacionTel(Long observacionTel) {
        this.observacionTel = observacionTel;
    }

    public Long getObservacionTv() {
        return observacionTv;
    }

    public void setObservacionTv(Long observacionTv) {
        this.observacionTv = observacionTv;
    }

    public Long getIdDiscontinua() {
        return idDiscontinua;
    }

    public void setIdDiscontinua(Long idDiscontinua) {
        this.idDiscontinua = idDiscontinua;
    }

    public String getNodoCom() {
        return nodoCom;
    }

    public void setNodoCom(String nodoCom) {
        this.nodoCom = nodoCom;
    }

    public Date getFechaIniCom() {
        return fechaIniCom;
    }

    public void setFechaIniCom(Date fechaIniCom) {
        this.fechaIniCom = fechaIniCom;
    }

    public Date getFechaFinCom() {
        return fechaFinCom;
    }

    public void setFechaFinCom(Date fechaFinCom) {
        this.fechaFinCom = fechaFinCom;
    }

    public Date getHoraIniCom() {
        return horaIniCom;
    }

    public void setHoraIniCom(Date horaIniCom) {
        this.horaIniCom = horaIniCom;
    }

    public Date getHoraFinCom() {
        return horaFinCom;
    }

    public void setHoraFinCom(Date horaFinCom) {
        this.horaFinCom = horaFinCom;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }



}
