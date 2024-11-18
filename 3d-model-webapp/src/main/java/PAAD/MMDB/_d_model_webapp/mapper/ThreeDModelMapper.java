package PAAD.MMDB._d_model_webapp.mapper;

import PAAD.MMDB._d_model_webapp.dto.ModelFileDTO;
import PAAD.MMDB._d_model_webapp.dto.ThreeDModelDTO;
import PAAD.MMDB._d_model_webapp.dto.UserDTO;
import PAAD.MMDB._d_model_webapp.models.ThreeDModel;
import PAAD.MMDB._d_model_webapp.models.User;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapping;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;

import java.util.List;

public interface ThreeDModelMapper {
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)

    @Mapping(target = "id", source = "ThreeDModelDTO.id")
    ThreeDModel toModel(ThreeDModelDTO threeDModelDTO);
}
