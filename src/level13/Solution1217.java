package level13;

//В классе Solution есть поле intArray, геттер и сеттер для него, и метод main с объявленными в нем переменными.
//Тебе нужно заменить типы переменных с var на конкретный тип объекта (изменять названия и инициализацию объектов нельзя),
//а также починить геттер и сеттер поля intArray.

public class Solution1217 {
    private int[] intArray = new int[4];

    public int[] getIntArray() {
        return intArray;
    }
    public void setIntArray(int[] intArray) {
        this.intArray = intArray;
    }

    public static void main(String[] args) {
        Solution1217 solution = new Solution1217();
        String string = new String("Hello");
        StringBuilder stringBuilder = new StringBuilder();
    }
}
