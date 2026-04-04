package level10;

//Публичный статический метод toOctal(int) должен переводить целое число, полученное в качестве входящего параметра,
// из десятичной системы счисления в восьмеричную. А публичный статический метод toDecimal(int)
// наоборот — из восьмеричной в десятичную.
//Методы работают только с положительными числами. Если входящий параметр меньше или равен 0, методы возвращают 0.
//Твоя задача — реализовать эти методы.


public class Task0905 {

    public static void main(String[] args) {
        int decimalNumber = 25;
        System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
        int octalNumber = 23;
        System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) { // из десятичной в восьмеричную
        if (decimalNumber <= 0) return 0;
        int octalNumber = 0;
        int i = 0;
        while (decimalNumber != 0) {
            int remainder = decimalNumber % 8;
            octalNumber = octalNumber + (remainder * (int) Math.pow(10, i));
            decimalNumber /= 8;
            i++;
        }
        return octalNumber;

    }

    public static int toDecimal(int octalNumber) { // из восьмеричной в десятичную
        if (octalNumber <= 0) return 0;
        int decimalNumber = 0;
        int i = 0;
        while (octalNumber != 0) {
            int lastDigit = octalNumber % 10;
            decimalNumber += lastDigit * (int) Math.pow(8, i);
            octalNumber /= 10;
            i++;
        }
        return decimalNumber;
    }
}

