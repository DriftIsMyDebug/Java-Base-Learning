package level11;


//В методе main создаются два айфона с одинаковыми параметрами.
//В консоли выводится результат их сравнения. Разберись, почему сейчас результат отрицательный и сделай так, чтобы он был положительным.
// Для этого тебе нужно переопределить метод equals(Iphone), который будет учитывать все параметры.
//У двух равных объектов значения полей должны быть одинаковыми. Метод main не участвует в проверке.

import java.util.Objects;

public class Iphone {
    private final String model;
    private final String color;
    private final int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override // переопределяем потому что, что по умолчанию у объекта String идет проверка по ссылке, а не по значению...
    public boolean equals(Object obj) { // Можно передать любой объект (Универсальный тип)
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Iphone iphone)) return false; // если переданный объект не типа Iphone
        // Приводим объект к типу Iphone
       return this.price == iphone.price &&
               Objects.equals(this.model, iphone.model) &&
               Objects.equals(this.color, iphone.color);
    }

//    !!!!Equals и HashCode — это близнецы. Если переопределил один, обязан переопределить второй.!!!!
//    Описанное выше поведение должны реализовывать все классы в Java. Проверить правильность сравнения объектов на уровне компиляции никак нельзя.
    @Override
    public int hashCode() {
        return Objects.hash(model, color, price);
    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}
