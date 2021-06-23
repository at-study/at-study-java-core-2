package lections.lesson8.figures;

public class Geometry {

    public static int getArea(Shape shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return (int) (Math.PI * circle.radius * circle.radius);
        }
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.height * rectangle.width;
        }
        if (shape instanceof Square) {
            Square square = (Square) shape;
            return square.dimension * square.dimension;
        }
        throw new IllegalArgumentException("Not a shape");
    }

    public static int getArea2(Shape shape) {
        return shape.getArea();
    }

}
