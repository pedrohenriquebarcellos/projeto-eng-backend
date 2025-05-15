package com.dashboard.maicosoft.conf;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("MaiconSoft Dashboard Docs")
                .version("1.0")
                .description("This is the documentation from Maiconsoft Dashboards, containing all the endpoints and testing tools"));
    }

}
