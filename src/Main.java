public class Main {
    public static void main(String[] args) {
        Person women = new Person();
        women.name = "Marie";
        women.age = 26;
        women.gender = "women";
        System.out.println("Name: " + women.name + " | gender: " + women.gender + " | age: " + women.age);

        Person men = new Person();
        men.name ="Sam";
        men.age = 30;
        men.gender = "men";
        System.out.println("Name: " + men.name + " | gender: " + men.gender + " | age: " + men.age);
    }
}

class Person {
    String name;
    int age;
    String gender;
}