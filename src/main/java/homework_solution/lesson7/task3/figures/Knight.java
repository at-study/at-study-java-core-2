package homework_solution.lesson7.task3.figures;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import homework_solution.lesson7.task3.chess.Chess;
import homework_solution.lesson7.task3.chess.Player;
import homework_solution.lesson7.task3.chess.Position;

public class Knight extends ChessFigure {

    public Knight(Player player, String position) {
        super(player, position);
        figureType = "Конь";
    }

    @Override
    public Set<Position> getAvailableMoves() {
        Set<Position> availableMoves = new HashSet<>();
        Iterator<Position> iterator = Chess.allField().iterator();
        while (iterator.hasNext()) {
            Position candidate = iterator.next();
            // Конь ходит буквой Г (2 клетки по одному направлению, 1 клетка по другому
            int dx = Math.abs(candidate.getHorizontal() - position.getHorizontal());
            int dy = Math.abs(candidate.getVertical() - position.getVertical());
            if ((dx == 2 && dy == 1) || (dx == 1 && dy == 2))
                availableMoves.add(candidate);
        }
        return availableMoves;
    }
}
