package br.com.jrafael.nasarobot.model.util.validation;

import br.com.jrafael.infrastructure.exception.BusinessValidationException;

public class LimitCoordinateValidation {

    public static void validate(Integer x, Integer y) throws BusinessValidationException {
        (new LowerLimitValidation(new UpperLimitValidator(null))).validate(x, y);
    }
}
