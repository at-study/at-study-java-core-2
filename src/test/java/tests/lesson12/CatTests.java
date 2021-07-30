package tests.lesson12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import lections.lesson12.inheritance.Animal;
import lections.lesson12.inheritance.Cat;

import static lections.lesson11.json.JsonUtils.deserialize;
import static lections.lesson11.json.JsonUtils.serialize;

public class CatTests {

    @Test
    public void catSerializationTest() {
        Animal cat = new Cat("Барсик", 3, 4);
        Cat newCat = deserialize(serialize(cat), Cat.class);

        Assertions.assertEquals("Барсик", newCat.getName());
        Assertions.assertEquals(3, newCat.getAge());
        Assertions.assertEquals(7, newCat.getWeight());
    }
}
