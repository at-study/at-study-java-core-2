package homework_solution.lesson9.task3.figures.implementations;

import homework_solution.lesson9.task3.figures.OneParameterFigure;

public class Circle extends OneParameterFigure {

    @Override
    public double getArea() {
        return Math.PI * parameter1 * parameter1;
    }

    @Override
    public double getLength() {
        return 2d * Math.PI * parameter1;
    }
}
