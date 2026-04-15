package level12;

//В методе main конвертируй строку string в тип double с помощью статического метода parseDouble класса Double.
//Затем округли полученное значение, используя статический метод round класса Math.
//Результат выведи на экран.

public class Task1104 {
    public static void main(String[] args) {
        String str = "12.84";
        double convertToDouble = Double.parseDouble(str);
        int round = (int) Math.round(convertToDouble);
        System.out.println(round);
    }
}
