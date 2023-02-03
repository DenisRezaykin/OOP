package View;

import java.util.Scanner;

/**
 * Класс работы с консольным вводом-выводом
 */

public class View {
    Scanner in = new Scanner(System.in);

    /**
     * Метод возвращет число, введенное пользователем
     */
    public int getValue() {
        System.out.println("Введите целое число: ");
        int num;
        if (in.hasNextInt()) {
            num = in.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз: ");
            in.next();//рекурсия
            num = getValue();
        }
        return num;
    }

    /**
     * Метод возвращет делитель, не дает ввести 0
     */
    public int getValueDiv() {
        System.out.println("Введите целое число, не равное нулю: ");
        int num;
        if (in.hasNextInt()) {
            num = in.nextInt();
            if (num == 0) {
                System.out.println("На ноль делить нельзя. Попробуйте еще раз.");
                num = getValue();
            }
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз: ");
            in.next();//рекурсия
            num = getValue();
        }
        return num;
    }

    /**
     * Метод выводит результат на экран
     */
    public void print(int data, String title) {
        System.out.printf("%s %d\n", title, data);
    }
}
