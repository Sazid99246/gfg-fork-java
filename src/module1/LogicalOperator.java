package module1;

/**
 * The `LogicalOperator` class demonstrates the use of logical operators
 * (`&&`, `||`, and `!`) in Java. It evaluates logical expressions based on
 * the input boolean values and prints the results.
 *
 * @author Sheikh Md. Sazidul Islam
 * @since 27/12/2024
 * @version 3.0
 * @see <a href="https://github.com/sazid99246">My Github</a>
 */
public class LogicalOperator {

    /**
     * Evaluates and prints the results of logical operations on two boolean values.
     *
     * <p>The following operations are performed:</p>
     * <ul>
     *     <li>Logical AND (`a && b`)</li>
     *     <li>Logical OR (`a || b`)</li>
     *     <li>Logical AND of the negations (`!a && !b`)</li>
     * </ul>
     *
     * @param a The first boolean value.
     * @param b The second boolean value.
     */
    static void logicOp(boolean a, boolean b) {
        // Evaluate and print the results of logical operations
        System.out.print((a && b) + " " + (a || b) + " " + ((!a) && (!b)));
    }

    /**
     * The main method serves as the entry point of the program.
     * It calls the `logicOp` method with sample boolean values.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        logicOp(true, false);
    }
}
