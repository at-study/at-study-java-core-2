package homework_solution.lesson9.task3.figures.implementations;

import homework_solution.lesson9.task3.figures.TwoParameterFigure;

public class RightTriangle extends TwoParameterFigure {

    @Override
    public double getArea() {
        return parameter1 * parameter2 / 2;
    }

    @Override
    public double getLength() {
        return parameter1 + parameter2 + getHypotenuse();
    }

    public double getHypotenuse() {
        return Math.sqrt(parameter1 * parameter1 + parameter2 * parameter2);
    }
}
