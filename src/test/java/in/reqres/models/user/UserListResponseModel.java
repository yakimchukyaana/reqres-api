package in.reqres.models.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserListResponseModel {
    int page, total;
    @JsonProperty("per_page")
    int perPage;
    @JsonProperty("total_pages")
    int totalPages;
    ArrayList<UserModel> data;
}
