package al.prodream.embedded.api.v1.filters;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author aleksruci on 15/Nov/2019
 */

@Getter
@AllArgsConstructor
public class QueryParam {

    private final String name;
    private final String value;

}
