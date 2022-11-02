public class Main {
    public static void main(String[] args) {
        Person woman = new Person("Marie",26,"women");
        System.out.println(woman);

        Person man = new Person("Sam",30,"men");
        System.out.println(man);
    }
}

class Person {
   private String name;
   private int age;
   private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}