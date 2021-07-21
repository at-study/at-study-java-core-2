package lections.lesson11;

import java.time.LocalDate;

public class Passport {
    private String series;
    private String number;
    private LocalDate issueDate;

    public Passport(String series, String number) {
        this.series = series;
        this.number = number;
        this.issueDate = LocalDate.now();
    }

    public String getSeries() {
        return series;
    }

    public String getNumber() {
        return number;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }
}
