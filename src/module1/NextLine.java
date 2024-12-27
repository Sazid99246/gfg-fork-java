package module1;

/**
 * The `NextLine` class demonstrates simple output using `System.out.println` to print each string
 * on a new line. It provides a method to print "Geeks", "for", and "Geeks" on individual lines.
 *
 * @author Sheikh Md. Sazidul Islam
 * @since 27/12/2024
 * @version 3.0
 * @see <a href="https://github.com/sazid99246">My Github</a>
 */
public class NextLine {

    /**
     * Prints the strings "Geeks", "for", and "Geeks", each on a new line.
     */
    public static void printIndividualLine() {
        System.out.println("Geeks");
        System.out.println("for");
        System.out.println("Geeks");
    }

    /**
     * The main method serves as the entry point of the program.
     * It calls the `printIndividualLine` method to display the output.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        printIndividualLine();
    }
}
