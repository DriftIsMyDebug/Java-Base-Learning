package level04;

//Программа должна считывать целые числа с клавиатуры до тех пор,
// пока не будет введено что-то другое:
// например, строка или символ. Выведи на экран минимальное число из введенных.
// Если введено несколько таких чисел, необходимо вывести любое из них.

import java.util.Scanner;

public class Task0409 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int min = Integer.MAX_VALUE; // Да-да, это написано правильно... (мы ставим своего рода бесконечность для корректной проверки)
        while(console.hasNextInt()) {
            int x = console.nextInt();
            if (x < min) {
                min = x;
            }
        }
        System.out.println(min);
        console.close();
    }
}
