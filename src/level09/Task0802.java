package level09;

//Исправь методы класса Solution, используя класс Math:
//
//sqrt(double) — должен возвращать квадратный корень переданного аргумента.
//cbrt(double) — должен возвращать кубический корень переданного аргумента.
//pow(int, int) — должен возвращать значение первого аргумента, возведенного в степень второго аргумента.

public class Task0802 {

    public static double sqrt(double a) {
        return Math.sqrt(a);
    }

    public static double cbrt(double a) {
        return Math.cbrt(a);
    }

    public static double pow(double number, int power) {
        return Math.pow(number, power);
    }
}
