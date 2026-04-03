package level09;

import static java.lang.Math.toRadians;


//Реализуй методы sin(double), cos(double), tan(double) которые возвращают синус, косинус и тангенс угла соответственно,
//полученного как параметр. Угол задан в градусах.
//В этом тебе помогут соответствующие методы класса Math, которые принимают параметром угол, заданный в радианах.

public class Task0801 {

    public static void main(String[] args) {
//        System.out.println(sin(45));
//        System.out.println(cos(45));
//        System.out.println(tan(45));
    }

    public static double sin(double a) {
        return Math.sin(toRadians(a));
    }

    public static double cos(double a) {
        return Math.cos(toRadians(a));
    }

    public static double tan(double a) {
        return Math.tan(toRadians(a));
    }
}
