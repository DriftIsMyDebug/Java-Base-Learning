package level04;

import java.util.Scanner;

// В этой задаче нужно:
//
// Ввести с клавиатуры строку и число number, которое больше 0 и меньше 5.
// Вывести на экран строку number раз с помощью цикла do-while. Каждое значение нужно вывести с новой строки.
//
// Если число number меньше/равно 0 или больше/равно 5, то введенную строку нужно вывести на экран один раз.

public class Task0414 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String userInput = console.nextLine();
        int number = console.nextInt();
        do {
            System.out.println(userInput);
            number--;
        } while( number > 0 && number < 5);
        console.close();
    }
}
