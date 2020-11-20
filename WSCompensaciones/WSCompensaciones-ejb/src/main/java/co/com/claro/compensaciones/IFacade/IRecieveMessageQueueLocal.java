/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.compensaciones.IFacade;

import co.com.claro.compensaciones.classes.QueueParameter;

/**
 *
 * @author mamorera
 */
public interface IRecieveMessageQueueLocal {
    
    public void readMessages(QueueParameter queueParameters);
    
}
