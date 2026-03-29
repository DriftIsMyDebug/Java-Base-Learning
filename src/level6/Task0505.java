package level6;

import java.util.Scanner;

//Тебе нужно написать программу, которая:
//
//Считывает с консоли целое число N.
//Если считанное число N больше 0, то программа дальше считывает целые числа, количество которых равно N.
//Вывести в консоль считанные числа, если N нечетное — в порядке ввода, иначе — в обратном порядке.
//
//Каждое число выводить с новой строки. Число N выводить не нужно.


public class Task0505 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        if (N > 0) {
            int[] data = new int[N]; // пустой массив для значений

            for (int i = 0; i < data.length; i++) {
                data[i] = console.nextInt();
            }
            if (N % 2 == 0) {
                for (int i = data.length - 1; i >= 0; i--) {
                    System.out.println(data[i]);
                }
            } else {
                for (int i = 0; i < data.length; i++) {
                    System.out.println(data[i]);
                }
            }
        }

    }
}
