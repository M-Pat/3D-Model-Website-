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
@Table(name = "3d_models")
public class ThreeDModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "name")
    private String name;


    @OneToOne(
            cascade = CascadeType.ALL,
            mappedBy = "file_id"
    )
    @Column(name = "file")
    private ModelFile file;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @Column(name = "user_id")
    private User user;
}
