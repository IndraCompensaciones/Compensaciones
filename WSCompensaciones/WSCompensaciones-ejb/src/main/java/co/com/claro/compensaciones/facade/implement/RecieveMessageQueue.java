/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.compensaciones.facade.implement;

import co.com.claro.compensaciones.IFacade.IRecieveMessageQueueLocal;
import co.com.claro.compensaciones.classes.QueueParameter;
import java.util.Base64;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueReceiver;
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
public class RecieveMessageQueue implements IRecieveMessageQueueLocal, MessageListener {

    public boolean quit = false;
    private QueueReceiver receiver;
    private Queue queue;
    private QueueSession session;
    private QueueConnection connection = null;

    @Override
    public void readMessages(QueueParameter queueParameters) {
        try {
            Hashtable env = new Hashtable();
            env.put(Context.INITIAL_CONTEXT_FACTORY, "weblogic.jndi.WLInitialContextFactory");
            env.put(Context.PROVIDER_URL, "t3://192.168.0.9:7007");

            InitialContext ic = new InitialContext(env);
            QueueConnectionFactory factory
                    = (QueueConnectionFactory) ic.lookup(queueParameters.getQueueFactory());
            connection = factory.createQueueConnection();

            session = connection.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
            queue = (Queue) ic.lookup(queueParameters.getQueueName());

            receiver = session.createReceiver(queue);

            receiver.setMessageListener(this);
            connection.start();

        } catch (JMSException | NamingException ex) {
            Logger.getLogger(RecieveMessageQueue.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void onMessage(Message message) {
        try {
            String msgText;

            if (message instanceof TextMessage) {
                msgText = ((TextMessage) message).getText();
            } else {
                msgText = message.toString();
            }
            System.out.println("Message Received: " + msgText);
            String[] messageArray = msgText.split("\\|");

            String encodedFile = messageArray[0];
            System.out.println("Message encoded: " + encodedFile);
            byte[] decodedBytes = Base64.getDecoder().decode(encodedFile);
            String decodedString = new String(decodedBytes);
            System.out.println("Message decoded: " + decodedString);

            if (msgText.equalsIgnoreCase("quit")) {
                synchronized (this) {
                    quit = true;
                    this.notifyAll();
                }
            }
        } catch (JMSException e) {
            System.out.println(e);
        }
    }

    public void close() throws JMSException{
        receiver.close();
        session.close();
        connection.close();
    }
    
    

}
