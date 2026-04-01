package level07;

//Метод printSqrt(int[] array) должен выводить корень квадратный для каждого элемента переданного массива.
//Но этого не происходит из-за конфликта имен переменных. Исправь имена переменных так, чтобы код компилировался.
//В результате работы программа должна выводить в консоли соответствующую строку для каждого элемента массива.

public class Task0612 {
    public static void main(String[] args) {
        int[] array = {15, 64, 128, 51, 42, 27, 9, 3, 20, 90};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String elementSqrtString = "Квадратный корень для числа: ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elementSqrt = Math.sqrt(element);
            System.out.println(elementSqrtString + element + " равен " + elementSqrt);
        }
    }
}
