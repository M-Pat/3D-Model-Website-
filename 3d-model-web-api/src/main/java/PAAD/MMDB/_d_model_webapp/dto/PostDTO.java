package PAAD.MMDB._d_model_webapp.dto;

import PAAD.MMDB._d_model_webapp.models.ThreeDModel;
import PAAD.MMDB._d_model_webapp.models.User;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PostDTO {
    private Long id;
    private Date timestamp;
    private User user;
    private ThreeDModel model;
    private double price;
    private List<User> downloaded;
    private List<User> likedBy;
}
