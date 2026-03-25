package level04;
//Используя цикл while вывести на экран сто раз цитату (переменная quote):
//        «Я никогда не буду работать за копейки. Амиго»
public class Task0401 {
    public static void main(String[] args) {
        String quote = "Я никогда не буду работать за копейки. Амиго";
        int i = 1;
        while (i <= 100) {
            System.out.println(quote);
            i++;
        }
    }
}
