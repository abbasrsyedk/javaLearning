public class recursion {
    public static void main(String[] args) {

        System.out.println(factorial(-1));
    }

    private static int factorial(int value) {
        // the factorial is defined for non-negative integers.
        if (value < 2) {
            return 1;
        } else {
            return factorial(value - 1) * value;
        }
    }
}
