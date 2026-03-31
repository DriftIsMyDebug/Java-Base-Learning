package level07;


//Переименуй параметры метода printPersonInfo():
//
//firstName в name;
//lastName в surname;
//favouriteDish в meal;
//
//таким образом, чтобы функционал программы остался неизменным.

public class Task0603 {
    public static void main(String[] args) {
        String firstName = "Ольга";
        String lastName = "Киприяновна";
        String favouriteDish = "Пельмени";
        publicPersonInfo(firstName, lastName, favouriteDish);
    }

    public static void publicPersonInfo(String name, String surname, String meal) {
        System.out.println("Краткое досье: ");
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Краткое Любимое блюдо: " + meal);
    }
}
