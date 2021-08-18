package br.com.jrafael.nasarobot.model.util.validation;

import br.com.jrafael.infrastructure.exception.BusinessValidationException;

public class LowerLimitValidation extends CoordinateValidate{

    public LowerLimitValidation(CoordinateValidate coordinateValidate) {
        super(coordinateValidate);
    }

    @Override
    public void performValidation(Integer x, Integer y) throws BusinessValidationException {
        if(x < -5 || y < -5) {
            throw new BusinessValidationException("Invalid coordinates to lowe limit.");
        }
    }
}
