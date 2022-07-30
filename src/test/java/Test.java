import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

public class Test {
    @org.junit.jupiter.api.Test
    void myTest() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain")
                .body("number, balance, id")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("number, balance, id"))


        ;


    }
}



