package PAAD.MMDB._d_model_webapp.controller;

import PAAD.MMDB._d_model_webapp.models.User;
import PAAD.MMDB._d_model_webapp.repository.UserRepository;
import PAAD.MMDB._d_model_webapp.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private final UserRepository userRepository;
    private final UserService userService;

    // Create a new User (POST)
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        ResponseEntity<User> savedUser = userService.createUser(user);
        return ResponseEntity.ok(savedUser.getBody());
    }

    // Update an existing User (PUT)
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User userDetails) {
        ResponseEntity<User> userOptional = userService.updateUser(id, userDetails);
        return ResponseEntity.ok(userOptional.getBody());
    }

    // Delete a User (DELETE)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        ResponseEntity<Void> userOptional = userService.deleteUser(id);
        return ResponseEntity.ok(userOptional.getBody());
    }
}
