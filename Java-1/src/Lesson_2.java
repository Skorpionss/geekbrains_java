public class Lesson_2 {
    public static void main(String[] args) {

        doTask4();
    }

    /**
     * 1.  Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    static void doTask1() {
        int[] mass = {1, 1, 0, 0, 1, 1, 0, 0};
        System.out.print("Заданный массив m = ");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i]);
        }
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 1) {
                mass[i] = 0;
            } else {
                mass[i] = 1;
            }
        }
        System.out.println();
        System.out.print("Результат m = ");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i]);
        }
    }

    /**
     * 2.  Задать пустой целочисленный массив размером 8.
     * С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
     */
    static void doTask2() {
        int[] mass = new int[8];
        System.out.print("Заданный массив m = ");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i]);
        }
        System.out.println();
        System.out.print("Результат массив m = ");
        for (int i = 0; i < mass.length; i++) {
            mass[i] = i * 3;
            System.out.print(mass[i] + " ");
        }

    }

    /**
     * 3.  Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
     * и числа меньшие 6 умножить на 2;
     */
    static void doTask3() {
        int[] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Заданный массив m = ");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 6) mass[i] = mass[i] * 2;
        }
        System.out.println();
        System.out.print("Результат массив m = ");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
    }

    /**
     * 4.  Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     */
    static void doTask4() {
        int a = 6;
        int[][] mass = new int[a][a];
        System.out.println("Заданный массив m ");
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < mass.length; i++) {
            mass[i][i] = 1;
            mass[i][mass.length - 1 - i] = 1;
        }
        System.out.println("Результат массив m ");
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

    }
}
