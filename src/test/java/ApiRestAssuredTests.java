import io.restassured.http.ContentType;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

public class ApiRestAssuredTests {

    @BeforeClass
    public void setup(){
        baseURI = "https://gorest.co.in/public/v2";
    }


    /**
     * Este test tiene como objetivo: obtener la lista de usuario
     */

    @Test
    public void testGetUserList(){
        given()
                .accept(ContentType.JSON)
        .when()
                .get("/users")
        .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("id",everyItem(notNullValue()))
                .body("email",everyItem(matchesPattern("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")));

    }
}
