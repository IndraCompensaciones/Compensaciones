/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.compensaciones.utility;

import java.io.File;
import java.util.Base64;

/**
 *
 * @author Administrador
 */
public class DecodificarArchivo {
    
    public byte[] decodificarArchivo(String file){
      return  Base64.getDecoder().decode(file);
    }
            
    
}
