package lections.lesson16.annotations;

import java.lang.reflect.Field;
import java.util.Set;
import java.util.stream.Stream;

import org.reflections.Reflections;

import lections.lesson16.annotations.pages.Name;
import lections.lesson16.annotations.pages.Page;
import lections.lesson16.annotations.pages.Title;

public class PageHelper {

    public static void main(String[] args) throws Exception {
        String password = getValue("Страница входа", "Пароль");
        String user2 = getValue("Страница пользователей", "Пользователь 2");
    }

    public static String getValue(String title, String name) throws Exception {
        Page page = getClassByTitle(title);
        Object value = getField(page, name);
        return (String) value;
    }

    private static Page getClassByTitle(String title) throws Exception {
        Set<Class<? extends Page>> classes = new Reflections("lections.lesson16.annotations.pages").getSubTypesOf(Page.class);
        Class<? extends Page> clazz = classes.stream()
                .filter(cl -> cl.isAnnotationPresent(Title.class))
                .filter(cl -> cl.getAnnotation(Title.class).value().equals(title))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Нет классов Page с аннотацией @Title со значением " + title));
        return clazz.getConstructor().newInstance();
    }

    private static Object getField(Page obj, String name) throws Exception {
        Field field = Stream.of(obj.getClass().getDeclaredFields())
                .filter(f -> f.isAnnotationPresent(Name.class))
                .filter(f -> f.getAnnotation(Name.class).value().equals(name))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Нет поля с аннотацией @Name со значением " + name));
        field.setAccessible(true);
        return field.get(obj);
    }

}
