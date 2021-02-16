package Lesson_6;

public class Cat extends Animal {
    private static int idCat = 0;

    public Cat(String name) {
        super(name);
        idCat++;
    }

    public static int getIdCat() {
        return idCat;
    }

    @Override
    public void run(int l) {
        if (l > 0 && l < 200) {
            System.out.printf("Кошка %s пробежала %s м.%n", getName(), l);
        } else System.out.println("Данное действие недоступно");

    }

    @Override
    public void swim(int l) {
        System.out.printf("Кошка %s не умеет плавать", getName());

    }
}
