package homework_solution.lesson9.task3.figures;

import java.util.Random;

public abstract class OneParameterFigure extends Figure {

    public OneParameterFigure() {
        parameter1 = new Random().nextInt(10) + 1;
    }
}
