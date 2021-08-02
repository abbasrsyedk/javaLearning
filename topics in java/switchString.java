package basics2;

public class switchString {
    public static void main(String[] args) {
        String dog = "lab";
        switch (dog) {
            case "gold":
                System.out.println("its a gold");
                break;
            case "pug":
                System.out.println("its a pug");
                break;
            default:
                System.out.println("alien");
        }
    }
}