package lections.lesson8.figures;

public class Square extends Shape {

    public int dimension;

    @Override
    int getArea() {
        return dimension * dimension;
    }
}
