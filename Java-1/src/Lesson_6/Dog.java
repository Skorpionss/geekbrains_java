package Lesson_6;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int l) {
        System.out.printf("Собака %s пробежала %s м.%n", getName(), l);

    }

    @Override
    public void swim(int l) {
        System.out.printf("Собака %s проплыла %s м.%n", getName(), l);

    }
}
