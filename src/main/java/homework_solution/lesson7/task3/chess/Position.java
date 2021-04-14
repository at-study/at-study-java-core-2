package homework_solution.lesson7.task3.chess;

public class Position {
    private char horizontal;
    private int vertical;

    public Position(String position) {
        this.horizontal = position.split("")[0].toCharArray()[0];
        this.vertical = Integer.parseInt(position.split("")[1]);
    }

    public int getHorizontal() {
        return horizontal;
    }

    public int getVertical() {
        return vertical;
    }

    public String getPosition() {
        String letterHorizontal = String.valueOf(horizontal);
        return letterHorizontal + vertical;
    }
}
