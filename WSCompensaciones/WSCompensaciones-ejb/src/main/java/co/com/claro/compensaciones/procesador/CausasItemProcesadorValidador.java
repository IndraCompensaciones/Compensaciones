/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.compensaciones.procesador;

import co.com.claro.compensaciones.dto.CompCausasCargueDto;
import co.com.claro.compensaciones.entity.CompCausas;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.annotation.OnProcessError;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.validator.Validator;

/**
 *
 * @author Administrador
 */
public class CausasItemProcesadorValidador implements ItemProcessor<CompCausasCargueDto, CompCausas> {

    private static final Logger LOG = LoggerFactory.getLogger(CausasItemProcesadorValidador.class);
    @Inject
    private Validator<CompCausas> validator;

    @Override
    public CompCausas process(CompCausasCargueDto i) throws Exception {
        CompCausas causa = i.modificarObjeto(i);
        validator.validate(causa);
        return causa;
    }

    @OnProcessError
    void onProcessError(CompCausas item, Exception e) {
        LOG.error("Exception occurred in input validation at the {} th item. [message:{}]", item.getIdCausa(), e.getMessage());
    }
}
