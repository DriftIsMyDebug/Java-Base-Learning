package level04;

import java.util.Scanner;


//Давай разделим ящик колы на кабинет программистов. Для этого напишем программу, в которой:
//
//Нужно ввести с клавиатуры два целых числа. Первое число - количество банок колы в ящике. Второе - количество людей в кабинете.
//Вывести на экран результат деления первого числа на второе.
//
//Результатом должно быть вещественное число.

public class Task0416 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int countOfBottlesInBox = console.nextInt();
        int countOfPeopleInRoom = console.nextInt();
        double result = (countOfBottlesInBox * 1.0 / countOfPeopleInRoom);
        System.out.println(result);
        console.close();
    }

}
