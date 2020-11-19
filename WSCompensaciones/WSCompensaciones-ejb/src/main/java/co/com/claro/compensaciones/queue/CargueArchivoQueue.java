/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.compensaciones.queue;

import co.com.claro.compensaciones.utility.NumberConstants;
import co.com.claro.compensaciones.utility.TiposCargue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * clase encargada de consumir la cola de cargue de archivos para sintomas y
 * causas
 *
 * @author afvillanueva
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "CargueArchivoQueue")
    ,
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class CargueArchivoQueue implements MessageListener {

    @Override
    public void onMessage(Message message) {
        try {
            TextMessage textMessage = (TextMessage) message;
            if (textMessage != null && textMessage.getText() != null && !textMessage.getText().equals("")) {
                String[] list = textMessage.getText().split(",");
                String archivo = list[NumberConstants.NUMERO_CERO];
                TiposCargue tipo = TiposCargue.valueOf(list[NumberConstants.NUMERO_UNO]);
                switch (tipo) {
                    case CAUSAS:
                        break;
                    case SINTOMAS:
                        break;
                    default:
                        break;
                }
            }
        } catch (JMSException ex) {
            Logger.getLogger(CargueArchivoQueue.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

  

}
