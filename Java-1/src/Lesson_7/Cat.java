package Lesson_7;

public class Cat {
    private String name;
    private int apperite;

    public Cat(String name, int apperite) {
        this.name = name;
        this.apperite = apperite;
    }



    public void eat(Plate p) {

        p.decreaseFood(apperite);

    }
}
