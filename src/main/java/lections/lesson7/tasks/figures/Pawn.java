package lections.lesson7.tasks.figures;

import java.util.HashSet;
import java.util.Set;

import lections.lesson7.tasks.chess.ChessBoard;
import lections.lesson7.tasks.chess.Field;

public class Pawn extends Figure {

    public Pawn(Field position, Color color) {
        this.position = position;
        this.color = color;
    }

    @Override
    public Set<Field> getAvailableMoves() {
        Set<Field> result = new HashSet<>();
        for (Field chessBoardField : ChessBoard.BOARD) {
            if (color == Color.WHITE) {
                int fieldX = chessBoardField.getX();
                int fieldY = chessBoardField.getY();
                int x = this.position.getX();
                int y = this.position.getY();
                int dx = fieldX - x;
                int dy = fieldY - y;
                if ((x == 2 && dx == 2 && dy == 0) || (dx == 1 && dy == 0)) {
                    result.add(chessBoardField);
                }
            } else {

            }
        }
        return result;
    }
}
