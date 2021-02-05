public class Lesson_2 {
    public static void main(String[] args) {

        doTask1();
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

}
