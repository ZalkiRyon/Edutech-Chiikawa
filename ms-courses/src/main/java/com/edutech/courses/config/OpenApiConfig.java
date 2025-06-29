package com.edutech.courses.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuración personalizada para OpenAPI/Swagger
 * Se crea una configuración manual para evitar conflictos con HATEOAS
 */
@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Courses Microservice API")
                        .version("1.0.0")
                        .description("API para la gestión de cursos, contenidos y categorías académicas"));
    }
}
