package PAAD.MMDB._d_model_webapp.service.impl;

import PAAD.MMDB._d_model_webapp.models.Post;
import PAAD.MMDB._d_model_webapp.repository.ModelRepository;
import PAAD.MMDB._d_model_webapp.repository.PostRepository;
import PAAD.MMDB._d_model_webapp.repository.UserRepository;
import PAAD.MMDB._d_model_webapp.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/posts")
public class DefaultPostService implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelRepository modelRepository;  // Adjusted to use ModelRepository

    // Create a new Post (POST)
    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        if (!userRepository.existsById(post.getUser().getId()) ||
                !modelRepository.existsById(post.getModel().getId())) {  // Adjusted to use ModelRepository
            return ResponseEntity.badRequest().build();
        }

        Post savedPost = postRepository.save(post);
        return ResponseEntity.ok(savedPost);
    }

    // Update an existing Post (PUT)
    @PutMapping("/{id}")
    public ResponseEntity<Post> updatePost(@PathVariable Long id, @RequestBody Post postDetails) {
        Optional<Post> postOptional = postRepository.findById(id);

        if (postOptional.isPresent()) {
            Post post = postOptional.get();
            post.setTimestamp(postDetails.getTimestamp());
            post.setPrice(postDetails.getPrice());
            post.setUser(postDetails.getUser());
            post.setModel(postDetails.getModel());
            post.setDownloaded(postDetails.getDownloaded());
            post.setLikedBy(postDetails.getLikedBy());

            Post updatedPost = postRepository.save(post);
            return ResponseEntity.ok(updatedPost);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete a Post (DELETE)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable Long id) {
        Optional<Post> postOptional = postRepository.findById(id);

        if (postOptional.isPresent()) {
            postRepository.delete(postOptional.get());
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
