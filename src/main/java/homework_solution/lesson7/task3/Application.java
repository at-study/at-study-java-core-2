package homework_solution.lesson7.task3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import homework_solution.lesson7.task3.chess.Player;
import homework_solution.lesson7.task3.chess.Position;
import homework_solution.lesson7.task3.figures.Bishop;
import homework_solution.lesson7.task3.figures.ChessFigure;
import homework_solution.lesson7.task3.figures.King;
import homework_solution.lesson7.task3.figures.Knight;
import homework_solution.lesson7.task3.figures.Pawn;
import homework_solution.lesson7.task3.figures.Queen;
import homework_solution.lesson7.task3.figures.Rook;

public class Application {

    public static void main(String[] args) {
        List<ChessFigure> figures = new ArrayList<>();
        figures.add(new King(Player.WHITE, "B3"));
        figures.add(new Queen(Player.WHITE, "A1"));
        figures.add(new Rook(Player.WHITE, "G5"));
        figures.add(new Knight(Player.WHITE, "F5"));
        figures.add(new Bishop(Player.WHITE, "F5"));
        figures.add(new Pawn(Player.BLACK, "F6"));
        figures.add(new Pawn(Player.BLACK, "F3"));
        figures.add(new Pawn(Player.BLACK, "F1"));
        figures.add(new Pawn(Player.WHITE, "F2"));
        figures.add(new Pawn(Player.WHITE, "A4"));
        figures.add(new Pawn(Player.WHITE, "A8"));
        figures.add(new Pawn(Player.WHITE, "A1"));

        for (ChessFigure figure : figures)
            printMoves(figure);

    }

    private static void printMoves(ChessFigure figure) {
        Set<Position> positions = figure.getAvailableMoves();
        StringBuilder sb = new StringBuilder(figure.getFigureType())
                .append(" (").append(figure.getPosition()).append("):");
        Iterator<Position> iterator = positions.iterator();
        while (iterator.hasNext()) {
            Position position = iterator.next();
            sb.append(", ").append(position.getPosition());
        }
        System.out.println(sb.toString().replaceFirst(",", ""));
    }

}
