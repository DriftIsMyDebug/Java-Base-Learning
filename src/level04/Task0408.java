package level04;

import java.util.Scanner;


//Программа должна считывать целые числа с клавиатуры до тех пор,
// пока не будет введено что-то другое: например, строка или символ.
// Выведи на экран максимальное четное число из введенных.
// Если введено несколько таких чисел, необходимо вывести любое из них.

public class Task0408 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int count = 0;
        while(console.hasNextInt()) {
            int x = console.nextInt();
            if ((x > max) && (x % 2 == 0)) {
                max = x;
            }
            count++;
        }
        if (count == 0) {
            System.out.println(Integer.MIN_VALUE);
        } else {
            System.out.println(max);
        }
    }
}
