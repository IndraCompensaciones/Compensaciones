/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.compensaciones.facade.implement;

import co.com.claro.compensaciones.IFacade.ISendMessageQueueLocal;
import co.com.claro.compensaciones.exception.SendFileException;
import co.com.claro.compensaciones.classes.QueueParameter;
import co.com.claro.compensaciones.ws.SendBase64FileRequest;
import java.util.Hashtable;
import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author mamorera
 */
public class SendMessageQueue implements ISendMessageQueueLocal {

    @Override
    public void sendMessage(SendBase64FileRequest message, QueueParameter queueParameters)
            throws SendFileException {
        try {

            Hashtable<String, String> env = new Hashtable();
            env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
            //URL localhost para prueba local
            env.put(Context.PROVIDER_URL, "t3://192.168.0.9:7007");

            InitialContext initialContext = new InitialContext(env);
            QueueConnectionFactory factory
                    = (QueueConnectionFactory) initialContext.lookup(queueParameters.getQueueFactory());

            try (QueueConnection connection = factory.createQueueConnection()) {
                connection.start();
                QueueSender queueSender;
                try (QueueSession session = connection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE)) {
                    Queue queue = (Queue) initialContext.lookup(queueParameters.getQueueName());
                    queueSender = session.createSender(queue);
                    /*Formar el mensaje*/
                    TextMessage newMessage = session.createTextMessage();
                    newMessage.setText(message.getFile().concat("|").concat(message.getFileName()));
                    /*Envio del mensaje*/
                    queueSender.send(newMessage);

                }
                // Cerramos la conexion, cola
                queueSender.close();
                connection.close();
            }

        } catch (JMSException | NamingException e) {
            throw new SendFileException("No fue posible enviar el mensaje");
        }
    }

}
