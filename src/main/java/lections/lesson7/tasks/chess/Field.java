package lections.lesson7.tasks.chess;

public class Field {
    int x;
    char y;

    public Field(int x, char y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public char getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Field field = (Field) o;

        if (x != field.x) {
            return false;
        }
        return y == field.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + (int) y;
        return result;
    }

    @Override
    public String toString() {
        return String.valueOf(y) + x;
    }
}
