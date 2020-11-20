package co.com.claro.compensaciones.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityResult;
import javax.persistence.FieldResult;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author henry.javier.almarza.canizalez@everis.com
 * @version 1.0
 * @since 25/10/2018
 */
@Entity
@XmlRootElement
@SqlResultSetMapping(
        name = "reporteValidacionNodos",
        entities = @EntityResult(
                entityClass = ValidacionNodos.class,
                fields = {
                    @FieldResult(name = "idMaximo", column = "ID_MAXIMO")
                    , @FieldResult(name = "idMaximoNodos", column = 
                            "ID_MAXIMO_NODOS")
                    , @FieldResult(name = "idCompNodos", column = 
                            "ID_COMP_NODO")
                    , @FieldResult(name = "emplazamiento", column = 
                            "EMPLAZAMIENTO")
                    , @FieldResult(name = "nodoAdicional", column = 
                            "NODO_ADICIONAL")
                    , @FieldResult(name = "aviso", column = "AVISO")
                    , @FieldResult(name = "tfrHoras", column = "TRF_HORAS")
                }))
public class ValidacionNodos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_MAXIMO")
    private BigDecimal idMaximo;

    @Column(name = "ID_MAXIMO_NODOS")
    private BigDecimal idMaximoNodos;

    @Column(name = "ID_COMP_NODO")
    private BigDecimal idCompNodo;

    @Column(name = "EMPLAZAMIENTO")
    private String emplazamiento;

    @Column(name = "NODO_ADICIONAL")
    private String nodoAdicional;

    @Column(name = "AVISO")
    private String aviso;

    @Column(name = "TRF_HORAS")
    private BigDecimal trfHoras;

    public ValidacionNodos() {
    }
    
   

    public ValidacionNodos(BigDecimal idMaximo, BigDecimal idMaximoNodos,
            BigDecimal idCompNodo,
            String emplazamiento, String nodoAdicional, String aviso, 
            BigDecimal trfHoras) {
        this.idMaximo = idMaximo;
        this.idMaximoNodos = idMaximoNodos;
        this.idCompNodo = idCompNodo;
        this.emplazamiento = emplazamiento;
        this.nodoAdicional = nodoAdicional;
        this.aviso = aviso;
        this.trfHoras = trfHoras;
    }

    /**
     * 
     * @return String
     */
    public String getEmplazamiento() {
        return emplazamiento;
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
     * @return String
     */
    public String getNodoAdicional() {
        return nodoAdicional;
    }

    /**
     * 
     * @param nodoAdicional 
     */
    public void setNodoAdicional(String nodoAdicional) {
        this.nodoAdicional = nodoAdicional;
    }

    public BigDecimal getIdMaximo() {
        return idMaximo;
    }

    public void setIdMaximo(BigDecimal idMaximo) {
        this.idMaximo = idMaximo;
    }

    public BigDecimal getIdMaximoNodos() {
        return idMaximoNodos;
    }

    public void setIdMaximoNodos(BigDecimal idMaximoNodos) {
        this.idMaximoNodos = idMaximoNodos;
    }

    public BigDecimal getIdCompNodo() {
        return idCompNodo;
    }

    public void setIdCompNodo(BigDecimal idCompNodo) {
        this.idCompNodo = idCompNodo;
    }

    public String getAviso() {
        return aviso;
    }

    public void setAviso(String aviso) {
        this.aviso = aviso;
    }

    public BigDecimal getTrfHoras() {
        return trfHoras;
    }

    public void setTrfHoras(BigDecimal trfHoras) {
        this.trfHoras = trfHoras;
    }
}
