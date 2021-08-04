
class Machine {
    private String name;

    // constructor name must be same as class and wonthave any return type
    // used for initialization of instance variables
    public Machine() {
        System.out.println("consturtor running");
        name = "Abbas";
    }

    // multiple constructor methods
    public Machine(String name) {
        this.name = name;
        System.out.println("second");
    }
}

public class constructors {
    public static void main(String[] args) {
        Machine machine1 = new Machine();

        // this runs the constructor
        new Machine();

        // the constructor runs the method according to the inputs
        Machine machine2 = new Machine("abbas");
        ;
    }
}
