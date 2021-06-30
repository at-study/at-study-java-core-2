package lections.lesson9.tasks.xml_task;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lections.lesson9.collections_tasks.Task2;

public class Cat implements Xml, Task2.CanBeJson {

    private String name;
    private int age;

    public Cat(String xml) {
        fromXml(xml);
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toXml() {
        return String.format("<Cat><Name>%s</Name><Age>%d</Age></Cat>", name, age);
    }

    @Override
    public void fromXml(String xml) {
        Pattern namePattern = Pattern.compile("^<Cat>.*<Name>(.*)</Name>.*</Cat>$");
        Matcher nameMatcher = namePattern.matcher(xml);
        nameMatcher.find();
        String name = nameMatcher.group(1);
        this.name = name;

        Pattern agePattern = Pattern.compile("^<Cat>.*<Age>(\\d+)</Age>.*</Cat>$");
        Matcher ageMatcher = agePattern.matcher(xml);
        ageMatcher.find();
        int age = Integer.parseInt(ageMatcher.group(1));
        this.age = age;
    }

    @Override
    public String toJson() {
        return String.format("{\"name\":\"%s\",\"age\":%d}", name, age);
    }

    @Override
    public String toString() {
        return "name: " + name + ", age: " + age;
    }
}
