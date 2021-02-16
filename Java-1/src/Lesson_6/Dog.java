package Lesson_6;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int l) {
        if (l > 0 && l < 500) {
            System.out.printf("Собака %s пробежала %s м.%n", getName(), l);
        } else System.out.println("Данное действие недоступно");
    }

    @Override

    public void swim(int l) {
        if (l > 0 && l < 10) {
            System.out.printf("Собака %s проплыла %s м.%n", getName(), l);
        } else System.out.println("Данное действие недоступно");
    }
}
