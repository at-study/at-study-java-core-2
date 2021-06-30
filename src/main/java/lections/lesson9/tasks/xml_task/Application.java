package lections.lesson9.tasks.xml_task;

public class Application {

    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик", 8);
        System.out.println(cat.toXml());

        Cat xmlCat = new Cat("<Cat><Age>14</Age><Name>Леопольд</Name></Cat>");
        System.out.println(xmlCat);
    }
}
