package level10;


//В классе Solution объявлены четыре публичных символьных поля. Им присвоены некоторые значения. Но программа не компилируется.
//Нужно это исправить, не меняя значения символов.
//Все поля статические (static) — это нужно, чтобы в методе main() получить к ним доступ.
//На результат можно посмотреть, запустив метод main(). Он не принимает участие в тестировании.


public class Task0904 {
    public static char first = '\u004A';
    public static char second = 'a';
    public static char third = '\u0076';
    public static char fourth = 'a';

    public static void main(String[] args) {
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
    }
}
