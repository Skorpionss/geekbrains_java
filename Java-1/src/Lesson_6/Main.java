package Lesson_6;

public class Main {

    public static void main(String[] args) {

/** Проверка кода начало*/

        Animal[] animals = {
                new Dog("Бобик"),
                new Cat("Маруся")
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(300);
            animals[i].swim(5);
        }

        System.out.printf("%n Всего созданно животных %s", Animal.getIdAnimal());
        System.out.printf("%n Всего созданно Собак %s", Dog.getIdDog());
        System.out.printf("%n Всего созданно Кошек %s", Cat.getIdCat());

/** Проверка кода конец*/

    }

}
