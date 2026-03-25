package level04;

//Ввести с клавиатуры имя и, используя цикл while, 10 раз вывести: <имя> любит меня (переменная text).
//        Каждый вывод - с новой строки.
//        Пример вывода на экран для имени Света:
//        Света любит меня.
//        Света любит меня.
//        Света любит меня.
//        Света любит меня.
//        Света любит меня.
//        Света любит меня.
//        Света любит меня.
//        Света любит меня.
//        Света любит меня.
//        Света любит меня.

import java.util.Scanner;

public class Task0402 {
    public static void main(String[] args) {
        String text = " любит меня";

        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine() + text;
        int i = 1;
        while (i <= 10) {
            System.out.println(result);
            i++;
        }
    }
}
