package al.prodream.embedded.api.v1.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author aleksruci on 14/Nov/2019
 */

@Getter
@Setter
@JsonDeserialize
public class PetDTO {
    private Long id;
    private CategoryDTO category;
    private String name;
    private String[] photoUrls;
    private TagDTO[] tags;
    private String status;

    public PetDTO() {
    }

    public PetDTO(Long id, CategoryDTO category, String name, String[] photoUrls, TagDTO[] tags, String status) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.photoUrls = photoUrls;
        this.tags = tags;
        this.status = status;
    }
}
