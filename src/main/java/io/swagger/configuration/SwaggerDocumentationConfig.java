package io.swagger.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-16T18:43:54.181615-04:00[America/New_York]")
@Configuration
public class SwaggerDocumentationConfig {

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
            .info(new Info()
                .title("School Service API")
                .description("API for managing students, courses, and registrations in a school system")
                .termsOfService("")
                .version("1.0.0")
                .license(new License()
                    .name("")
                    .url("http://unlicense.org"))
                .contact(new io.swagger.v3.oas.models.info.Contact()
                    .email("")));
    }

}
