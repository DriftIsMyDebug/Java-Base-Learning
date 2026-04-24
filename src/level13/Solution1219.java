package level13;

//В методе main создается список ArrayList<String>, присваивается переменной var strings и заполняется пятью элементами.
//Нужно переписать код, не изменяя логику, используя двойные фигурные скобки.

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Solution1219 {
    public static void main(String[] args) {
        var strings = new ArrayList<String>() {{
            add("Так");
            add("тоже");
            add("можно");
            add("делать");
            add("!");
        }};
    }
}
