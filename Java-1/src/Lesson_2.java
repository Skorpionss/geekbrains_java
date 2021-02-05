public class Lesson_2 {
    public static void main(String[] args) {

        int[] m = {1, 2, 3, 4, 5, 6};
        int a = 2;
        doTask7(m, a);
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

    /**
     * 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
     */

    static void doTask5() {
        int[] mass = {3, 4, 1, 0, 13, 11, 6, 54, 3, 6, 23};
        System.out.print("Заданный массив m = ");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        int max = mass[0];
        int min = mass[0];
        for (int i = 1; i < mass.length; i++) {
            if (max < mass[i]) max = mass[i];
            if (min > mass[i]) min = mass[i];
        }
        System.out.println("Максимальный элемент = " + max);
        System.out.println("Минимальный элемент = " + min);
    }

    /**
     * 7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
     * при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
     * Для усложнения задачи нельзя пользоваться вспомогательными массивами.
     * Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
     * При каком n в какую сторону сдвиг можете выбирать сами.
     */

    static void doTask7(int[] mass, int n) {
        System.out.print("Заданный массив m = ");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }

        if (n < 0) {
            for (int s = n; s < 0; s++) {
                for (int i = 0; i < mass.length - 1; i++) {
                    int a1 = mass[i + 1];
                    mass[i + 1] = mass[i];
                    mass[i] = a1;
                }
            }
        } else {
            for (int s = n; s > 0; s--) {
                for (int i = 0; i < mass.length; i++) {
                    int a1 = mass[mass.length - 1];
                    mass[mass.length - 1] = mass[i];
                    mass[i] = a1;

                }
            }
        }
        System.out.println();
        System.out.print("Результат массив m = ");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }

    }

}
