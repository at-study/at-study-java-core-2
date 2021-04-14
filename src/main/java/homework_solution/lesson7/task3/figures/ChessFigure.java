package homework_solution.lesson7.task3.figures;

import java.util.Set;

import homework_solution.lesson7.task3.chess.Player;
import homework_solution.lesson7.task3.chess.Position;

public class ChessFigure {
    protected String figureType = "Шахматная фигура";
    protected Player player;
    protected Position position;

    public String getFigureType() {
        return figureType;
    }

    public ChessFigure(Player player, String position) {
        this.player = player;
        this.position = new Position(position);
    }

    public Set<Position> getAvailableMoves() {
        throw new IllegalStateException("Для данного типа определить возможные ходы невозможно");
    }

    public String getPosition() {
        return position.getPosition();
    }
}
