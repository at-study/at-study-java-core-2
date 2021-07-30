package lections.lesson12.pom_xml;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class Build {

    @JsonProperty("plugin")
    @JacksonXmlElementWrapper(localName="plugins")
    private List<Plugin> plugins;

    public Build() {
    }

    public Build(List<Plugin> plugins) {
        this.plugins = plugins;
    }

    public List<Plugin> getPlugins() {
        return plugins;
    }
}
