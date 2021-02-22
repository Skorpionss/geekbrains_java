package Lesson_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (food - n < 0) {
            System.out.println("Кот не может поесть, еды недостаточно");
        } else food -= n;

    }

    public void info() {
        System.out.println("Тарелка: " + food);
    }
}
