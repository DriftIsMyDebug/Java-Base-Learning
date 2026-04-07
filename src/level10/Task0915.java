package level10;


//Используя StringTokenizer раздели query на части по разделителю delimiter.
//
//        Пример:
//        getTokens("java.util.stream", "\\.")
//        возвращает массив строк
//        {"java", "util", "stream"}
//
//        Hint: решить задачу поможет метод countTokens().

import java.util.Arrays;
import java.util.StringTokenizer;

public class Task0915 {
    public static void main(String[] args) {
        String packagePath = "java.util.steam";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimeter) {
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimeter);
        String[] result = new String[stringTokenizer.countTokens()];
        for (int i = 0; i < result.length; i++) {
            result[i] = stringTokenizer.nextToken();
        }
        return result;
    }
//    public static String[] getTokens(String query, String delimeter) { -> современный способ решения задачи
//        return Arrays.stream(query.split(delimeter)).toArray(String[]:: new);
//    }
}
