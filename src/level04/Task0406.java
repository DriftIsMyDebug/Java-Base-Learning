package level04;


//Вводим данные с клавиатуры и сразу их выводим на экран, пока не будет введено слово "enough".
//        Слово "enough" выводить не нужно.

import java.util.Scanner;

public class Task0406 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true) {
            String s = console.nextLine();
            if (s.equals("enough")) break;
            System.out.println(s);
        }

    }
}
