package level08;


//Реализуй метод setValues(long value), чтобы он устанавливал полученное значение параметра value переменным a, b, c и d.
//Изменять типы переменных a, b, c и d нельзя.


public class Task0708 {
    public static byte a;
    public static short b;
    public static int c;
    public static long d;

    public static void main(String[] args) {
        setValue(100);
    }

    public static void setValue(long value) {
        a = (byte) value;
        b = (short) value;
        c = (int) value;
        d = value;
    }
}
