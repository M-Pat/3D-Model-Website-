package PAAD.MMDB._d_model_webapp.dto;

import PAAD.MMDB._d_model_webapp.models.Post;
import PAAD.MMDB._d_model_webapp.models.ThreeDModel;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDTO {
    private Long id;
    private Date dateCreated;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private List<ThreeDModel> models;
    private List<Post> posts;
    private int countPosts;
}
