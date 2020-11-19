package co.co.claro.compensaciones.persistencia.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
*
* @author ariasmc
*/
@Entity
@Table(name = "VW_NODOS_FINALES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VwNodosFinales.findAll", query = "SELECT v FROM VwNodosFinales v")
    , @NamedQuery(name = "VwNodosFinales.findByNombreCi", 
            query = "SELECT v FROM VwNodosFinales v WHERE v.nombreCi = :nombreCi")})

public class VwNodosFinales implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "ID_NODO")
    private Long idNodo;
    @Size(max = 500)
    @Column(name = "NOMBRE_CI")
    private String nombreCi;

    public VwNodosFinales() {
    }

    public Long getIdNodo() {
        return idNodo;
    }

    public void setIdNodoFinal(Long idNodoFinal) {
        this.idNodo = idNodoFinal;
    }

    public String getNombreCi() {
        return nombreCi;
    }

    public void setNombreCi(String nombreCi) {
        this.nombreCi = nombreCi;
    }
    
}