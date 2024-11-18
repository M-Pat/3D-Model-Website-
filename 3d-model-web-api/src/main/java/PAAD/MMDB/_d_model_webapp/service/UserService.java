package PAAD.MMDB._d_model_webapp.service;

import PAAD.MMDB._d_model_webapp.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserService {
    public ResponseEntity<User> createUser(@RequestBody User user);
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User userDetails);
    public ResponseEntity<Void> deleteUser(@PathVariable Long id);

}
