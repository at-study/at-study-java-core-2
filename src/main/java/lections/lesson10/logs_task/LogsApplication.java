package lections.lesson10.logs_task;

import java.io.IOException;
import java.util.List;

public class LogsApplication {

    public static void main(String[] args) throws IOException {
        List<LogRecord> records = LogParser.parseLogs("src/main/java/lections/lesson10/logs.txt");
    }
    
}
