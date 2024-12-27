package module1;

import java.util.Scanner;

/**
 * The `Condition` class checks divisibility of an integer by specific prime numbers
 * (2, 3, and 11) and prints corresponding results.
 *
 * @author Sheikh Md. Sazidul Islam
 * @since 27/12/2024
 * @version 3.0
 * @see <a href="https://github.com/sazid99246">My Github</a>
 */
public class Condition {

    /**
     * Checks whether a given integer is divisible by 11, 3, or 2, in that order.
     *
     * <p>If divisible:</p>
     * <ul>
     * <li>Prints "Eleven" if divisible by 11.</li>
     * <li>Prints "Three" if divisible by 3.</li>
     * <li>Prints "Two" if divisible by 2.</li>
     * </ul>
     * If not divisible by any of these primes, it prints "-1".
     *
     * @param n The integer to be checked for divisibility.
     */
    public static void isDivisibleByPrime(int n) {
        if (n % 11 == 0) {
            System.out.println("Eleven");
        } else if (n % 3 == 0) {
            System.out.println("Three");
        } else if (n % 2 == 0) {
            System.out.println("Two");
        } else {
            System.out.println("-1");
        }
    }

    /**
     * The main method serves as the entry point of the program.
     * It reads an integer from the user and checks its divisibility using the
     * `isDivisibleByPrime` method.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input from user
        int n = sc.nextInt();

        // Check divisibility and print the result
        isDivisibleByPrime(n);
    }
}
