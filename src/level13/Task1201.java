package level13;

//В классе Solution представлены 8 переменных примитивных типов с именами вида типValue.
//Для каждой из этих переменных необходимо создать объекты-обертки и присвоить им имена вида типValueBox.
//Для создания объектов-оберток используй метод Тип.valueOf(примитив).
//
//Пример переменной объекта-обертки: Integer integerValueBox = ....;

public class Task1201 {
    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;

    float floatValue;
    double doubleValue;

    char charValue;
    boolean booleanValue;

    Byte byteValueBox = Byte.valueOf(byteValue);
    Short shortValueBox = Short.valueOf(shortValue);
    Integer intValueBox = Integer.valueOf(intValue);
    Long longValueBox = Long.valueOf(longValue);
    Float floatValueBox = Float.valueOf(floatValue);
    Double doubleValueBox = Double.valueOf(doubleValue);
    Character charValueBox = Character.valueOf(charValue);
    Boolean booleanValuBox = Boolean.valueOf(booleanValue);

    public static void main(String[] args) {

    }
}
