package module1;

/**
 * This class provides a method to perform controlled printing based on divisibility conditions.
 *
 * @author Sheikh Md. Sazidul Islam
 * @since 27/12/2024
 * @version 3.0
 * @see <a href="https://github.com/sazid99246">My Github</a>
 */
public class ControlledPrinting {
    /**
     * Prints specific messages based on the divisibility of the given number:
     * <ul>
     *     <li>If the number is divisible by both 3 and 5, prints "Fork Java".</li>
     *     <li>If the number is divisible by 3 only, prints "Fork".</li>
     *     <li>If the number is divisible by 5 only, prints "Java".</li>
     *     <li>If the number is not divisible by 3 or 5, prints an empty line.</li>
     * </ul>
     *
     * @param N The number to check for divisibility.
     */
    public static void forkJava(int N) {
        if (N % 3 == 0 && N % 5 == 0) {
            System.out.println("Fork Java");
        } else if (N % 3 == 0) {
            System.out.println("Fork");
        } else if (N % 5 == 0) {
            System.out.println("Java");
        } else {
            System.out.println("");
        }
    }

    /**
     * The main method to test the `forkJava` method.
     *
     * @param args Command-line arguments (not used in this case).
     */
    public static void main(String[] args) {
        forkJava(10);
    }
}
