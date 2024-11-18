package PAAD.MMDB._d_model_webapp.controller;

import PAAD.MMDB._d_model_webapp.models.ThreeDModel;
import PAAD.MMDB._d_model_webapp.repository.ModelRepository;
import PAAD.MMDB._d_model_webapp.repository.UserRepository;
import PAAD.MMDB._d_model_webapp.service.ThreeDModelService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/api/models")
public class ThreeDModelController implements ThreeDModelService {

    @Autowired
    private ModelRepository modelRepository;
    @Autowired
    private ThreeDModelService modelService;

    // Create a new Model (POST)
    @PostMapping
    public ResponseEntity<ThreeDModel> createModel(@RequestBody ThreeDModel model) {
        ResponseEntity<ThreeDModel> savedModel = modelService.createModel(model);
        return ResponseEntity.ok(savedModel.getBody());
    }

    // Update an existing Model (PUT)
    @PutMapping("/{id}")
    public ResponseEntity<ThreeDModel> updateModel(@PathVariable Long id, @RequestBody ThreeDModel modelDetails) {
        ResponseEntity<ThreeDModel> modelOptional = modelService.updateModel(id, modelDetails);
        return ResponseEntity.ok(modelOptional.getBody());
    }

    // Delete a Model (DELETE)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteModel(@PathVariable Long id) {
        ResponseEntity<Void> modelOptional = modelService.deleteModel(id);
        return ResponseEntity.ok(modelOptional.getBody());
    }
}
