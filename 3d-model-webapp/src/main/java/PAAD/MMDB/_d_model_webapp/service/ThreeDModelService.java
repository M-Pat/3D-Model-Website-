package PAAD.MMDB._d_model_webapp.service;

import PAAD.MMDB._d_model_webapp.models.ThreeDModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface ThreeDModelService {
    public ResponseEntity<ThreeDModel> createModel(@RequestBody ThreeDModel model);
    public ResponseEntity<ThreeDModel> updateModel(@PathVariable Long id, @RequestBody ThreeDModel modelDetails);
    public ResponseEntity<Void> deleteModel(@PathVariable Long id);
}
