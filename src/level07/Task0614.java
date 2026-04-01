package level07;


//Посмотри, что делает программа. Расставь модификатор final общепринятым константам (переменным с неизменными значениями).
// Кроме этого такие константы должны быть переименованы согласно конвенции (заглавными буквами).

public class Task0614 {
    public static final double PI = 3.14;
    public static double radiusOfCircle = 2.5;
    public static double diameterOfCircle = 5;

    public static void main(String[] args) {
        System.out.println("Плошадь круга равна: " + PI * radiusOfCircle * radiusOfCircle);
        System.out.println("Периметр круга равен: " + PI * diameterOfCircle);
    }
}
