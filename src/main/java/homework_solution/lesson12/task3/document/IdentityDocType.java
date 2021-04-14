package homework_solution.lesson12.task3.document;

import java.util.Objects;

public class IdentityDocType {
    private Integer id;
    private Integer version;
    private Integer code;
    private MultiLang name;
    private String seriesPresence;
    private String issueSubdivisionPresence;

    public IdentityDocType(Integer id, Integer version, Integer code, MultiLang name, String seriesPresence, String issueSubdivisionPresence) {
        this.id = id;
        this.version = version;
        this.code = code;
        this.name = name;
        this.seriesPresence = seriesPresence;
        this.issueSubdivisionPresence = issueSubdivisionPresence;
    }

    public Integer getId() {
        return id;
    }

    public Integer getVersion() {
        return version;
    }

    public Integer getCode() {
        return code;
    }

    public MultiLang getName() {
        return name;
    }

    public String getSeriesPresence() {
        return seriesPresence;
    }

    public String getIssueSubdivisionPresence() {
        return issueSubdivisionPresence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdentityDocType that = (IdentityDocType) o;

        if (!Objects.equals(id, that.id)) return false;
        if (!Objects.equals(version, that.version)) return false;
        if (!Objects.equals(code, that.code)) return false;
        if (!Objects.equals(name, that.name)) return false;
        if (!Objects.equals(seriesPresence, that.seriesPresence))
            return false;
        return Objects.equals(issueSubdivisionPresence, that.issueSubdivisionPresence);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (seriesPresence != null ? seriesPresence.hashCode() : 0);
        result = 31 * result + (issueSubdivisionPresence != null ? issueSubdivisionPresence.hashCode() : 0);
        return result;
    }
}
