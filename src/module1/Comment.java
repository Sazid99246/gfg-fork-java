package module1;

import java.util.Scanner;

/**
 * The `Comment` class demonstrates the use of comments in a Java program and the effects of
 * commenting out lines of code on the program's behavior.
 *
 * @author Sheikh Md. Sazidul Islam
 * @since 27/12/2024
 * @version 3.0
 * @see <a href="https://github.com/sazid99246">My Github</a>
 */
public class Comment {

    /**
     * The main method reads three integers from the user and prints the first and third integers.
     * The second integer is not printed because the corresponding `System.out.println` statement
     * is commented out.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reads three integers from user input
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Prints a
        System.out.println(a);

        // Prints b (currently commented out)
        // System.out.println(b);

        // Prints c
        System.out.println(c);
    }
}
