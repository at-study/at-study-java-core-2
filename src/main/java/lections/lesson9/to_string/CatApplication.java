package lections.lesson9.to_string;

public class CatApplication {

    public static void main(String[] args) throws CloneNotSupportedException {
        Cat source = new Cat("Мурзик", 3, 2);
        Cat cloned = (Cat) source.clone();
    }
}
