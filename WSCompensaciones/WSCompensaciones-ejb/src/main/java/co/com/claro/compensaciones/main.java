/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.compensaciones;

import co.com.claro.compensaciones.classes.QueueParameter;
import co.com.claro.compensaciones.exception.FileException;
import co.com.claro.compensaciones.facade.implement.RecieveMessageQueue;
import co.com.claro.compensaciones.facade.implement.SendBase64FileFacade;
import co.com.claro.compensaciones.ws.SendBase64FileRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jms.JMSException;

/**
 *
 * @author mamorera
 */
public class main {

    public static void main(String[] args) throws IOException, FileException {

        //escribe en la cola 
        SendBase64FileFacade senf = new SendBase64FileFacade();
        SendBase64FileRequest rq = new SendBase64FileRequest();

        File file;
        file = new File("D://Documents/123456.txt");
        byte[] bytes = loadFile(file);
        String encodedString = Base64.getEncoder().encodeToString(
                bytes);
        rq.setFile(encodedString);
        rq.setFileName("124544444444444444444444444444.txt");
        rq.setUploadType("CAUSAS");

        String mensaje = encodedString.concat("|" + "12209090934.txt");

        String[] ssd = mensaje.split("\\|");
        System.out.println(ssd[0]);
        System.out.println(senf.SendBase64File(rq).getValidationResult());

        //lee la cola
        QueueParameter queueParameters = new QueueParameter();
        queueParameters.setQueueFactory("CausesFilesFactory");
        queueParameters.setQueueName("CausesFilesQueue");
        RecieveMessageQueue er = new RecieveMessageQueue();
        er.readMessages(queueParameters);
        synchronized (er) {
            try {
                while (!er.quit) {
                    try {
                        er.wait();
                    } catch (InterruptedException ex) {

                    }
                }
                er.close();
            } catch (JMSException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private static byte[] loadFile(File file) throws IOException {
        InputStream is = new FileInputStream(file);

        long length = file.length();
        if (length > Integer.MAX_VALUE) {
            // File is too large
        }
        byte[] bytes = new byte[(int) length];

        int offset = 0;
        int numRead = 0;
        while (offset < bytes.length
                && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
            offset += numRead;
        }

        if (offset < bytes.length) {
            throw new IOException("Could not completely read file " + file.getName());
        }

        is.close();
        return bytes;
    }
}
