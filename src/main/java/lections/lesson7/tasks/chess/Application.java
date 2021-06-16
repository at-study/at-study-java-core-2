package lections.lesson7.tasks.chess;

import lections.lesson7.tasks.figures.Figure;
import lections.lesson7.tasks.figures.Horse;
import lections.lesson7.tasks.figures.Pawn;

public class Application {

    public static void main(String[] args) {
        //System.out.println(ChessBoard.BOARD);
        Figure horse = new Horse(new Field(8, 'H'), Figure.Color.BLACK);
        System.out.println(horse.getAvailableMoves());

        Figure pawn = new Pawn(new Field(8, 'E'), Figure.Color.WHITE);
        System.out.println(pawn.getAvailableMoves());
    }

}
