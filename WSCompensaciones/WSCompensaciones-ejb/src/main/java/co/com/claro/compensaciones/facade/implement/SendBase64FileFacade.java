/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.compensaciones.facade.implement;

import co.com.claro.compensaciones.IFacade.ISendBase64FileLocal;
import co.com.claro.compensaciones.exception.FileException;
import co.com.claro.compensaciones.exception.SendFileException;
import co.com.claro.compensaciones.utility.TiposCargueEnum;
import co.com.claro.compensaciones.classes.QueueParameter;
import co.com.claro.compensaciones.ws.SendBase64FileRequest;
import co.com.claro.compensaciones.ws.SendBase64FileResponse;
import java.util.Base64;

/**
 *
 * @author mamorera
 */
public class SendBase64FileFacade implements ISendBase64FileLocal {

    @Override
    public SendBase64FileResponse SendBase64File(SendBase64FileRequest request) throws FileException {
        SendBase64FileResponse response = new SendBase64FileResponse();

        if (request != null && (request.getUploadType().toUpperCase().
                equals(TiposCargueEnum.valueOf("CAUSAS").getName())
                || request.getUploadType().toUpperCase().equals(TiposCargueEnum.valueOf("SINTOMAS").getName()))
                && (request.getFileName().toUpperCase().endsWith(".CSV")
                || request.getFileName().toUpperCase().endsWith(".TXT"))) {

            byte[] decodedBytes = Base64.getDecoder().decode(request.getFile());
            String decodedString = new String(decodedBytes);
            if (!decodedString.trim().isEmpty()) {
                SendMessageQueue sendMessageFacade = new SendMessageQueue();
                try {
                    if (request.getUploadType().toUpperCase().equals(TiposCargueEnum.valueOf("SINTOMAS").getName())) {
                        sendMessageFacade.sendMessage(request, SendSymptomsQueueMessage());
                    } else {
                        sendMessageFacade.sendMessage(request, SendCausesQueueMessage());
                    }
                    response.setValidationResult("Archivo cargado");
                } catch (SendFileException ex) {
                    throw new FileException("Error en el cargue del archivo");
                }
            } else {
                response.setValidationResult("Archivo no cargado :archivo vacio");
            }
        } else {
            response.setValidationResult("Archivo no cargado :: formato erroneo del archivo");
        }
        return response;
    }

    public QueueParameter SendCausesQueueMessage() {
        QueueParameter queueParameters = new QueueParameter();
        queueParameters.setQueueFactory("CausesFilesFactory");
        queueParameters.setQueueName("CausesFilesQueue");
        return queueParameters;

    }

    public QueueParameter SendSymptomsQueueMessage() {
        QueueParameter queueParameters = new QueueParameter();
        queueParameters.setQueueFactory("SymptomsFilesFactory");
        queueParameters.setQueueName("SymptomsFilesQueue");
        return queueParameters;

    }

}
