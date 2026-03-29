package level6;

import java.util.Scanner;

//Чтобы выполнить эту задачу, тебе нужно:
//
//Ввести с клавиатуры число N.
//Считать N целых чисел и заполнить ими массив.
//Найти минимальное число среди элементов массива и вывести в консоль.

public class Task0506 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        int[] data = new int[N];

        for (int i = 0; i < data.length; i++) {
            data[i] = console.nextInt();
        }
        int min = data[0];

        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        System.out.println(min);
    }
}
