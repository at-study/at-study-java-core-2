package homework_solution.lesson12.task3.document;

import java.util.List;
import java.util.Objects;

public class Document {
    private Integer id;
    private Integer edocRefId;
    private String globalId;
    private Integer typeId;
    private String channel;
    private String documentNumber;
    private String documentDate;
    private Integer version;
    private Object read;
    private Client client;
    private Status status;
    private List<Object> checkResults;
    private Object sellingPoint;
    private IdentityDocument identityDocument;
    private List<Object> clientExternalIds;
    private BankAccount bankAccount;
    private OperBranch operBranch;
    private String operationDate;
    private String description;
    private Currency currency;
    private String amount;
    private List<SymbolAmount> symbolAmounts;
    private List<CashQuantity> cashQuantities;
    private Account commissionAccount;
    private Object budget;
    private List<Object> budgetAmounts;
    private Object classifier;
    private Object noteFromBank;
    private Object cancelRequest;
    private Boolean cancelReqInProgress;

    public Document(Integer id, Integer edocRefId, String globalId, Integer typeId, String channel, String documentNumber, String documentDate, Integer version, Object read, Client client, Status status, List<Object> checkResults, Object sellingPoint, IdentityDocument identityDocument, List<Object> clientExternalIds, BankAccount bankAccount, OperBranch operBranch, String operationDate, String description, Currency currency, String amount, List<SymbolAmount> symbolAmounts, List<CashQuantity> cashQuantities, Account commissionAccount, Object budget, List<Object> budgetAmounts, Object classifier, Object noteFromBank, Object cancelRequest, Boolean cancelReqInProgress) {
        this.id = id;
        this.edocRefId = edocRefId;
        this.globalId = globalId;
        this.typeId = typeId;
        this.channel = channel;
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
        this.version = version;
        this.read = read;
        this.client = client;
        this.status = status;
        this.checkResults = checkResults;
        this.sellingPoint = sellingPoint;
        this.identityDocument = identityDocument;
        this.clientExternalIds = clientExternalIds;
        this.bankAccount = bankAccount;
        this.operBranch = operBranch;
        this.operationDate = operationDate;
        this.description = description;
        this.currency = currency;
        this.amount = amount;
        this.symbolAmounts = symbolAmounts;
        this.cashQuantities = cashQuantities;
        this.commissionAccount = commissionAccount;
        this.budget = budget;
        this.budgetAmounts = budgetAmounts;
        this.classifier = classifier;
        this.noteFromBank = noteFromBank;
        this.cancelRequest = cancelRequest;
        this.cancelReqInProgress = cancelReqInProgress;
    }

    public Integer getId() {
        return id;
    }

    public Integer getEdocRefId() {
        return edocRefId;
    }

