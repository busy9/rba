package org.rba.rest;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "RBA API", version = "1.0", description = "R,B, or RBA ?"))
public class RbaRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RbaRestApplication.class, args);
    }

}
