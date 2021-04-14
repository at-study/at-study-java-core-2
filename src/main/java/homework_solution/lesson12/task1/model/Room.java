package homework_solution.lesson12.task1.model;

public class Room implements Generatable {
    private int width;
    private int height;

    public Room() {
    }

    public Room(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public Room generate() {
        width = 5;
        height = 3;
        return this;
    }
}
