package level11;

//У класса City есть два поля - название города и текущая температура воздуха.
// Также в классе Solution есть метод showWeather: он выводит в консоли информацию о погоде в городе,
// который передан в качестве аргумента метода. Реализуй метод showWeather, который должен выводить в консоли информацию
// в таком формате: В городе "название города" сегодня температура воздуха "температура в городе"
// В методе main один раз нужно вызвать метод showWeather с нужным аргументом.

public class Solution2 {
    public static void showWeather(City city) {
        System.out.println(String.format("В городе %s сегодня температура воздуха %d", city.getName(), city.getTemperature()));
    }

    public static void main(String[] args) {
        City dubai = new City("Дубай", 40);
        showWeather(dubai);
    }
}
