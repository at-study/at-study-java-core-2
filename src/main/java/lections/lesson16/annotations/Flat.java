package lections.lesson16.annotations;

public class Flat {

    @Dimension(value = "Длина")
    private int width;

    @Dimension(value = "Ширина")
    private int height;

    @Dimension(value = "Высота")
    private int h = 3;

    public Flat(int width, int height) {
        this.width = width;
        this.height = height;
    }

}
