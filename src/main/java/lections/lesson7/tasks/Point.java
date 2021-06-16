package lections.lesson7.tasks;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (this.getClass() != Point.class || other.getClass() != Point.class) {
            return false;
        }
        Point o = (Point) other;
        return x == o.x && y == o.y;
    }
}
