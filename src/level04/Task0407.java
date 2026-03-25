package level04;

//Вывести на экран сумму чисел от 1 до 100 включительно, не кратных 3.

public class Task0407 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while (i < 100) {
            i++;
            if (i % 3 == 0) {
                continue;
            }
            sum += i;
        }
        // Выводим накопленный результат ОДИН РАЗ в самом конце
        System.out.println(sum);
    }
}