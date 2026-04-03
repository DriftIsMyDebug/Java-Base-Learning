package level09;


//Реализуй метод getPowerOfTwo(int power), который возвращает число 2 в степени power.
//Тебе нужно изменить реализацию метода getPowerOfTwo(int), используя соответствующий побитовый сдвиг.

public class Task0813 {
    public static void main(String[] args) {
        System.out.println(getPowerOfTwo(3));
    }
    public static int getPowerOfTwo(int power) {
        if (power >= 0) {
            return 1 << power;
        } else {
            return 1 >> -power;
        }
    }
}
