package PAAD.MMDB._d_model_webapp.repository;

import PAAD.MMDB._d_model_webapp.models.ModelFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelFileRepository extends JpaRepository<ModelFile, String> {

}
