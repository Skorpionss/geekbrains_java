package Lesson_4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        playGames();
    }


    static void playGames() {

        char[][] field = newPole();

        printPole(field);

        while (true) {
            if (!checkNexPlayMove(field)) {
                return;
            }
            if (!checkNexAIMove(field)) {
                return;
            }

        }
    }

    static boolean checkNexAIMove(char[][] field) {
        doAIMove(field);
        return isNextMoveAvailabe(field, '0', "Компьютер победил");
    }

    static boolean checkNexPlayMove(char[][] field) {
        doPlayerMov(field);
        return isNextMoveAvailabe(field, 'X', "Я победил");
    }

    static boolean isNextMoveAvailabe(char[][] field, char sign, String winMessage) {
        printPole(field);
        if (isDraw(field)) {
            System.out.println("Нечья");
            return false;
        }
        if (isWin(field, sign)) {
            System.out.println(winMessage);
            return false;
        }
        return true;
    }

    /**
     * Проверяем на выигрышь
     */
    static boolean isWin(char[][] field, char sing) {

        for (int i = 0; i < field.length; i++) {
            int j = 0;
            if ((field[i][j] == sing && field[i][j + 1] == sing && field[i][j + 2] == sing) || (
                    (field[j][i] == sing && field[j + 1][i] == sing && field[j + 2][i] == sing))
            ) {
                return true;
            }
        }

        if (field[0][0] == sing && field[1][1] == sing && field[2][2] == sing) {
            return true;
        }

        if (field[0][2] == sing && field[1][1] == sing && field[2][0] == sing) {
            return true;
        }

        return false;

    }


    /**
     * Проверяем поля на ничью
     */
    static boolean isDraw(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Былло ли использованна данная координата ранее
     */
    static boolean isCellFree(char[][] field, int x, int y) {
        return field[x][y] != '-';
    }

    /**
     * Заполняем поля введеными значениями для компьютера
     */
    static char[][] doAIMove(char[][] field) {
        Random random = new Random();
        int x, y;
        do {
            x = random.nextInt(field.length);
            y = random.nextInt(field.length);
        } while (isCellFree(field, x, y));
        field[x][y] = '0';
        return field;
    }

    /**
     * Заполняем поля введеными значениями для пользователя
     */
    static char[][] doPlayerMov(char[][] field) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        do {
            x = checkScanner(scanner, 'X');
            y = checkScanner(scanner, 'Y');
        } while (isCellFree(field, x, y));

        field[x][y] = 'X';
        return field;
    }

    /**
     * Проверяем введёные данные пользователем чтобы были в диапазоне от 1 до 3
     */
    static int checkScanner(Scanner scanner, char coordName) {
        int val;
        do {
            System.out.printf("Введите координаты %s в диапазоне [1..3]... %n", coordName);
            val = scanner.nextInt() - 1;

        } while (val < 0 || val > 2);
        return val;
    }

    /**
     * Создание чистого поля
     */
    static char[][] newPole() {
        char[][] field = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };
        return field;
    }

    /**
     * печатаем в терминале поле
     */
    static void printPole(char[][] field) {

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

    }


}
