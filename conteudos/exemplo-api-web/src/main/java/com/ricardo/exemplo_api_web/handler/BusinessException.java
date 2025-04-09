package com.ricardo.exemplo_api_web.handler;

public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Object ... params) {
        super(String.format(message, params));
    }
}
