package level06;

// Реализуй статический метод main(String[]), который заполняет массив array значениями valueStart и valueEnd.
// Если длина массива четная, его первую половину нужно заполнить значениями valueStart, а вторую — valueEnd.
// Если длина массива нечётная, то первую большую часть заполнить значениями valueStart, вторую меньшую — valueEnd.
// Для заполнения массива используй метод Arrays.fill(int[], int, int, int).
// При тестировании значения полей класса Solution будут разными, учти это.

import java.util.Arrays;

public class Task0516 {
    public static int[] array = new int[10];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        int middle = (array.length + 1) / 2;
        Arrays.fill(array, 0, middle, valueStart);
        Arrays.fill(array, middle, array.length, valueEnd);
        System.out.println(Arrays.toString(array));
    }
}
