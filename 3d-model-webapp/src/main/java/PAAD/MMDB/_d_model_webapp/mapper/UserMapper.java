package PAAD.MMDB._d_model_webapp.mapper;

import PAAD.MMDB._d_model_webapp.dto.ModelFileDTO;
import PAAD.MMDB._d_model_webapp.dto.UserDTO;
import PAAD.MMDB._d_model_webapp.models.User;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

public interface UserMapper {
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
            nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
    @Mapping(target = "id", source = "ModelFileDTO.id")
    @Mapping(target = "models", source = "models")
    User toModel(UserDTO userDTO, List<ModelFileDTO> modelFileDTOS);
}
