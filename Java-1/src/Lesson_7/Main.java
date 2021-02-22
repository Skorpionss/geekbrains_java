package Lesson_7;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Вася", 5);
        Plate plate = new Plate(4);
        plate.info();
        System.out.println(cat.getHunger());
        cat.eat(plate);
        plate.info();
        System.out.println(cat.getHunger());
    }
}
