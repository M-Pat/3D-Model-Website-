package PAAD.MMDB._d_model_webapp.repository;

import PAAD.MMDB._d_model_webapp.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByUserId(Long userId);
    List<Post> findByModelId(Long modelId);
}
