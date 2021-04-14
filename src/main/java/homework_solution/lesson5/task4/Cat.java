package homework_solution.lesson5.task4;

public class Cat {

    private String name;
    private int age;

    public Cat(String name, int age) throws AgeTooHighException {
        try {
            if (age < 0)
                throw new AgeUnderZeroException();
            if (age > 25)
                throw new AgeTooHighException();
            this.name = name;
            this.age = age;
        } catch (AgeUnderZeroException exception) {
            StackTraceElement element = exception.getStackTrace()[0];
            System.out.println(element);
        }
    }

    public String getName() {
        if (name == null) throw new NullPointerException();
        return name;
    }

    public int getAge() {
        return age;
    }

}
