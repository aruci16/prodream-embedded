package al.prodream.embedded.api.v1.consumers;

import al.prodream.embedded.api.v1.filters.Filter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

/**
 * @author aleksruci on 14/Nov/2019
 */
class ResourceConsumer {

    private static final String BASE_URI = "https://petstore.swagger.io";

    static final String V1_BASE_URI = BASE_URI + "/v2";

    private final RestTemplate restTemplate;

    ResourceConsumer(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    <T> T consumeGet(String uri, Filter filter, Class<T> clazz) {

        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(uri);

        for (Map.Entry<String, String> entry : filter.getMap().entrySet()) {
            builder.path(entry.getValue());
//            builder = builder.queryParam(entry.getKey(), entry.getValue());
        }

        String url = builder.toUriString();
        return restTemplate.getForObject(url, clazz);
    }

    <T> void consumePost(String uri, T object) {
        restTemplate.postForObject(uri, object, ResponseEntity.class);
    }
}
