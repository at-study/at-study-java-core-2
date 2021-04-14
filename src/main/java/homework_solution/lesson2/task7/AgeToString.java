package homework_solution.lesson2.task7;

public class AgeToString {
    public static void main(String[] args) {
        AgeToString instance = new AgeToString();
        System.out.println(instance.getAgeDescription(32));
        System.out.println(instance.getAgeDescription(52));
        System.out.println(instance.getAgeDescription(66));
        System.out.println(instance.getAgeDescription(82));
        System.out.println(instance.getAgeDescription(25));
        System.out.println(instance.getAgeDescription(44));
        System.out.println(instance.getAgeDescription(60));
        System.out.println(instance.getAgeDescription(75));
        System.out.println(instance.getAgeDescription(22));
        System.out.println(instance.getAgeDescription(119));
    }

    String getAgeDescription(int age) {
        String prefix = "";
        if (age >= 25 && age < 44)
            prefix = "молодой";
        else if (age >= 44 && age < 60)
            prefix = "средний";
        else if (age >= 60 && age < 75)
            prefix = "пожилой";
        else if (age >= 75 && age < 90)
            prefix = "старческий";
        else prefix = "неизвестный";
        return prefix + " возраст";
    }
}
