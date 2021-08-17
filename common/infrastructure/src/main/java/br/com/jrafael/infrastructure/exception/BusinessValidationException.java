package br.com.jrafael.infrastructure.exception;

public class BusinessValidationException extends Exception {
    public BusinessValidationException(String mensagem) {
        super(mensagem);
    }
}

