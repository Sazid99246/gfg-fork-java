package module1;

import java.util.Scanner;

/**
 * The `EvenOdd` class demonstrates decision-making in Java by checking if a number is even or odd
 * and printing two integers in a specific order based on the result.
 * If the first number is even, it is printed first; otherwise, the second number is printed first.
 */
public class EvenOdd {

    /**
     * Prints two integers in a specific order based on the parity of the first integer.
     *
     * @param a The first integer to check for even or odd.
     * @param b The second integer.
     *
     * <p>Output:</p>
     * <ul>
     * <li>If `a` is even, it prints `a` followed by `b`.</li>
     * <li>If `a` is odd, it prints `b` followed by `a`.</li>
     * </ul>
     */
    public static void evenOdd(int a, int b) {
        if (a % 2 == 0) {
            System.out.println(a);
            System.out.println(b);
        } else {
            System.out.println(b);
            System.out.println(a);
        }
    }

    /**
     * The main method reads multiple test cases, where each test case consists of two integers.
     * It processes each pair of integers using the `evenOdd` method.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int n = sc.nextInt();

        // Process each test case
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            evenOdd(a, b);
        }
    }
}
