package in.reqres.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static in.reqres.specs.Specs.*;
import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;

@DisplayName("Delete user tests")
public class DeleteUserTests extends TestBase {

    @Test
    @Tag("delete")
    @DisplayName("User can be deleted")
    void deleteUserTest(){
        step("Send delete request to delete user", () ->
                given(requestSpec)
                        .when()
                        .delete("/users/2")
                        .then()
                        .spec(deleteUserResponse204Spec)
        );
    }
}
