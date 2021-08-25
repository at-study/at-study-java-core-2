package lections.lesson16.cats;

import java.lang.reflect.Field;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LionApplication {

    public static void main(String[] args) throws Exception {
        Lion lion = new Lion(70);

        Class<Lion> lionClass = Lion.class;

        Field speedField = lionClass.getDeclaredField("speed");
        int speed = (int) getFieldValue(speedField, lion);

        Field nameField = lionClass.getSuperclass().getDeclaredField("name");
        String name = (String) getFieldValue(nameField, lion);

        Field ageField = lionClass.getSuperclass().getDeclaredField("age");
        int age = (int) getFieldValue(ageField, lion);

        Field weightField = lionClass.getSuperclass().getDeclaredField("weight");
        int weight = (int) getFieldValue(weightField, lion);

        Set<Field> lionFields = getAllFields(Lion.class);
        Set<Field> strongLionFields = getAllFields(StrongLion.class);
    }

    private static Object getFieldValue(Field field, Object object) throws Exception {
        field.setAccessible(true);
        return field.get(object);
    }

    private static Set<Field> getAllFields(Class<?> clazz) {
        Set<Field> currentClassFields = Stream.of(clazz.getDeclaredFields()).collect(Collectors.toSet());
        while (clazz.getSuperclass() != Object.class) {
            Class superClass = clazz.getSuperclass();
            currentClassFields.addAll(getAllFields(superClass));
            clazz = superClass;
        }
        return currentClassFields;
    }
}
