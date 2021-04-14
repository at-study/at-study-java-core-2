package homework_solution.lesson3.task3;

public class Application {

    public static void main(String[] args) {
        // Бабушки и дедушки
        Human valeriy = new Human("Валерий", 50, null, null);
        Human alexandra = new Human("Александра", 48, null, null);
        Human ivan = new Human("Иван", 53, null, null);
        // Родители
        Human sergey = new Human("Сергей", 28, valeriy, alexandra);
        Human marina = new Human("Марина", 26, ivan, null);
        // Дети
        Human vitaliy = new Human("Виталий", 7, sergey, marina);
        Human elena = new Human("Елена", 5, sergey, marina);

        Human[] grands = new Human[4];
        int index = 0;

        /* Изменение на лекции
        for (Human parent : elena.parents) {
            for (Human grand : parent.parents)
                grands[index++] = grand;
        }
        */

        for (int i = 0; i < elena.parents.length; i++) {
            Human[] parentParents = elena.parents[i].parents;
            for (int j = 0; j < parentParents.length; j++) {
                grands[index++] = parentParents[j];
            }
        }

        for (Human grand : grands) {
            if (grand != null) System.out.printf("%s (%d лет)%n", grand.name, grand.age);
        }

    }

}
