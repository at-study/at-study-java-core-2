package lections.lesson16.humans;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Application {

    public static void main(String[] args)
            throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
        Human human = new Human("Сергей", 25);

        Class clazz = Human.class;
       // Name[] fields = clazz.getDeclaredFields();

        Field firstNameField = clazz.getDeclaredField("firstName");
        firstNameField.setAccessible(true);
        String firstName = (String) firstNameField.get(human);

        Field ageField = clazz.getDeclaredField("age");
        ageField.setAccessible(true);
        int age = (int) ageField.get(human);

        System.out.println(firstName);
        System.out.println(age);

        ageField.set(human, 35);

        Method greetMethod = clazz.getDeclaredMethod("greet");
        greetMethod.setAccessible(true);
        greetMethod.invoke(human);

        Method greetMethod2 = clazz.getDeclaredMethod("greet", String.class, Integer.TYPE);
        greetMethod2.setAccessible(true);
        greetMethod2.invoke(human, "Передаваемая строка", 15);

        Method getFirstNameMethod = clazz.getDeclaredMethod("getFirstName");
        getFirstNameMethod.setAccessible(true);
        String fName = (String) getFirstNameMethod.invoke(human);

        Constructor<Human> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        Human reflectedHuman = constructor.newInstance();

        Method m = reflectedHuman.getClass().getDeclaredMethod("greet");
        m.setAccessible(true);
        m.invoke(reflectedHuman);

    }

}
