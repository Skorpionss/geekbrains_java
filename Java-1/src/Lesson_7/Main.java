package Lesson_7;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Вася", 5);
        Plate plate = new Plate(10);
        plate.info();
        cat.eat(plate);
        plate.info();
        cat.eat(plate);
        plate.info();
        cat.eat(plate);
        plate.info();
    }
}
