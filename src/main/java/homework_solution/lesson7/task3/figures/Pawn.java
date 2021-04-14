package homework_solution.lesson7.task3.figures;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import homework_solution.lesson7.task3.chess.Chess;
import homework_solution.lesson7.task3.chess.Player;
import homework_solution.lesson7.task3.chess.Position;

public class Pawn extends ChessFigure {

    public Pawn(Player player, String position) {
        super(player, position);
        figureType = "Пешка";
    }

    @Override
    public Set<Position> getAvailableMoves() {
        Set<Position> availableMoves = new HashSet<>();
        Iterator<Position> iterator = Chess.allField().iterator();
        while (iterator.hasNext()) {
            Position candidate = iterator.next();
            // Если игрок белый, то пешка ходит на dy == 1, если стоит на позиции 2, то и на dy == 2
            // Если игрок черный, то пешка ходит на dy == -1, если стоит на позиции 7, то и на dy == -2
            int dx = Math.abs(candidate.getHorizontal() - position.getHorizontal());
            int dy = candidate.getVertical() - position.getVertical();
            if (player == Player.WHITE) {
                boolean condition = position.getVertical() == 2
                        ? (dy == 2 || dy == 1) && dx == 0
                        : dy == 1 && dx == 0;
                if (condition)
                    availableMoves.add(candidate);
            }
            if (player == Player.BLACK) {
                boolean condition = position.getVertical() == 7
                        ? (dy == -2 || dy == -1) && dx == 0
                        : dy == -1 && dx ==0;
                if (condition)
                    availableMoves.add(candidate);
            }
        }
        return availableMoves;
    }
}
