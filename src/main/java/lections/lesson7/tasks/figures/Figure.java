package lections.lesson7.tasks.figures;

import java.util.Set;

import lections.lesson7.tasks.chess.Field;

public abstract class Figure {

    protected Field position;
    protected Color color;

    public abstract Set<Field> getAvailableMoves();

    public enum Color {
        BLACK,
        WHITE
    }
}
