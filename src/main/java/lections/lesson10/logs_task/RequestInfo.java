package lections.lesson10.logs_task;

public class RequestInfo {
    private Method method;
    private String uri;
    private String protocol;

    public RequestInfo(Method method, String uri, String protocol) {
        this.method = method;
        this.uri = uri;
        this.protocol = protocol;
    }

    public Method getMethod() {
        return method;
    }

    public String getUri() {
        return uri;
    }

    public String getProtocol() {
        return protocol;
    }
}
