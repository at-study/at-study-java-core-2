package lections.lesson10.logs_task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LogRecord {
    private String host;
    private String domain;
    private String userName;
    private LocalDateTime timeStamp;
    private RequestInfo requestInfo;
    private int statusCode;
    private int size;
    private String referrer;
    private String userAgent;

    public LogRecord(String logRecord) {
        String[] split = logRecord.split(" ");
        host = split[0];
        domain = split[1];
        userName = split[2];
        timeStamp = LocalDateTime.parse(split[3].substring(1, split[3].length() - 1), DateTimeFormatter.ofPattern("dd/MMM/yyyy:HH:mm:ss", Locale.ENGLISH));
        requestInfo = new RequestInfo(Method.valueOf(split[4].substring(1)), split[5], split[6].substring(0, split[6].length() - 1));
        statusCode = Integer.parseInt(split[7]);
        size = Integer.parseInt(split[8]);
        referrer = split[9];
        userAgent = split[10] + split[11] + split[12] + split[13];
    }

    public String getHost() {
        return host;
    }

    public String getDomain() {
        return domain;
    }

    public String getUserName() {
        return userName;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public RequestInfo getRequestInfo() {
        return requestInfo;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public int getSize() {
        return size;
    }

    public String getReferrer() {
        return referrer;
    }

    public String getUserAgent() {
        return userAgent;
    }
}
