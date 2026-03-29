package level06;

import java.util.Scanner;

//В этой задаче тебе нужно:
//
//Считать 6 строк и заполнить ими массив strings.
//Удалить повторяющиеся строки из массива strings, заменив их на null (null должны быть не строками "null").
//
//Примеры.
//
//Массив после чтения строк:
//        {"Hello", "Hello", "World", "Java", "Tasks", "World"}
//
//Массив после удаления повторяющихся строк:
//        {null, null, null, "Java", "Tasks", null}


public class Task0508 {
    public static String[] strings;
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        strings = new String[6];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
            String currentString = strings[i];
            if (currentString == null) continue;
            for (int j = i + 1; j < strings.length; j++) {
                if (currentString.equals(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

    }
}
