package al.prodream.embedded.api.v1.filters;

import lombok.AllArgsConstructor;

/**
 * @author aleksruci on 15/Nov/2019
 */

@AllArgsConstructor
public class PathParam implements Comparable<PathParam> {

    private final String resourcePath;
    private final String documentIdentifier;
    private final int position;

    public PathParam(String documentIdentifier, int position) {
        this(null, documentIdentifier, position);
    }

    public String getPath() {
        String documentPath = "/" + documentIdentifier;

        return resourcePath == null ? documentPath : ("/" + resourcePath + documentPath);
    }

    @Override
    public int compareTo(PathParam o) {
        if(this.position > o.position) {
            return 1;
        }
        return this.position < o.position ? -1 : 0;
    }
}
