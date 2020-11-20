/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.compensaciones.IFacade;

import co.com.claro.compensaciones.exception.FileException;
import co.com.claro.compensaciones.ws.SendBase64FileRequest;
import co.com.claro.compensaciones.ws.SendBase64FileResponse;
import javax.ejb.Local;

/**
 *
 * @author mamorera
 */
@Local
public interface ISendBase64FileLocal {
    public SendBase64FileResponse SendBase64File(SendBase64FileRequest request) throws FileException;
}
