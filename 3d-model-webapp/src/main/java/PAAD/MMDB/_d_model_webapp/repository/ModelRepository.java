package PAAD.MMDB._d_model_webapp.repository;

import PAAD.MMDB._d_model_webapp.models.ThreeDModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelRepository extends JpaRepository<ThreeDModel, Long> {
    List<ThreeDModel> findByUserId(Long userId);
}

