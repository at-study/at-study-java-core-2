package homework_solution.lesson7.task3.figures;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import homework_solution.lesson7.task3.chess.Chess;
import homework_solution.lesson7.task3.chess.Player;
import homework_solution.lesson7.task3.chess.Position;

public class Queen extends ChessFigure {

    public Queen(Player player, String position) {
        super(player, position);
        figureType = "Ферзь";
    }

    @Override
    public Set<Position> getAvailableMoves() {
        Set<Position> availableMoves = new HashSet<>();
        Iterator<Position> iterator = Chess.allField().iterator();
        while (iterator.hasNext()) {
            Position candidate = iterator.next();
            // Ферзь может ходить прямой и по диагонали
            int dx = Math.abs(candidate.getHorizontal() - position.getHorizontal());
            int dy = Math.abs(candidate.getVertical() - position.getVertical());
            if (dx == 0 && dy == 0) continue;
            if (dx == 0 || dy == 0 || dx == dy)
                availableMoves.add(candidate);
        }
        return availableMoves;
    }
}
