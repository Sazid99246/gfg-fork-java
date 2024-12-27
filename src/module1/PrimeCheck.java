package module1;

import java.util.Scanner;

/**
 * This class provides functionality to check if a given number is prime.
 */
public class PrimeCheck {

    /**
     * Checks whether the given number is prime or not.
     *
     * @param n The number to check.
     * @return "Yes" if the number is prime, "No" otherwise.
     */
    public static String isPrime(int n) {
        // 1 is not considered prime
        if (n == 1) {
            return "No";
        }
        // 2 is the only even prime number
        if (n == 2) {
            return "Yes";
        }
        // Check divisibility from 2 to the square root of n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return "No"; // n is divisible by i, so it's not prime
            }
        }
        return "Yes"; // n is prime
    }

    /**
     * The main method to take input from the user and print whether the number is prime.
     *
     * @param args Command-line arguments (not used in this case).
     */
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Read the integer input
        int n = sc.nextInt();

        // Close the scanner to prevent resource leaks
        sc.close();

        // Output whether the number is prime
        System.out.println(isPrime(n));
    }
}
