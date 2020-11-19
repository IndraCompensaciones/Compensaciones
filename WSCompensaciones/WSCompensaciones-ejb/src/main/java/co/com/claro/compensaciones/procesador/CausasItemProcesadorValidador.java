/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.compensaciones.procesador;

import co.com.claro.compensaciones.entity.CompCausas;
import java.util.Set;
import javax.inject.Inject;
import javax.validation.ConstraintViolation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.annotation.OnProcessError;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.validator.Validator;

/**
 *
 * @author Administrador
 */
public class CausasItemProcesadorValidador implements ItemProcessor<CompCausas, CompCausas> {

    private static final Logger LOG = LoggerFactory.getLogger(CausasItemProcesadorValidador.class);
    @Inject
    private Validator<CompCausas> validator;

    @Override
    public CompCausas process(CompCausas i) throws Exception {
        validator.validate(i);
        return i;
    }

    @OnProcessError
    void onProcessError(CompCausas item, Exception e) {

        LOG.error("Exception occurred in input validation at the {} th item. [message:{}]", item.getIdCausa(), e.getMessage());
    }
}
