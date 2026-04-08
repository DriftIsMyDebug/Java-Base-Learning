package level11;


//Давай построим жилой комплекс из трех высоток. Для этого мы будем использовать три разных способа вывода информации:
//
//Объявляет о результате постройки.
//Объявляет о результате и указывает количество этажей.
//Объявляет о результате и указывает застройщика.

public class Skyscraper1 {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";

    public static void main(String[] args) {
        Skyscraper1 skyscraper1 = new Skyscraper1();
        Skyscraper1 skyscraperTower = new Skyscraper1(50);
        Skyscraper1 skyscraperSkyline = new Skyscraper1("JavaRushDevelopment");
    }
    public Skyscraper1() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }
    public Skyscraper1(int floorsCount) {
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + floorsCount);
    }
    public Skyscraper1(String buildDeveloper) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + buildDeveloper);
    }
}
