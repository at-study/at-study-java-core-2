package lections.lesson7.tasks.figures;

import java.util.HashSet;
import java.util.Set;

import lections.lesson7.tasks.chess.ChessBoard;
import lections.lesson7.tasks.chess.Field;

import static java.lang.Math.abs;

public class Horse extends Figure {

    public Horse(Field position, Color color) {
        this.position = position;
        this.color = color;
    }

    @Override
    public Set<Field> getAvailableMoves() {
        Set<Field> result = new HashSet<>();
        for (Field chessBoardField : ChessBoard.BOARD) {
            int fieldX = chessBoardField.getX();
            int fieldY = chessBoardField.getY();
            int x = this.position.getX();
            int y = this.position.getY();
            int dx = fieldX - x;
            int dy = fieldY - y;
            if ((abs(dx) == 2 && abs(dy) == 1) || (abs(dx) == 1 && abs(dy) == 2)) {
                result.add(chessBoardField);
            }
        }
        return result;
    }
}
