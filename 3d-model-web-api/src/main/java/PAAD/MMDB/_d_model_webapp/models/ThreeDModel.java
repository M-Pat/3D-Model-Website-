package PAAD.MMDB._d_model_webapp.models;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table()
public class ThreeDModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @Lob
    @NotNull
    private byte[] file;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
