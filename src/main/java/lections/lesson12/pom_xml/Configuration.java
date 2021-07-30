package lections.lesson12.pom_xml;

public class Configuration {
    private String source;
    private String target;

    public Configuration() {
    }

    public Configuration(String source, String target) {
        this.source = source;
        this.target = target;
    }

    public String getSource() {
        return source;
    }

    public String getTarget() {
        return target;
    }
}
