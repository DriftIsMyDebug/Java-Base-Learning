package level08;


//Странное деление
//
//В методе main вызови метод div() с таким аргументом, чтобы вывод в консоли был "NaN".
//Код метода div() изменять нельзя.


public class Task0706 {
    public static void main(String[] args) {
        div(0.0, 0.0);
    }

    public static void div(double a, double b) {
        System.out.println(b / a);
    }
}
