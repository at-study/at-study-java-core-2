package lections.lesson9.tasks.sb;

public class StringOperationsApplication {

    public static void main(String[] args) {
        // StringBuilder и StringBuffer
        StringBuilder sb = new StringBuilder();
        sb.append("{")
                .append("\"lastName\": \"").append("Иванов").append("\", ")
                .append("\"firstName\": \"").append("Петр").append("\", ")
                .append("\"patronymic\": \"").append("Михайлович").append("\"")
                .append("}");
        String result = sb.reverse().toString();
        sb.trimToSize();
        System.out.println(result);


    }
}
