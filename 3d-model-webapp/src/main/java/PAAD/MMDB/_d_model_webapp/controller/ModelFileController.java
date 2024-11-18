package PAAD.MMDB._d_model_webapp.controller;

import PAAD.MMDB._d_model_webapp.models.ModelFile;
import PAAD.MMDB._d_model_webapp.service.ModelFileService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.stream.Stream;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/api/files")
public class ModelFileController  {
    public ModelFile store(MultipartFile file) throws IOException {
        return null;
    }


    public ModelFile getFile(String id) {
        return null;
    }

    public Stream<ModelFile> getAllFiles() {
        return Stream.empty();
    }
}
