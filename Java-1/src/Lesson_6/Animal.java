package Lesson_6;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void run(int l);

    public abstract void swim(int l);

}
