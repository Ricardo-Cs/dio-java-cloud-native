package com.ricardo.exemplo_api_web.doc;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "Title - Rest API",
                version = "1.0",
                description = "API exemplo de uso de Springboot REST API",
                contact = @Contact(
                        name = "Seu nome",
                        url = "http://www.seusite.com.br",
                        email = "voce@seusite.com.br"
                ),
                license = @License(
                        name = "Licença - Sua Empresa",
                        url = "http://www.seusite.com.br"
                ),
                termsOfService = "Termo de uso: Open Source"
        ),
        servers = @Server(url = "/")
)
public class OpenApiConfig { }