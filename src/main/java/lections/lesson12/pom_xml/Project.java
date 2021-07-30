package lections.lesson12.pom_xml;

import java.util.List;
import java.util.Map;

public class Project {
    private String schemaLocation;
    private String modelVersion;
    private String groupId;
    private String artifactId;
    private String version;
    private Map<String, String> properties;
    private List<Dependency> dependencies;
    private Build build;

    public Project() {
    }

    public Project(String schemaLocation, String modelVersion, String groupId, String artifactId, String version, Map<String, String> properties, List<Dependency> dependencies, Build build) {
        this.schemaLocation = schemaLocation;
        this.modelVersion = modelVersion;
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
        this.properties = properties;
        this.dependencies = dependencies;
        this.build = build;
    }

    public String getSchemaLocation() {
        return schemaLocation;
    }

    public String getModelVersion() {
        return modelVersion;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public String getVersion() {
        return version;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public List<Dependency> getDependencies() {
        return dependencies;
    }

    public Build getBuild() {
        return build;
    }
}
