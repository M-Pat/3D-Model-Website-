package PAAD.MMDB._d_model_webapp.service.impl;

import PAAD.MMDB._d_model_webapp.models.ModelFile;
import PAAD.MMDB._d_model_webapp.service.ModelFileService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.stream.Stream;

@Slf4j
@Service
@AllArgsConstructor
public class DefaultModelFileService implements ModelFileService {
    //TODO Implement aws3 storage for files
    @Override
    public ModelFile store(MultipartFile file) throws IOException {
        return null;
    }

    @Override
    public ModelFile getFile(String id) {
        return null;
    }

    @Override
    public Stream<ModelFile> getAllFiles() {
        return Stream.empty();
    }
}
