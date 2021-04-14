package homework_solution.lesson11.task2;

public class Human {
    private String name;
    private int age;

    public void setName(String name) {
        String regex = "^[А-Я][а-я]{2,11}$";
        if (name.matches(regex))
            this.name = name;
        else throw new IllegalArgumentException("Некорректное имя: " + name);
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120)
            this.age = age;
        else throw new IllegalArgumentException("Некорректный возраст: " + age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
