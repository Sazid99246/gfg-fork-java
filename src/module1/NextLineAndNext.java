package module1;

import java.util.Scanner;

/**
 * This class demonstrates the use of `nextInt` and `nextLine` methods of the Scanner class,
 * particularly in scenarios where inputs are read consecutively and might include both integers
 * and strings. It handles multiple test cases.
 * @author Sheikh Md. Sazidul Islam
 * @since 27/12/2024
 * @version 3.0
 * @see <a href="https://github.com/sazid99246">My Github</a>
 */
public class NextLineAndNext {

    /**
     * Reads multiple test cases where each test case consists of an integer followed by a string.
     * Demonstrates handling of the newline character when switching from `nextInt` to `nextLine`.
     */
    public static void getInput() {
        Scanner sc = new Scanner(System.in);

        // Read the number of test cases
        int t = sc.nextInt();

        // Process each test case
        while (t-- > 0) {
            // Read an integer
            int a = sc.nextInt();

            // Consume the remaining newline character
            sc.nextLine();

            // Read a string
            String s = sc.nextLine();

            // Print the inputs
            System.out.println(a);
            System.out.println(s);
        }
    }

    /**
     * The main method serves as the entry point of the program.
     * It calls the `getInput` method to read and process the inputs.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        getInput();
    }
}
