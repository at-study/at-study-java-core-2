package homework_solution.lesson12.task3.document;

import java.util.Objects;

public class IdentityDocument {
    private IdentityDocType identityDocType;
    private String series;
    private String number;
    private String issueDate;
    private String issuer;
    private String issuerSubdivision;
    private String lastName;
    private String firstName;
    private String middleName;

    public IdentityDocument(IdentityDocType identityDocType, String series, String number, String issueDate, String issuer, String issuerSubdivision, String lastName, String firstName, String middleName) {
        this.identityDocType = identityDocType;
        this.series = series;
        this.number = number;
        this.issueDate = issueDate;
        this.issuer = issuer;
        this.issuerSubdivision = issuerSubdivision;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public IdentityDocType getIdentityDocType() {
        return identityDocType;
    }

    public String getSeries() {
        return series;
    }

    public String getNumber() {
        return number;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getIssuer() {
        return issuer;
    }

    public String getIssuerSubdivision() {
        return issuerSubdivision;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdentityDocument that = (IdentityDocument) o;

        if (!Objects.equals(identityDocType, that.identityDocType))
            return false;
        if (!Objects.equals(series, that.series)) return false;
        if (!Objects.equals(number, that.number)) return false;
        if (!Objects.equals(issueDate, that.issueDate)) return false;
        if (!Objects.equals(issuer, that.issuer)) return false;
        if (!Objects.equals(issuerSubdivision, that.issuerSubdivision))
            return false;
        if (!Objects.equals(lastName, that.lastName)) return false;
        if (!Objects.equals(firstName, that.firstName)) return false;
        return Objects.equals(middleName, that.middleName);
    }

    @Override
    public int hashCode() {
        int result = identityDocType != null ? identityDocType.hashCode() : 0;
        result = 31 * result + (series != null ? series.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (issueDate != null ? issueDate.hashCode() : 0);
        result = 31 * result + (issuer != null ? issuer.hashCode() : 0);
        result = 31 * result + (issuerSubdivision != null ? issuerSubdivision.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        return result;
    }
}
