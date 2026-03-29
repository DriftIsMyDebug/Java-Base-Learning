package level6;
//
//В этой задаче тебе нужно:
//
//Ввести с клавиатуры число N.
//Считать N целых чисел и заполнить ими массив array.
//Найти максимальное число среди элементов массива.
//

import java.util.Scanner;

public class Task0507 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        int[] dataOfNumbers = new int[N];

        for (int i = 0; i < dataOfNumbers.length; i++) {
            dataOfNumbers[i] = console.nextInt();
        }
        int max = dataOfNumbers[0];
        for (int i = 1; i < dataOfNumbers.length; i++) {
            if (dataOfNumbers[i] > max) {
                max = dataOfNumbers[i];
            }
        }
        System.out.println(max);
    }
}