    public String getGlobalId() {
        return globalId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public String getChannel() {
        return channel;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public String getDocumentDate() {
        return documentDate;
    }

    public Integer getVersion() {
        return version;
    }

    public Object getRead() {
        return read;
    }

    public Client getClient() {
        return client;
    }

    public Status getStatus() {
        return status;
    }

    public List<Object> getCheckResults() {
        return checkResults;
    }

    public Object getSellingPoint() {
        return sellingPoint;
    }

    public IdentityDocument getIdentityDocument() {
        return identityDocument;
    }

    public List<Object> getClientExternalIds() {
        return clientExternalIds;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public OperBranch getOperBranch() {
        return operBranch;
    }

    public String getOperationDate() {
        return operationDate;
    }

    public String getDescription() {
        return description;
    }

    public Currency getCurrency() {
        return currency;
    }

    public String getAmount() {
        return amount;
    }

    public List<SymbolAmount> getSymbolAmounts() {
        return symbolAmounts;
    }

    public List<CashQuantity> getCashQuantities() {
        return cashQuantities;
    }

    public Account getCommissionAccount() {
        return commissionAccount;
    }

    public Object getBudget() {
        return budget;
    }

    public List<Object> getBudgetAmounts() {
        return budgetAmounts;
    }

    public Object getClassifier() {
        return classifier;
    }

    public Object getNoteFromBank() {
        return noteFromBank;
    }

    public Object getCancelRequest() {
        return cancelRequest;
    }

    public Boolean getCancelReqInProgress() {
        return cancelReqInProgress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Document document = (Document) o;

        if (!Objects.equals(id, document.id)) return false;
        if (!Objects.equals(edocRefId, document.edocRefId)) return false;
        if (!Objects.equals(globalId, document.globalId)) return false;
        if (!Objects.equals(typeId, document.typeId)) return false;
        if (!Objects.equals(channel, document.channel)) return false;
        if (!Objects.equals(documentNumber, document.documentNumber))
            return false;
        if (!Objects.equals(documentDate, document.documentDate))
            return false;
        if (!Objects.equals(version, document.version)) return false;
        if (!Objects.equals(read, document.read)) return false;
        if (!Objects.equals(client, document.client)) return false;
        if (!Objects.equals(status, document.status)) return false;
        if (!Objects.equals(checkResults, document.checkResults))
            return false;
        if (!Objects.equals(sellingPoint, document.sellingPoint))
            return false;
        if (!Objects.equals(identityDocument, document.identityDocument))
            return false;
        if (!Objects.equals(clientExternalIds, document.clientExternalIds))
            return false;
        if (!Objects.equals(bankAccount, document.bankAccount))
            return false;
        if (!Objects.equals(operBranch, document.operBranch)) return false;
        if (!Objects.equals(operationDate, document.operationDate))
            return false;
        if (!Objects.equals(description, document.description))
            return false;
        if (!Objects.equals(currency, document.currency)) return false;
        if (!Objects.equals(amount, document.amount)) return false;
        if (!Objects.equals(symbolAmounts, document.symbolAmounts))
            return false;
        if (!Objects.equals(cashQuantities, document.cashQuantities))
            return false;
        if (!Objects.equals(commissionAccount, document.commissionAccount))
            return false;
        if (!Objects.equals(budget, document.budget)) return false;
        if (!Objects.equals(budgetAmounts, document.budgetAmounts))
            return false;
        if (!Objects.equals(classifier, document.classifier)) return false;
        if (!Objects.equals(noteFromBank, document.noteFromBank))
            return false;
        if (!Objects.equals(cancelRequest, document.cancelRequest))
            return false;
        return Objects.equals(cancelReqInProgress, document.cancelReqInProgress);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (edocRefId != null ? edocRefId.hashCode() : 0);
        result = 31 * result + (globalId != null ? globalId.hashCode() : 0);
        result = 31 * result + (typeId != null ? typeId.hashCode() : 0);
        result = 31 * result + (channel != null ? channel.hashCode() : 0);
        result = 31 * result + (documentNumber != null ? documentNumber.hashCode() : 0);
        result = 31 * result + (documentDate != null ? documentDate.hashCode() : 0);
        result = 31 * result + (version != null ? version.hashCode() : 0);
        result = 31 * result + (read != null ? read.hashCode() : 0);
        result = 31 * result + (client != null ? client.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (checkResults != null ? checkResults.hashCode() : 0);
        result = 31 * result + (sellingPoint != null ? sellingPoint.hashCode() : 0);
        result = 31 * result + (identityDocument != null ? identityDocument.hashCode() : 0);
        result = 31 * result + (clientExternalIds != null ? clientExternalIds.hashCode() : 0);
        result = 31 * result + (bankAccount != null ? bankAccount.hashCode() : 0);
        result = 31 * result + (operBranch != null ? operBranch.hashCode() : 0);
        result = 31 * result + (operationDate != null ? operationDate.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (symbolAmounts != null ? symbolAmounts.hashCode() : 0);
        result = 31 * result + (cashQuantities != null ? cashQuantities.hashCode() : 0);
        result = 31 * result + (commissionAccount != null ? commissionAccount.hashCode() : 0);
        result = 31 * result + (budget != null ? budget.hashCode() : 0);
        result = 31 * result + (budgetAmounts != null ? budgetAmounts.hashCode() : 0);
        result = 31 * result + (classifier != null ? classifier.hashCode() : 0);
        result = 31 * result + (noteFromBank != null ? noteFromBank.hashCode() : 0);
        result = 31 * result + (cancelRequest != null ? cancelRequest.hashCode() : 0);
        result = 31 * result + (cancelReqInProgress != null ? cancelReqInProgress.hashCode() : 0);
        return result;
    }
}
