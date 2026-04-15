package level12;

//Cделай все переменные класса Planet не статическими.
//После этого внеси необходимые правки в метод main.
public class Task1102 {
    public static void main(String[] args) {
        Planet earth = new Planet();
        earth.name = "Земля";
        earth.age = 4_540_000_000L;
        earth.speed = 170_218;
        earth.area = 510_072_000;
        earth.printInformation();
    }
}
