import java.util.ArrayList;

public class factorization {
    public static int reverseNumber(int number) {
        int reverse = 0;
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        return reverse;
    }

    public static void primeFactors(int n) {
        int twos = 0;
        ArrayList<Integer> factors = new ArrayList<Integer>();
        // Print the number of 2s that divide n
        while (n % 2 == 0) {
            // System.out.print(2 + " ");
            factors.add(2);
            n = n / 2;
        }
        // n must be odd at this point. So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // While i divides n, print i and divide n
            while (n % i == 0) {
                // System.out.print(i + " ");
                factors.add(i);
                n = n / i;
            }
        }
        // This condition is to handle the case whien
        // n is a prime number greater than 2
        if (n > 2)
            // System.out.print(n);
            factors.add(n);
        for (int i = 0; i < factors.size(); i++) {
            int comparer = factors.get(i);
            if (comparer == 2) {
                twos = twos + 1;
            }
        }
        System.out.println(twos);
    }

    public static void main(String[] args) {
        int n = 115;
        // task 1: number needs to be reversed
        int reversedNumber = reverseNumber(n);
        // task 2 : the absolute value of reversed - the original number
        int dnum = Math.abs(n - reversedNumber);
        // task 3 : find how many times 2 is repeated in the prime factorization of the
        // dnum
        primeFactors(dnum);
    }

}
