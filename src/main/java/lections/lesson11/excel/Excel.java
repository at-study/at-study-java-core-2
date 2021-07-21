package lections.lesson11.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import lections.lesson11.Person;

public class Excel {

    public static List<Person> getThreeFirstPersons(String path) {
        Workbook excelFile = openExcelFile(path);
        Sheet sheet = excelFile.getSheet("Persons1");
        List<Row> threeRows = getThreeRowsFromSheet(sheet);
        return convertRowsToPersons(threeRows);
    }

    private static Workbook openExcelFile(String path) {
        try (FileInputStream file = new FileInputStream(new File(path))) {
            return new XSSFWorkbook(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static List<Row> getThreeRowsFromSheet(Sheet sheet) {
        List<Row> rows = new ArrayList<>();
        for (int i = 0; i <= 2; i++) {
            Row row = sheet.getRow(i);
            rows.add(row);
        }
        return rows;
    }

    private static List<Person> convertRowsToPersons(List<Row> rows) {
        List<Person> persons = new ArrayList<>();
        for (Row row : rows) {
            Person person = convertRowToPerson(row);
            persons.add(person);
        }
        return persons;
    }

    private static Person convertRowToPerson(Row row) {
        String lastName = row.getCell(0).getStringCellValue();
        String firstName = row.getCell(1).getStringCellValue();
        String patronymic = row.getCell(2).getStringCellValue();
        String birthDateAsText = row.getCell(3).getStringCellValue();
        LocalDate birthDate = LocalDate.parse(birthDateAsText, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        String series = row.getCell(4).getStringCellValue();
        String number = row.getCell(5).getStringCellValue();
        return new Person(lastName, firstName, patronymic, birthDate, series, number);
    }

}
