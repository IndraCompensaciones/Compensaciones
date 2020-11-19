package co.co.claro.compensaciones.persistencia.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author henry.javier.almarza.canizalez@everis.com
 * @version 1.0
 */
@Entity
@Table(name = "COMP_MAXIMO")
@XmlRootElement
@NamedQuery(name = "CompMaximo.findAll", query = "SELECT c FROM CompMaximo c")
public class CompMaximo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_MAXIMO")
    private Long idMaximo;

    @Column(name = "CI_DESCRIPTION")
    private String ciDescription;

    private String classstructureid;

    private String emplazamiento;

    @Column(name = "ESTADO_NODOS")
    private Long estadoNodos;

    @Column(name = "ESTADO_ZPM")
    private Long estadoZpm;

    @Column(name = "FAILURECODE_DESCRIPTION")
    private String failurecodeDescription;

    @Column(name = "FAILUREREPORT_FAILURECODE")
    private String failurereportFailurecode;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_CORTE")
    private Date fechaCorte;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_FIN_AVERIA")
    private Date fechaFinAveria;

    @Temporal(TemporalType.DATE)
    @Column(name = "FECHA_INI_AVERIA")
    private Date fechaIniAveria;

    @Column(name = "HORA_FIN_AVERIA")
    private String horaFinAveria;

    @Column(name = "HORA_INI_AVERIA")
    private String horaIniAveria;

    @Temporal(TemporalType.DATE)
    @Column(name = "INCIDENT_ACTUALFINISH")
    private Date incidentActualfinish;

    @Column(name = "INCIDENT_DESCRIPTION")
    private String incidentDescription;

    @Column(name = "INCIDENT_INTERNALPRIORITY")
    private String incidentInternalpriority;

    @Temporal(TemporalType.DATE)
    @Column(name = "INCIDENT_REPORTDATE")
    private Date incidentReportdate;

    @Column(name = "INCIDENT_STATUS")
    private String incidentStatus;

    @Column(name = "INCIDENT_TICKETID")
    private String incidentTicketid;

    @Column(name = "LOCATIONS_LOCATIONIDFIJA")
    private String locationsLocationidfija;

    @Column(name = "MULTIASSETLOCCI_CINUM_CINAME")
    private String multiassetlocciCinumCiname;

    private String sintoma;

    @Column(name = "SOL_AVISO_1")
    private String solAviso1;

    private Double tmr;
    
    @Basic(optional = false)
    @Column(name = "FECHA_CREACION")
    @Temporal(TemporalType.DATE)
    private Date fechaCreacion;

    public CompMaximo() {
    }

    /**
     * 
     * @return Long
     */
    public Long getIdMaximo() {
        return this.idMaximo;
    }

    /**
     * 
     * @param idMaximo 
     */
    public void setIdMaximo(Long idMaximo) {
        this.idMaximo = idMaximo;
    }

    /**
     * 
     * @return String
     */
    public String getCiDescription() {
        return this.ciDescription;
    }

    /**
     * 
     * @param ciDescription 
     */
    public void setCiDescription(String ciDescription) {
        this.ciDescription = ciDescription;
    }

    /**
     * 
     * @return String
     */
    public String getClassstructureid() {
        return this.classstructureid;
    }

    /**
     * 
     * @param classstructureid 
     */
    public void setClassstructureid(String classstructureid) {
        this.classstructureid = classstructureid;
    }

    /**
     * 
     * @return String
     */
    public String getEmplazamiento() {
        return this.emplazamiento;
    }

    /**
     * 
     * @param emplazamiento 
     */
    public void setEmplazamiento(String emplazamiento) {
        this.emplazamiento = emplazamiento;
    }

    /**
     * 
     * @return Long
     */
    public Long getEstadoNodos() {
        return this.estadoNodos;
    }

    /**
     * 
     * @param estadoNodos 
     */
    public void setEstadoNodos(Long estadoNodos) {
        this.estadoNodos = estadoNodos;
    }

    /**
     * 
     * @return Long
     */
    public Long getEstadoZpm() {
        return this.estadoZpm;
    }

    /**
     * 
     * @param estadoZpm 
     */
    public void setEstadoZpm(Long estadoZpm) {
        this.estadoZpm = estadoZpm;
    }

    /**
     * 
     * @return String
     */
    public String getFailurecodeDescription() {
        return this.failurecodeDescription;
    }

    /**
     * 
     * @param failurecodeDescription 
     */
    public void setFailurecodeDescription(String failurecodeDescription) {
        this.failurecodeDescription = failurecodeDescription;
    }

    /**
     * 
     * @return String
     */
    public String getFailurereportFailurecode() {
        return this.failurereportFailurecode;
    }

    /**
     * 
     * @param failurereportFailurecode 
     */
    public void setFailurereportFailurecode(String failurereportFailurecode) {
        this.failurereportFailurecode = failurereportFailurecode;
    }

    /**
     * 
     * @return Date
     */
    public Date getFechaCorte() {
        return this.fechaCorte;
    }

    /**
     * 
     * @param fechaCorte 
     */
    public void setFechaCorte(Date fechaCorte) {
        this.fechaCorte = fechaCorte;
    }

    /**
     * 
     * @return Date
     */
    public Date getFechaFinAveria() {
        return this.fechaFinAveria;
    }

    /**
     * 
     * @param fechaFinAveria 
     */
    public void setFechaFinAveria(Date fechaFinAveria) {
        this.fechaFinAveria = fechaFinAveria;
    }

    /**
     * 
     * @return Date
     */
    public Date getFechaIniAveria() {
        return this.fechaIniAveria;
    }

    /**
     * 
     * @param fechaIniAveria 
     */
    public void setFechaIniAveria(Date fechaIniAveria) {
        this.fechaIniAveria = fechaIniAveria;
    }

    /**
     * 
     * @return String
     */
    public String getHoraFinAveria() {
        return this.horaFinAveria;
    }

    /**
     * 
     * @param horaFinAveria 
     */
    public void setHoraFinAveria(String horaFinAveria) {
        this.horaFinAveria = horaFinAveria;
    }

    /**
     * 
     * @return String
     */
    public String getHoraIniAveria() {
        return this.horaIniAveria;
    }

    /**
     * 
     * @param horaIniAveria 
     */
    public void setHoraIniAveria(String horaIniAveria) {
        this.horaIniAveria = horaIniAveria;
    }

    /**
     * 
     * @return Date
     */
    public Date getIncidentActualfinish() {
        return this.incidentActualfinish;
    }

    /**
     * 
     * @param incidentActualfinish 
     */
    public void setIncidentActualfinish(Date incidentActualfinish) {
        this.incidentActualfinish = incidentActualfinish;
    }

    /**
     * 
     * @return String
     */
    public String getIncidentDescription() {
        return this.incidentDescription;
    }

    /**
     * 
     * @param incidentDescription 
     */
    public void setIncidentDescription(String incidentDescription) {
        this.incidentDescription = incidentDescription;
    }

    /**
     * 
     * @return String
     */
    public String getIncidentInternalpriority() {
        return this.incidentInternalpriority;
    }

    /**
     * 
     * @param incidentInternalpriority 
     */
    public void setIncidentInternalpriority(String incidentInternalpriority) {
        this.incidentInternalpriority = incidentInternalpriority;
    }

    /**
     * 
     * @return Date
     */
    public Date getIncidentReportdate() {
        return this.incidentReportdate;
    }

    /**
     * 
     * @param incidentReportdate 
     */
    public void setIncidentReportdate(Date incidentReportdate) {
        this.incidentReportdate = incidentReportdate;
    }

    /**
     * 
     * @return String
     */
    public String getIncidentStatus() {
        return this.incidentStatus;
    }

    /**
     * 
     * @param incidentStatus 
     */
    public void setIncidentStatus(String incidentStatus) {
        this.incidentStatus = incidentStatus;
    }

    /**
     * 
     * @return String
     */
    public String getIncidentTicketid() {
        return this.incidentTicketid;
    }

    /**
     * 
     * @param incidentTicketid 
     */
    public void setIncidentTicketid(String incidentTicketid) {
        this.incidentTicketid = incidentTicketid;
    }

    /**
     * 
     * @return String
     */
    public String getLocationsLocationidfija() {
        return this.locationsLocationidfija;
    }

    /**
     * 
     * @param locationsLocationidfija 
     */
    public void setLocationsLocationidfija(String locationsLocationidfija) {
        this.locationsLocationidfija = locationsLocationidfija;
    }

    /**
     * 
     * @return String
     */
    public String getMultiassetlocciCinumCiname() {
        return this.multiassetlocciCinumCiname;
    }

    /**
     * 
     * @param multiassetlocciCinumCiname 
     */
    public void setMultiassetlocciCinumCiname(String multiassetlocciCinumCiname) {
        this.multiassetlocciCinumCiname = multiassetlocciCinumCiname;
    }

    /**
     * 
     * @return String
     */
    public String getSintoma() {
        return this.sintoma;
    }

    /**
     * 
     * @param sintoma 
     */
    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    /**
     * 
     * @return String
     */
    public String getSolAviso1() {
        return this.solAviso1;
    }

    /**
     * 
     * @param solAviso1 
     */
    public void setSolAviso1(String solAviso1) {
        this.solAviso1 = solAviso1;
    }

    /**
     * 
     * @return Double
     */
    public Double getTmr() {
        return this.tmr;
    }

    /**
     * 
     * @param tmr 
     */
    public void setTmr(Double tmr) {
        this.tmr = tmr;
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
