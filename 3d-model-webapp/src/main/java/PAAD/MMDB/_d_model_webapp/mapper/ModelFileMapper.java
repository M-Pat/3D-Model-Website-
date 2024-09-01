package PAAD.MMDB._d_model_webapp.mapper;

import PAAD.MMDB._d_model_webapp.dto.ModelFileDTO;
import PAAD.MMDB._d_model_webapp.dto.UserDTO;
import PAAD.MMDB._d_model_webapp.models.ModelFile;
import PAAD.MMDB._d_model_webapp.models.ThreeDModel;
import PAAD.MMDB._d_model_webapp.models.User;
import org.mapstruct.*;
import org.springframework.ui.Model;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ModelFileMapper {
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
            nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
    @Mapping(target = "id", source = "ModelFileDTO.id")
    ModelFile toModel(ModelFileDTO modelFileDTO);
}
