package al.prodream.embedded.api.v1.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author aleksruci on 14/Nov/2019
 */

@Getter
@Setter
@NoArgsConstructor
public class PetDTO {
    private Long id;
    private CategoryDTO category;
    private String name;
    private String[] photoUrls;
    private TagDTO[] tags;
    private String status;
}
