package Lesson_6;

public abstract class Animal {
    private String name;
    private static int idAnimal = 0;


    public Animal(String name) {
        this.name = name;
        idAnimal++;
    }

    public String getName() {
        return name;
    }

    public static int getIdAnimal() {
        return idAnimal;
    }

    public abstract void run(int l);

    public abstract void swim(int l);

}
