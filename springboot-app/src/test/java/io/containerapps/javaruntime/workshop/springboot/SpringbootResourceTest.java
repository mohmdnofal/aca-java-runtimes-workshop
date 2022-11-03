package io.containerapps.javaruntime.workshop.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;

@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT, properties = {
    "server.port=8803",
    "spring.datasource.url=jdbc:tc:postgresql:14-alpine://testcontainers/postgres",
    "spring.datasource.username=postgres",
    "spring.datasource.password=password"
})
public class SpringbootResourceTest {

    private static String basePath = "http://localhost:8803/springboot";

}