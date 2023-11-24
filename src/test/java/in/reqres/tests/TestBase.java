package in.reqres.tests;

import in.reqres.config.ApiConfig;
import io.restassured.RestAssured;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    static ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class);

    @BeforeAll
    public static void beforeAll(){
        RestAssured.baseURI = apiConfig.BaseUri();
        RestAssured.basePath = apiConfig.BasePath();
    }
}
