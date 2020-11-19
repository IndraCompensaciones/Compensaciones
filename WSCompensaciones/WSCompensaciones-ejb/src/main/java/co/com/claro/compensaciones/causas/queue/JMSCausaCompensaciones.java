/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.compensaciones.causas.queue;

import co.com.claro.compensaciones.causas.batch.DemoSpringBatchApplication;
import co.com.claro.compensaciones.queue.CargueArchivoQueue;
import co.com.claro.compensaciones.utility.NumberConstants;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import org.springframework.batch.core.BatchStatus;


/**
 * clase encargada de consumir la cola de causas en las compensaciones
 *
 * @author afvillanueva
 */
@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "CausesFileQueue")
    ,
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class JMSCausaCompensaciones implements MessageListener {

    @Override
    public void onMessage(Message message) {
        try {
            TextMessage textMessage = (TextMessage) message;
            if (textMessage != null && textMessage.getText() != null && !textMessage.getText().equals("")) {
                String[] list = textMessage.getText().split(",");
                String archivo = list[NumberConstants.NUMERO_CERO];
                String nombreArchivo = list[NumberConstants.NUMERO_UNO];
                DemoSpringBatchApplication demo = new DemoSpringBatchApplication();
                BatchStatus batchStatus= demo.run(list, archivo);
            }
        } catch (JMSException ex) {
            Logger.getLogger(CargueArchivoQueue.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(JMSCausaCompensaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
}
