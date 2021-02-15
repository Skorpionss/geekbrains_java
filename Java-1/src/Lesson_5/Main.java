package Lesson_5;

public class Main {

    public static void main(String[] args) {

        masSotrudnik();

    }

    static void masSotrudnik() {
        Sotrudnik[] sotrudnik = {
                new Sotrudnik("Николаев", "Александр", "Владимирович",
                        "гл. Инжинер", "vlad_dd@mail.ru", 5505050, 40000, 35),
                new Sotrudnik("Андреев", "Владимир", "Олегович",
                        "энергетик", "andreii@mail.ru", 6008080, 35000, 30),
                new Sotrudnik("Алексеев", "Максим", "Николаевич",
                        "гл. программист", "maxaleks@mail.ru", 7007777, 500000, 42),
                new Sotrudnik("Иванов", "Андрей", "Владимирович",
                        "слесарь", "ivanow41@mail.ru", 8909090, 37000, 41),
                new Sotrudnik("Игнатенко", "Алексей", "Максимович",
                        "сантехник", "waleks33@mail.ru", 2001111, 30000, 38)
        };


        for (int i = 0; i < sotrudnik.length; i++) {
            if (sotrudnik[i].getAge() > 40) {
                System.out.println(sotrudnik[i]);
            }
        }

    }


}
