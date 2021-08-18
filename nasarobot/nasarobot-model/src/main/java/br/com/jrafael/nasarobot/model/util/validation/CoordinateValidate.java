package br.com.jrafael.nasarobot.model.util.validation;

import br.com.jrafael.infrastructure.exception.BusinessValidationException;

public abstract class CoordinateValidate {

    CoordinateValidate coordinateValidate;

    public CoordinateValidate(CoordinateValidate coordinateValidate){
        this.coordinateValidate = coordinateValidate;
    }

    public abstract void performValidation(Integer x, Integer y) throws BusinessValidationException;

    public void validate(Integer x, Integer y) throws BusinessValidationException {
        performValidation(x, y);
        if(coordinateValidate != null){
            coordinateValidate.performValidation(x, y);
        }
    }
}
