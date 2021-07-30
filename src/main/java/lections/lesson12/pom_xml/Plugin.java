package lections.lesson12.pom_xml;

public class Plugin {
    private String groupId;
    private String artifactId;
    private Configuration configuration;

    public Plugin() {
    }

    public Plugin(String groupId, String artifactId, Configuration configuration) {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.configuration = configuration;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public Configuration getConfiguration() {
        return configuration;
    }
}
