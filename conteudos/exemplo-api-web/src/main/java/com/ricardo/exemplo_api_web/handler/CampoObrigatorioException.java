package com.ricardo.exemplo_api_web.handler;

public class CampoObrigatorioException extends BusinessException{
    public CampoObrigatorioException(String campo) {
        super("O campo %s é obrigatório!", campo);
    }
}
