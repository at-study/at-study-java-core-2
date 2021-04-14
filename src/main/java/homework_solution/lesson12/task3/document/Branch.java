package homework_solution.lesson12.task3.document;

import java.util.List;
import java.util.Objects;

public class Branch {
    private Integer id;
    private Integer version;
    private Branch headBranch;
    private String bic;
    private String shortName;
    private String timeZone;
    private List<Object> branchAddresses;
    private Boolean currencyTrifle;
    private String code_TFU;

    public Branch(Integer id, Integer version, Branch headBranch, String bic, String shortName, String timeZone, List<Object> branchAddresses, Boolean currencyTrifle, String code_TFU) {
        this.id = id;
        this.version = version;
        this.headBranch = headBranch;
        this.bic = bic;
        this.shortName = shortName;
        this.timeZone = timeZone;
        this.branchAddresses = branchAddresses;
        this.currencyTrifle = currencyTrifle;
        this.code_TFU = code_TFU;
    }

    public Integer getId() {
        return id;
    }

    public Integer getVersion() {
        return version;
    }

    public Branch getHeadBranch() {
        return headBranch;
    }

    public String getBic() {
        return bic;
    }

    public String getShortName() {
        return shortName;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public List<Object> getBranchAddresses() {
        return branchAddresses;
    }

    public Boolean getCurrencyTrifle() {
        return currencyTrifle;
    }

    public String getCode_TFU() {
        return code_TFU;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Branch branch = (Branch) o;

        if (!Objects.equals(id, branch.id)) return false;
        if (!Objects.equals(version, branch.version)) return false;
        if (!Objects.equals(headBranch, branch.headBranch)) return false;
        if (!Objects.equals(bic, branch.bic)) return false;
        if (!Objects.equals(shortName, branch.shortName)) return false;
        if (!Objects.equals(timeZone, branch.timeZone)) return false;
        if (!Objects.equals(branchAddresses, branch.branchAddresses))
            return false;
        if (currencyTrifle != null ? !currencyTrifle.equals(branch.currencyTrifle) : branch.currencyTrifle != null)
            return false;
        return code_TFU != null ? code_TFU.equals(branch.code_TFU) : branch.code_TFU == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (headBranch != null ? headBranch.hashCode() : 0);
        result = 31 * result + (bic != null ? bic.hashCode() : 0);
        result = 31 * result + (shortName != null ? shortName.hashCode() : 0);
        result = 31 * result + (timeZone != null ? timeZone.hashCode() : 0);
        result = 31 * result + (branchAddresses != null ? branchAddresses.hashCode() : 0);
        result = 31 * result + (currencyTrifle != null ? currencyTrifle.hashCode() : 0);
        result = 31 * result + (code_TFU != null ? code_TFU.hashCode() : 0);
        return result;
    }
}
