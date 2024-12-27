package module1;

import java.util.Scanner;

/**
 * A program to demonstrate various bitwise operations in Java.
 * It performs operations such as XOR, AND, OR, and NOT on integers
 * and prints the results.
 *
 * @author Sheikh Md. Sazidul Islam
 * @since 27/12/2024
 * @version 3.0
 * @see <a href="https://github.com/sazid99246">My Github</a>
 */
public class BitwiseOperators {

    /**
     * Performs various bitwise operations on the given integers and prints the results.
     *
     * @param a the first integer.
     * @param b the second integer.
     * @param c the third integer.
     *
     * <p>Operations performed:</p>
     * <ul>
     *   <li><b>d</b>: Result of <code>a ^ a</code> (XOR of <code>a</code> with itself, always 0).</li>
     *   <li><b>e</b>: Result of <code>c ^ b</code> (XOR of <code>c</code> and <code>b</code>).</li>
     *   <li><b>f</b>: Result of <code>a &amp; b</code> (AND operation between <code>a</code> and <code>b</code>).</li>
     *   <li><b>g</b>: Result of <code>c | (a ^ a)</code> (OR operation between <code>c</code> and the XOR of <code>a</code> with itself).</li>
     *   <li><b>h</b>: Result of <code>~e</code> (NOT operation on <code>e</code>).</li>
     * </ul>
     */
    public static void bitWiseOp(int a, int b, int c) {
        int d = a ^ a; // XOR of a with itself, result is always 0
        int e = c ^ b; // XOR of c and b
        int f = a & b; // AND operation between a and b
        int g = c | (a ^ a); // OR operation between c and the result of (a ^ a)
        int h = ~e; // NOT operation on e
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }

    /**
     * Main method to read input integers and invoke the bitwise operations.
     *
     * @param args command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read three integers from user input
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Perform bitwise operations and print results
        bitWiseOp(a, b, c);
    }
}
