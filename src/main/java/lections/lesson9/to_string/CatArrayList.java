package lections.lesson9.to_string;

import java.util.ArrayList;

public class CatArrayList extends ArrayList<Cat> {

    public String toString() {
        String header = String.format("В списке находится %d котов%n", size());
        String body = "";
        for (Cat cat : this) {
            body += "- " + cat + "\n";
        }
        return header + body;
    }

}
