package PAAD.MMDB._d_model_webapp.models;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "posted_at")
    private Date timestamp;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @Column(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "model_id")
    @Column(name = "model")
    private ThreeDModel model;

    @NotNull
    @Column(name = "price")
    private double price;

    @ManyToMany
    @JoinTable(
            name = "post_downloaded_users",
            joinColumns = @JoinColumn(name = "post_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    @Column(name = "downloads")
    private List<User> downloaded;

    @ManyToMany
    @JoinTable(
            name = "post_likedby_users",
            joinColumns = @JoinColumn(name = "post_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    @Column(name = "liked_by")
    private List<User> likedBy;
}
