class Frog {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setInfo(String name, int age) {
        setName(name);
        setAge(age);
    }
}

public class thisreference {
    public static void main(String[] args) {
        Frog frog1 = new Frog();
        // setter
        frog1.setName("Kappa");
        frog1.setAge(2);

        System.out.println(frog1.getName());

        frog1.setInfo("la-lamborgini", 10);
        System.out.println(frog1.getAge());
        System.out.println(frog1.getName());
    }
}
