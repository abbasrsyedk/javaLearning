
class Person {
    String name;
    int age;

    // creating a method
    void speak() {
        System.out.println("Hello! My name is " + name);
    }

    int calculateYearsToRetirement() {
        int yearsToRetirement = 65 - age;
        return yearsToRetirement;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }
}

public class getandReturn {
    public static void main(String[] args) {
        // calling the method
        Person person1 = new Person();
        person1.name = "Abbas";
        person1.age = 20;

        // retrurning calculateYearsToRetirement
        int years = person1.calculateYearsToRetirement();

        System.out.println(years);

    }
}
