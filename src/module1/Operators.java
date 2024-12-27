package module1;

/**
 * This class demonstrates the use of mathematical operations, including
 * exponentiation, bitwise XOR, and modulo operations.
 *
 * @author Sheikh Md. Sazidul Islam
 * @since 27/12/2024
 * @version 3.0
 * @see <a href="https://github.com/sazid99246">My Github</a>
 */
public class Operators {

    /**
     * Performs various operations on the given integers and prints the results.
     *
     * @param a The base number for exponentiation.
     * @param b The exponent to raise the base number to.
     * @param c The number to perform bitwise XOR and modulo operations with.
     */
    static void operations(int a, int b, int c) {
        // Calculate a raised to the power of b and store it as a long to avoid overflow
        long p = (long) Math.pow(a, b);

        // Print the result of a^b
        System.out.println(p);

        // Perform a bitwise XOR operation between p and c, and print the result
        System.out.println(p ^ c);

        // Calculate the modulo of p by c, and print the result
        System.out.println(p % c);
    }

    /**
     * The main method to call the operations method with sample inputs.
     *
     * @param args Command-line arguments (not used in this case).
     */
    public static void main(String[] args) {
        // Call the operations method with specific arguments
        operations(1, 3, 5);
    }
}
