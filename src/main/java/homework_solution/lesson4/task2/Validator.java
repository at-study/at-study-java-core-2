package homework_solution.lesson4.task2;

public class Validator {
    private static final String STRING_FORMAT_REGEX = "^(\\S+) (\\S+) (\\S+)$";


    public static boolean validateInputStringFormat(String input) {
        boolean isInputValid = input.matches(STRING_FORMAT_REGEX);
        String output = isInputValid
                ? "Введенная строка соответствует формату"
                : "Введенная строка не соответствует формату";
        System.out.println(output);
        return isInputValid;
    }

    public static String[] split(String string) {
        System.out.println("Строка разделена на части");
        return string.split(" ");
    }

    public static boolean validateHuman(Human human) {
        boolean isHumanValid = human.getLastName() != null && human.getFirstName() != null && human.getBirthDate() != null;
        String output = isHumanValid
                ? "Объект типа Human валиден"
                : "Объект типа Human не валиден";
        System.out.println(output);
        return isHumanValid;
    }

    public static boolean validateHumanArray(Human[] array) {
        boolean isArrayFull = true;
        for (Human human : array) {
            if (human == null) {
                isArrayFull = false;
                break;
            }
        }
        String output = isArrayFull
                ? "Массив полностью заполнен"
                : "Массив доступен для заполнения";
        System.out.println(output);
        return isArrayFull;
    }

}
