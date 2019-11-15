package al.prodream.embedded.api.v1.consumers;

import al.prodream.embedded.api.v1.filters.Filter;
import al.prodream.embedded.api.v1.filters.PathParam;
import al.prodream.embedded.api.v1.filters.QueryParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

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
        String requestUri = getUriComponentsBuilder(uri, filter);

        return restTemplate.getForObject(requestUri, clazz);
    }

    <T> void consumePost(String uri, T object) {

        restTemplate.postForObject(uri, object, ResponseEntity.class);
    }

    private String getUriComponentsBuilder(String uri, Filter filter) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(uri);

        for (PathParam param : filter.getPathParams()) {
                builder = builder.path(param.getPath());
        }

        for (QueryParam param : filter.getQueryParams()) {
            builder = builder.queryParam(param.getName(), param.getValue());
        }

        return builder.toUriString();
    }
}
