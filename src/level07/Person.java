package level07;


//Перед тобой программа, которая выводит информацию о человеке в консоли. К сожалению, она не компилируется.
//Измени минимальное необходимое количество модификаторов доступа в классе Person, чтобы код скомпилировался.

public class Person {
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    protected String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
