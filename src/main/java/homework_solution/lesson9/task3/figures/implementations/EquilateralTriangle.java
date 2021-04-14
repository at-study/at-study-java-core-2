package homework_solution.lesson9.task3.figures.implementations;

import homework_solution.lesson9.task3.figures.OneParameterFigure;

public class EquilateralTriangle extends OneParameterFigure {

    @Override
    public double getArea() {
        return Math.sqrt(3) * parameter1 * parameter1 / 4;
    }

    @Override
    public double getLength() {
        return 3 * parameter1;
    }
}
