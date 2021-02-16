package Lesson_6;

public class Main {

    public static void main(String[] args) {

/** Проверка кода начало*/

        Animal[] animals = {
                new Dog("Бобик"),
                new Cat("Маруся")
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(100);
            animals[i].swim(10);
        }

/** Проверка кода конец*/

    }

}
