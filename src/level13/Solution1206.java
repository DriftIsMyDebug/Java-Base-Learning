package level13;

//Реализуй методы countDigits(String), countLetters(String), countSpaces(String), которые должны возвращать количество цифр, букв и пробелов в строке.
//Метод main не принимает участия в проверке

import javax.security.auth.callback.CallbackHandler;

public class Solution1206 {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int countDigits = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) { // достаем символ при помощи String.charAt()
                countDigits++;
            }
        }
        return countDigits;
    }
    public static int countLetters(String string) {
        int countLetters = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                countLetters++;
            }
        }
        return countLetters;
    }
    public static int countSpaces(String string) {
        int countSpaces = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isSpaceChar(string.charAt(i))) {
                countSpaces++;
            }
        }
        return countSpaces;
    }
}
