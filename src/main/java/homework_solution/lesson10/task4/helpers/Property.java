package homework_solution.lesson10.task4.helpers;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Property {
    public static final Integer EMPLOYEE_LASTNAME_LENGTH;
    public static final Integer EMPLOYEE_FIRSTNAME_LENGTH;
    public static final String EMPLOYEE_NAME_PATTERN;
    public static final Double EMPLOYEE_SALARY_MIN;
    public static final Double EMPLOYEE_SALARY_MAX;
    public static final Integer PASSPORT_SERIES_DIGITS;
    public static final Integer PASSPORT_NUMBER_DIGITS;
    public static final String SALARY_DATE_FORMAT;
    public static final Integer SALARY_EMPLOYEE_COUNT;
    public static final String SALARY_OUTPUT_FILE;
    public static final String CASH_OUTPUT_FILE;
    public static final Double[] CASH_NOMINALS;

    static {
        Properties props = new Properties();
        try {
            props.load(new FileReader("src\\main\\java\\homework_solution\\lesson10\\task4\\application.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        EMPLOYEE_LASTNAME_LENGTH = Integer.parseInt(props.getProperty("employee.lastname.length"));
        EMPLOYEE_FIRSTNAME_LENGTH = Integer.parseInt(props.getProperty("employee.firstname.length"));
        EMPLOYEE_NAME_PATTERN = props.getProperty("employee.name.pattern");
        EMPLOYEE_SALARY_MIN = Double.parseDouble(props.getProperty("employee.salary.min"));
        EMPLOYEE_SALARY_MAX = Double.parseDouble(props.getProperty("employee.salary.max"));
        PASSPORT_SERIES_DIGITS = Integer.parseInt(props.getProperty("passport.series.digits"));
        PASSPORT_NUMBER_DIGITS = Integer.parseInt(props.getProperty("passport.number.digits"));
        SALARY_DATE_FORMAT = props.getProperty("salary.date.format");
        SALARY_EMPLOYEE_COUNT = Integer.parseInt(props.getProperty("salary.employee.count"));
        SALARY_OUTPUT_FILE = props.getProperty("salary.output.file");
        CASH_OUTPUT_FILE = props.getProperty("cash.output.file");
        String[] nominals = props.getProperty("cash.nominals").split(",");
        Double[] doubles = new Double[nominals.length];
        for (int i = 0; i < nominals.length; i++) {
            doubles[i] = Double.parseDouble(nominals[i]);
        }
        CASH_NOMINALS = doubles;
    }

}
