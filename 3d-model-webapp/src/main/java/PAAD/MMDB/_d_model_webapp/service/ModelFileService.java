package PAAD.MMDB._d_model_webapp.service;

import PAAD.MMDB._d_model_webapp.models.ModelFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.stream.Stream;

public interface ModelFileService {
    public ModelFile store(MultipartFile file) throws IOException;

    public ModelFile getFile(String id);

    public Stream<ModelFile> getAllFiles();
}
