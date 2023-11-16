package in.reqres.tests;

import in.reqres.models.update.UpdateUserRequestModel;
import in.reqres.models.update.UpdateUserResponseModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static in.reqres.specs.Specs.requestSpec;
import static in.reqres.specs.Specs.userResponse200Spec;
import static io.restassured.RestAssured.given;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("Update user tests")
public class UpdateUserTests extends TestBase {

    @Test
    @Tag("update")
    @DisplayName("User info can be updated with patch request")
    void updateUserInfoTest() {
        UpdateUserRequestModel updateData = new UpdateUserRequestModel();
        updateData.setName("morpheus");
        updateData.setJob("zion resident");

        UpdateUserResponseModel response = step("Send patch request to update user info", () ->
                given(requestSpec)
                        .body(updateData)
                        .when()
                        .patch("/users/2")
                        .then()
                        .spec(userResponse200Spec)
                        .extract().as(UpdateUserResponseModel.class));
        step("Verify response", () -> {
            assertThat(response.getName()).isEqualTo("morpheus");
            assertThat(response.getJob()).isEqualTo("zion resident");
        });
    }

    @Test
    @Tag("update")
    @DisplayName("User info can be updated with put request")
    void putUserInfoTest() {
        UpdateUserRequestModel updateData = new UpdateUserRequestModel();
        updateData.setName("morpheus");
        updateData.setJob("zion resident");

        UpdateUserResponseModel response = step("Send put request to update user info", () ->
                given(requestSpec)
                        .body(updateData)
                        .when()
                        .put("/users/2")
                        .then()
                        .spec(userResponse200Spec)
                        .extract().as(UpdateUserResponseModel.class));
        step("Verify response", () -> {
            assertThat(response.getName()).isEqualTo("morpheus");
            assertThat(response.getJob()).isEqualTo("zion resident");
        });
    }
}
