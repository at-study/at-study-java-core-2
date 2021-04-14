package homework_solution.lesson9.task3.figures.implementations;

import homework_solution.lesson9.task3.figures.TwoParameterFigure;

public class Ellipse extends TwoParameterFigure {

    @Override
    public double getArea() {
        return Math.PI * parameter1 * parameter2;
    }

    @Override
    public double getLength() {
        int a = Math.max(parameter1, parameter2);
        int b = Math.min(parameter1, parameter2);
        return 4d * (Math.PI * a * b + a - b) / (a + b);
    }
}
