package level11;

import java.util.Objects;


//Напиши свою реализацию hashCode, используя переменные model и year. Если эти поля у двух объектов одинаковые, то должен возвращаться одинаковый hashCode. Если правильно реализовать метод hashCode, вывод должен быть таким:
//        true
//        true
//        true
//        true
//        false
//        false


public class Cars {
    private String model;
    private int year;


    public Cars(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }

    public static void main(String[] args) {
        Cars lamborghini = new Cars("Lamborghini", 2020);
        Cars lamborghini1 = new Cars("Lamborghini", 2020);
        Cars ferrari = new Cars("Ferrari", 2020);
        Cars ferrari1 = new Cars("Ferrari", 2020);
        Cars bugatti = new Cars("Bugatti", 2020);
        Cars bugatti1 = new Cars("Bugatti", 2020);
        System.out.println(ferrari.hashCode() == ferrari.hashCode());
        System.out.println(lamborghini.hashCode() == lamborghini1.hashCode());
        System.out.println(ferrari.hashCode() == ferrari1.hashCode());
        System.out.println(bugatti.hashCode() == bugatti1.hashCode());
        System.out.println(bugatti.hashCode() == lamborghini.hashCode());
        System.out.println(lamborghini.hashCode() == ferrari.hashCode());
    }
}
