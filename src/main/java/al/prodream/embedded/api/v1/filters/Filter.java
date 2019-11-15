package al.prodream.embedded.api.v1.filters;

import java.util.HashMap;
import java.util.Map;

/**
 * @author aleksruci on 14/Nov/2019
 */
public class Filter {
    private Map<String, String> map;

    Filter() {
        map = new HashMap<>();
    }

    void put(String key, String value) {
        map.put(key, value);
    }

    public Map<String, String> getMap() {
        return map;
    }
}