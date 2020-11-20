/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.compensaciones.IFacade;

import co.com.claro.compensaciones.exception.SendFileException;
import co.com.claro.compensaciones.classes.QueueParameter;
import co.com.claro.compensaciones.ws.SendBase64FileRequest;

/**
 *
 * @author mamorera
 */
public interface ISendMessageQueueLocal {

    public void sendMessage(SendBase64FileRequest message, QueueParameter queueParameters)
            throws SendFileException;
}
