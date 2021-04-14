package homework_solution.lesson2.task3;

public class PhoneNumber {

    public static void main(String[] args) {
        String numberCandidate = "+7(956)632-10-64";
        PhoneNumber instance = new PhoneNumber();

        boolean isNumberCandidate = instance.evaluateByCycles(numberCandidate);
        System.out.println(isNumberCandidate);
    }

    boolean evaluateByRegex(String candidate) {
        return candidate.matches("^\\+7\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$");
    }


    boolean evaluateByCycles(String candidate) {
        if (candidate == null || candidate.length() != 16)
            return false;

        int[] numericIndexes = {3, 4, 5, 7, 8, 9, 11, 12, 14, 15}; // Индексы в строке, которые принимают любые цифровые значения
        String numericPattern = "0123456789";

        // Проверяем обязательные элементы паттерны
        if (!candidate.startsWith("+7("))
            return false;
        if (candidate.charAt(6) != ')')
            return false;
        if (candidate.charAt(10) != '-' || candidate.charAt(13) != '-')
            return false;

        // Проверяем остальные цифры в номере, которые могут принимать любые значения
        for (int index : numericIndexes) {
            String symbol = String.valueOf(candidate.charAt(index));
            if (!numericPattern.contains(symbol))
                return false;
        }
        // Все проверки пройдены успешно, возвращаем true
        return true;
    }

}
