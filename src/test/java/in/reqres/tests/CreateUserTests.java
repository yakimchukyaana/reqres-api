package in.reqres.tests;

import in.reqres.models.create.CreateUserRequestModel;
import in.reqres.models.create.CreateUserResponseModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static in.reqres.specs.Specs.createUserResponse201Spec;
import static in.reqres.specs.Specs.requestSpec;
import static io.restassured.RestAssured.given;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Create user tests")
public class CreateUserTests extends TestBase {

    @Test
    @Tag("create")
    @DisplayName("User can be successfully created")
    void successfullyCreateUserTest() {
        CreateUserRequestModel createData = new CreateUserRequestModel();
        createData.setName("morpheus");
        createData.setJob("leader");

        CreateUserResponseModel response = step("Create user", () ->
                given(requestSpec)
                        .body(createData)
                        .when()
                        .post("/users")
                        .then()
                        .spec(createUserResponse201Spec)
                        .extract().as(CreateUserResponseModel.class));
        step("Verify response", () -> {
            assertThat(response.getName()).isEqualTo("morpheus");
            assertThat(response.getJob()).isEqualTo("leader");
        });
    }
}
