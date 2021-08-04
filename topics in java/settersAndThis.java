class Frog {
    String name;
    int age;

    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class settersAndThis {
    public static void main(String[] args) {
        Frog frog1 = new Frog();
        // setter
        frog1.setName("Kappa");
        frog1.setAge(2);

        System.out.println(frog1.getName());
    }
}
