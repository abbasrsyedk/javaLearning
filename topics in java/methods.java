
class Person {
    String name;
    int age;

    // creating a method
    void speak() {
        System.out.println("Hello! My name is" + name);
    }

}

public class methods {
    public static void main(String[] args) {
        // calling the method
        Person person1 = new Person();
        person1.name = "Abbas";
        person1.age = 20;
        // calling the speak method
        person1.speak();

    }
}
