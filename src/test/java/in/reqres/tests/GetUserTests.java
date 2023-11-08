package in.reqres.tests;

import in.reqres.models.user.UserListResponseModel;
import in.reqres.models.user.UserResponseModel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static in.reqres.specs.Specs.*;
import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetUserTests extends TestBase {

    @Test
    @DisplayName("Single user not found")
    void singleUserNotFoundTest() {
        step("Verify User not found request", () ->
                given(requestSpec)
                        .when()
                        .get("/users/42")
                        .then()
                        .spec(userNotFoundResponse404Spec)
        );
    }

    @Test
    @DisplayName("Single user is found")
    void singleUserTest() {
        UserResponseModel response = step("Send get request for single user", () ->
                given(requestSpec)
                        .when()
                        .get("/users/2")
                        .then()
                        .spec(userResponse200Spec)
                        .extract().as(UserResponseModel.class));
        step("Verify user info", () -> {
            assertThat(2).isEqualTo(response.getData().getId());
            assertThat("Janet").isEqualTo(response.getData().getFirstName());
            assertThat("Weaver").isEqualTo(response.getData().getLastName());
        });
    }

    @Test
    @DisplayName("1")
    void getCorrectListOfUsersTest() {
        UserListResponseModel response = step("Send get request for list of users", () ->
                given(requestSpec)
                        .when()
                        .get("/users?page=2")
                        .then()
                        .spec(userResponse200Spec)
                        .extract().as(UserListResponseModel.class));

        step("Verify users list", () -> {
            assertEquals(2, response.getPage());
            assertEquals(6, response.getPerPage());
            assertEquals(12, response.getTotal());
            assertEquals(2, response.getTotalPages());
            assertEquals(2, response.getTotalPages());
            assertEquals(12, response.getData().get(5).getId());
            assertEquals("rachel.howell@reqres.in", response.getData().get(5).getEmail());
            assertEquals("Rachel", response.getData().get(5).getFirstName());
            assertEquals("Howell", response.getData().get(5).getLastName());
            assertEquals("https://reqres.in/img/faces/12-image.jpg", response.getData().get(5).getAvatar());
        });

    }
}
