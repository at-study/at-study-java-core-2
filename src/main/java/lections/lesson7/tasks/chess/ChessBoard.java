package lections.lesson7.tasks.chess;

import java.util.HashSet;
import java.util.Set;

public class ChessBoard {

    public static final Set<Field> BOARD = new HashSet<>();

    static {
        for (int i = 1; i <= 8; i++) {
            for (char j = 'A'; j <= 'H'; j++) {
                BOARD.add(new Field(i, j));
            }
        }
    }

}
