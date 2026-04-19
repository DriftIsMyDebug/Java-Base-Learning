package level13;

//В классе Solution есть список сотрудников waitingEmployees, которые ждут зарплату, и список сотрудников alreadyGotSalaryEmployees, которые её уже получили. Необходимо реализовать метод paySalary(String), который в качестве аргумента принимает имя сотрудника, желающего получить зарплату.
//        Метод должен проверить наличие сотрудника в списке waitingEmployees, и если он не получал зарплату, выдать её:
//
//        Если параметр метода paySalary(String) равняется null, ничего не нужно делать.
//        Добавить имя сотрудника в список alreadyGotSalaryEmployees.
//        В списке waitingEmployees заменить имя сотрудника на null.

import java.util.ArrayList;

public class Solution1209 {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }
    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
        if (waitingEmployees.contains(name)) {
            alreadyGotSalaryEmployees.add(name);
            waitingEmployees.set(waitingEmployees.indexOf(name), null); // вместо удаления индекса, мы меняем этот индекс на null
        }
    }
}
