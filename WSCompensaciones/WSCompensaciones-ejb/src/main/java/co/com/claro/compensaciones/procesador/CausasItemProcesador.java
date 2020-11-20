/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.compensaciones.procesador;

import co.com.claro.compensaciones.entity.CompCausas;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;
import co.com.claro.compensaciones.dto.CompCausasCargueDto;
/**
 *
 * @author Administrador
 */
public class CausasItemProcesador implements ItemProcessor<CompCausasCargueDto, CompCausas> {

    private static final Logger LOG = LoggerFactory.getLogger(CausasItemProcesador.class);

    @Override
    public CompCausas process(CompCausasCargueDto i) throws Exception {
        CompCausas causa = i.modificarObjeto(i);
        LOG.info("convertido (" + i + ") a (" + causa + ")");
        return causa;
    }
}
