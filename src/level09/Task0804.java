package level09;


//В этой задаче тебе предстоит реализовать метод generateNumber(), который будет возвращать случайное число от 0 до 99.
//В методе generateNumber() используй метод Math.random().

public class Task0804 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(generateNumber());
        }
    }

    public static int generateNumber() {
        return (int) (Math.random() * 100);
    }

}
