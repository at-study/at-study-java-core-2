package lections.lesson13.processor;

public interface Processor<K1, K2, V> {

    V process(K1 object1, K2 object2);

}
