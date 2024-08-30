package PAAD.MMDB._d_model_webapp.dto;

import PAAD.MMDB._d_model_webapp.models.User;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ThreeDModelDTO {
    @Id
    private Long id;
    private String name;
    private byte[] file;
    private User user;
}
