package al.prodream.embedded.api.v1.filters;

/**
 * @author aleksruci on 15/Nov/2019
 */
public class FilterParam {
    private String name;
    private String value;
    private boolean isPathParam = false;

    public FilterParam(String value) {
        this.value = value;
    }

    public FilterParam(String name, String value, boolean isPathParam) {
        this.name = name;
        this.value = value;
        this.isPathParam = isPathParam;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getValue() {
        return isPathParam ? ("/" + value) : value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isPathParam() {
        return isPathParam;
    }

    public void setPathParam(boolean pathParam) {
        isPathParam = pathParam;
    }
}
