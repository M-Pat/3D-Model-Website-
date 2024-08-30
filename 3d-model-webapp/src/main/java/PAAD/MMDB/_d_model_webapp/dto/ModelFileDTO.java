package PAAD.MMDB._d_model_webapp.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ModelFileDTO {
    private Long id;
    private String name;
    private String type;
    private byte[] data;
}
