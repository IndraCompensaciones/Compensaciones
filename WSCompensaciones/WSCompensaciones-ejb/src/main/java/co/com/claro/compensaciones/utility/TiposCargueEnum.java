/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.compensaciones.utility;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author mamorera
 */
@AllArgsConstructor
@ToString
@XmlRootElement(name = "TiposCargueEnum")
public enum TiposCargueEnum {
    CAUSAS("CAUSAS", "1"),
    SINTOMAS("SINTOMAS", "2");
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String id;

}
