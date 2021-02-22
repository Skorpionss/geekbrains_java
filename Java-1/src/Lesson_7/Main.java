package Lesson_7;

public class Main {
    public static void main(String[] args) {
        Cat[] cat = {
                new Cat("Вася", 5),
                new Cat("Маруся", 10),
                new Cat("Мурзик", 5),
                new Cat("Кисуля", 10),
                new Cat("Крутой", 5),

        };

        Plate plate = new Plate(20);
        plate.info();

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
            System.out.printf("%s %s%n", cat[i].getName(), cat[i].getHunger());
        }

    }
}
