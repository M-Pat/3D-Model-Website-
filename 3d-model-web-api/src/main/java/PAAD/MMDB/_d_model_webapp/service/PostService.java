package PAAD.MMDB._d_model_webapp.service;

import PAAD.MMDB._d_model_webapp.models.Post;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface PostService {
    public ResponseEntity<Post> createPost(@RequestBody Post post);
    public ResponseEntity<Post> updatePost(@PathVariable Long id, @RequestBody Post postDetails);
    public ResponseEntity<Void> deletePost(@PathVariable Long id);
}
