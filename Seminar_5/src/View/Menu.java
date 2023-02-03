package View;

import java.util.Scanner;

/**
 * Класс, создающий меню и принимающий выбор пользователя
 */
public class Menu {
    private final Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Метод выбора действия, возвращет выбор пользователя
     */
    public String selectFunction() {
        System.out.print("""
                --------------------------------------
                Выберите действие:
                --------------------------------------
                1. сложение
                2. вычитание
                3. деление
                4. умножение
                --------------------------------------
                0. Выход
                """);
        return scanner.nextLine();
    }

}
