package Lesson_7;

public class Cat {
    private String name;
    private int apperite;
    private boolean hunger;

    public Cat(String name, int apperite) {
        this.name = name;
        this.apperite = apperite;
        this.hunger = false;
    }

    public boolean getHunger() {
        return hunger;
    }

    public String getName() {
        return name;
    }

    public void setHunger(boolean hunger) {
        this.hunger = hunger;
    }

    public void eat(Plate p) {

        if (p.decreaseFood(apperite) == true) {
            this.hunger = true;
        }
    }
}
