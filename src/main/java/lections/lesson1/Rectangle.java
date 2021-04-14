package lections.lesson1;

public class Rectangle {

    int height;
    int width;

    int getPerimeter() {
        return 2 * (height + width);
    }

    int getSquare() {
        return height * width;
    }

    boolean isSquare() {
        return height == width;
    }

}
