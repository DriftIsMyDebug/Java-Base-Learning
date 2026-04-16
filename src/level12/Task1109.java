package level12;

public class Task1109 {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        Outer.Nested nested = new Outer.Nested();
    }
}
