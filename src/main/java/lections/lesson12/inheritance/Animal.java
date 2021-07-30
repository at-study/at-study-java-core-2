package lections.lesson12.inheritance;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public abstract class Animal {

    @SerializedName("cat_age")
    private Integer age = 10;

    @JsonProperty("WEIGHT")
    transient private Integer weight = 7;

    public Animal() {
    }

    public Animal(Integer age, Integer weight) {
        this.age = age;
        this.weight = weight;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getWeight() {
        return weight;
    }
}
