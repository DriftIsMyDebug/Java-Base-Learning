package level04;

import java.util.Scanner;


// Считывать целые числа с клавиатуры до тех пор, пока не будет введено что-то другое: например, строка или символ.
// Должно быть введено минимум два числа. Если введено меньше двух целых чисел, то такую ситуацию обрабатывать не нужно, а программа может быть завершена с ошибкой.
// Вывести на экран второе по величине целое число после минимального из введенных с клавиатуры. Если таких чисел несколько, то необходимо вывести любое из них.
// Минимальных чисел тоже может быть несколько.

public class Task0410 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        while (console.hasNextInt()) {
            int x = console.nextInt();
            if (x < firstMin) {
                secondMin = firstMin;
                firstMin = x;
            } else if (x > firstMin && x < secondMin) {
                secondMin = x;
            }
        }
        System.out.println(secondMin);
        console.close();
    }
}
