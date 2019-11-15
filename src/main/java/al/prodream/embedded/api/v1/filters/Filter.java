package al.prodream.embedded.api.v1.filters;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author aleksruci on 14/Nov/2019
 */
public class Filter {
    private Queue<PathParam> pathParams;
    private List<QueryParam> queryParams;

    Filter() {
        pathParams = new PriorityQueue<>();
        queryParams = new ArrayList<>();
    }

    public Queue<PathParam> getPathParams() {
        return pathParams;
    }

    void addPathParam(String resourcePath, String documentIdentifier, int position) {
        pathParams.add(new PathParam(resourcePath, documentIdentifier, position));
    }

    void addPathParam(Long documentIdentifier, int position) {
        addPathParam(null, String.valueOf(documentIdentifier), position);
    }

    void addPathParam(String resourcePath, Long documentIdentifier, int position) {
        addPathParam(resourcePath, String.valueOf(documentIdentifier), position);
    }

    public List<QueryParam> getQueryParams() {
        return queryParams;
    }

    void addQueryParam(String name, Long value) {
        addQueryParam(name, String.valueOf(value));
    }

    void addQueryParam(String name, int value) {
        addQueryParam(name, String.valueOf(value));
    }

    void addQueryParam(String name, String value) {
        queryParams.add(new QueryParam(name, value));
    }
}