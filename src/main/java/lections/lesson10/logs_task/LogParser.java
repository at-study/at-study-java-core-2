package lections.lesson10.logs_task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LogParser {

    public static List<LogRecord> parseLogs(String filePath) throws IOException {
        List<String> content = Files.readAllLines(Paths.get(filePath));
        List<LogRecord> logRecords = new ArrayList<>();
        for (String line : content) {
            logRecords.add(new LogRecord(line));
        }
        return logRecords;
    }

}
