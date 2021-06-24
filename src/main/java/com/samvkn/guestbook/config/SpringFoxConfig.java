package com.samvkn.guestbook.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SpringFoxConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com.samvkn"))
                    .paths(PathSelectors.any())
                    .build()
                    .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo() {
        return new ApiInfo("Guestbook API", "Simple API for saving messages left by visitors using in a JSON format.", "1.0.0", "/tos", new Contact("Samuel Clinton", "https://samvkn.dev", "contato@samvkn.dev"), "Apache License", "/license", Collections.emptyList());
    }
}
