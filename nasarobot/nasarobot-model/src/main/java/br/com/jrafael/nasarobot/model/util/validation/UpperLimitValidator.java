package br.com.jrafael.nasarobot.model.util.validation;

import br.com.jrafael.infrastructure.exception.BusinessValidationException;

public class UpperLimitValidator extends CoordinateValidate{

    public UpperLimitValidator(CoordinateValidate coordinateValidate) {
        super(coordinateValidate);
    }

    @Override
    public void performValidation(Integer x, Integer y) throws BusinessValidationException {
        if(x > 5 || y > 5) {
            throw new BusinessValidationException("Invalid coordinates to upper limit.");
        }

    }
}
