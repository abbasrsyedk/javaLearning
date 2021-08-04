class Robot {
    public void speak() {
        System.out.println("Hello");
    }

    public void move(String direction, int distance) {
        System.out.println("moving " + distance + " meters in " + direction + " direction");
    }
}

public class methodpara {
    public static void main(String[] args) {
        Robot dora = new Robot();
        dora.speak();
        dora.move("West", 10);
    }
}