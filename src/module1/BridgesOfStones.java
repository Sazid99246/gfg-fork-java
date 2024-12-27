package module1;

/**
 * This class provides a method to calculate the minimum jumps needed to cross
 * a bridge represented by a sequence of stones.
 *
 * @author Sheikh Md. Sazidul Islam
 * @since 27/12/2024
 * @version 3.0
 * @see <a href="https://github.com/sazid99246">My Github</a>
 */
public class BridgesOfStones {

    /**
     * Finds the minimum number of jumps required to cross the bridge.
     *
     * @param N The total number of stones in the bridge (N should be odd).
     * @param X The position of the stone the person starts from (1-based index).
     */
    static void findJumps(long N, long X) {
        // Calculate the total number of stones from one end to the middle
        long numberOfStones = N / 2 + 1;

        // Calculate the steps from the starting position to the middle
        long stepsFromIndia = X / 2;

        // Calculate the steps from the middle to the far end
        long stepsFromSL = numberOfStones - stepsFromIndia - 1;

        // Print the smaller of the two steps, as it represents the minimum jumps required
        if (stepsFromIndia >= stepsFromSL) {
            System.out.println(stepsFromSL);
        } else {
            System.out.println(stepsFromIndia);
        }
    }

    /**
     * The main method to read input arguments and call the `findJumps` method.
     *
     * @param args Command-line arguments:
     *             <ul>
     *             <li>args[0]: The total number of stones (N)</li>
     *             <li>args[1]: The starting position (X)</li>
     *             </ul>
     */
    public static void main(String[] args) {
        // Parse the total number of stones and starting position from command-line arguments
        long N = Long.parseLong(args[0]);
        long X = Long.parseLong(args[1]);

        // Call the method to find the minimum jumps
        findJumps(N, X);
    }
}
