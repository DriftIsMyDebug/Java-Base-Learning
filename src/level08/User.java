package level08;

public class User {
    String name;
    short age;
    int height;


    public User(String name, short age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public User(String name, int height, short age){
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public User(short age, String name, int height){
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public User(short age, int height, String name){
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public User(int height, short age, String name){
        this.height = height;
        this.age = age;
        this.name = name;
    }
    public User(int height, String name, short age){
        this.height = height;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        User newUser = new User("User 1", (short) 25, 180);
        User Meow = new User("Meow", (short) 25, 180);
        User User3 = new User("User 3", (short) 25, 180);
    }
}
