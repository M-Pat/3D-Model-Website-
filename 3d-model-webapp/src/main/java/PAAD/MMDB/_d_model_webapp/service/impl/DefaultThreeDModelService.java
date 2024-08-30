package PAAD.MMDB._d_model_webapp.service.impl;

import PAAD.MMDB._d_model_webapp.models.ThreeDModel;
import PAAD.MMDB._d_model_webapp.repository.ModelRepository;
import PAAD.MMDB._d_model_webapp.repository.UserRepository;
import PAAD.MMDB._d_model_webapp.service.ThreeDModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/models")
public class DefaultThreeDModelService implements ThreeDModelService {

    @Autowired
    private ModelRepository modelRepository;

    @Autowired
    private UserRepository userRepository;

    // Create a new Model (POST)
    @PostMapping
    public ResponseEntity<ThreeDModel> createModel(@RequestBody ThreeDModel model) {
        if (!userRepository.existsById(model.getUser().getId())) {
            return ResponseEntity.badRequest().build();
        }

        ThreeDModel savedModel = modelRepository.save(model);
        return ResponseEntity.ok(savedModel);
    }

    // Update an existing Model (PUT)
    @PutMapping("/{id}")
    public ResponseEntity<ThreeDModel> updateModel(@PathVariable Long id, @RequestBody ThreeDModel modelDetails) {
        Optional<ThreeDModel> modelOptional = modelRepository.findById(id);

        if (modelOptional.isPresent()) {
            ThreeDModel model = modelOptional.get();
            model.setName(modelDetails.getName());
            model.setFile(modelDetails.getFile());
            model.setUser(modelDetails.getUser());

            ThreeDModel updatedModel = modelRepository.save(model);
            return ResponseEntity.ok(updatedModel);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete a Model (DELETE)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteModel(@PathVariable Long id) {
        Optional<ThreeDModel> modelOptional = modelRepository.findById(id);

        if (modelOptional.isPresent()) {
            modelRepository.delete(modelOptional.get());
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
