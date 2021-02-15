package Lesson_5;

public class Sotrudnik {
    private String family;
    private String name;
    private String otchestvo;
    private String profi;
    private String email;
    private int number;
    private int zarplatra;
    private int age;

    public Sotrudnik(String family, String name, String otchestvo, String profi,
                     String email, int number, int zarplatra, int age) {
        this.family = family;
        this.name = name;
        this.otchestvo = otchestvo;
        this.profi = profi;
        this.email = email;
        this.number = number;
        this.zarplatra = zarplatra;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Сотрудник{" +
                "ФИО ='" + family + " " + name + " " + otchestvo + '\'' +
                ", должность = '" + profi + '\'' +
                ", email = '" + email + '\'' +
                ", номер телефона = " + number +
                ", зарплата = " + zarplatra +
                ", возраст = " + age +
                '}';
    }

}
