package level13;

import java.util.ArrayList;
import java.util.Arrays;

//В методе main найди и удали язык программирования Pascal из списка programmingLanguages.

public class Solution1214 {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        int index = programmingLanguages.indexOf("Pascal");
        if (index != -1) {
            programmingLanguages.remove(index);
        }

        System.out.println(programmingLanguages);
    }


}
