package Lesson_6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(int l) {
        System.out.printf("Кошка %s пробежала %s м.%n", getName(), l);

    }

    @Override
    public void swim(int l) {
        System.out.printf("Кошка %s проплыла %s м.%n", getName(), l);

    }
}
