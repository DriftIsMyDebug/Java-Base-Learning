package level10;


//Разворот строки
//
//Используя StringBuilder в методе reverseString(String), разверни строку, полученную как параметр.

public class Task0919 {
    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder builder = new StringBuilder(string);
        builder.reverse();
        return builder.toString();
    }
}
