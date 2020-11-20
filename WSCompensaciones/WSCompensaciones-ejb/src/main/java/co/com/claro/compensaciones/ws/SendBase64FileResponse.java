/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.compensaciones.ws;

import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author mamorera
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@XmlRootElement(name = "SendBase64FileResponse")
public class SendBase64FileResponse {

    @Getter
    @Setter
    private String validationResult;

}
