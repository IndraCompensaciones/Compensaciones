/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.compensaciones.validador;

import co.com.claro.compensaciones.entity.CompCausas;
import java.util.Set;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import org.springframework.batch.item.validator.ValidationException;
import org.springframework.batch.item.validator.Validator;

/**
 *
 * @author Administrador
 */
public class CausasItemValidador implements Validator<CompCausas> {

    private ValidatorFactory factory
            = Validation.buildDefaultValidatorFactory();
    private javax.validation.Validator validator
            = factory.getValidator();

    @Override
    public void validate(CompCausas causas) throws ValidationException {
        Set<ConstraintViolation<CompCausas>> violations
                = validator.validate(causas);
        if (!violations.isEmpty()) {
            throw new ValidationException(
                    "la validacion fallo por " + causas + " :"
                    + violationToString(violations));
        }

    }

    private String violationToString(Set<ConstraintViolation<CompCausas>> violations) {
        StringBuilder errorCausa = new StringBuilder();
        violations.stream().forEach((compCausas) -> {
            errorCausa.append(" :");
            errorCausa.append(compCausas);
        });
        return errorCausa.toString();
    }

}
