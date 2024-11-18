package PAAD.MMDB._d_model_webapp.service.impl;

import PAAD.MMDB._d_model_webapp.models.User;
import PAAD.MMDB._d_model_webapp.repository.UserRepository;
import PAAD.MMDB._d_model_webapp.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Slf4j
@Service
@AllArgsConstructor
public class DefaultUserService implements UserService {

    @Autowired
    private UserRepository userRepository;

    // Create a new User (POST)
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = userRepository.save(user);
        return ResponseEntity.ok(savedUser);
    }

    // Update an existing User (PUT)
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User userDetails) {
        Optional<User> userOptional = userRepository.findById(id);

        if (userOptional.isPresent()) {
            User user = userOptional.get();
            user.setEmail(userDetails.getEmail());
            user.setPassword(userDetails.getPassword());
            user.setCountPosts(userDetails.getCountPosts());

            User updatedUser = userRepository.save(user);
            return ResponseEntity.ok(updatedUser);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete a User (DELETE)
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        Optional<User> userOptional = userRepository.findById(id);

        if (userOptional.isPresent()) {
            userRepository.delete(userOptional.get());
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
