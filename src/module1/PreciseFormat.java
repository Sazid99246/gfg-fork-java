package module1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The `PreciseFormat` class demonstrates division with precision formatting.
 * It computes the result of dividing two numbers and formats it to a specified precision.
 *
 * @author Sheikh Md. Sazidul Islam
 * @since 27/12/2024
 * @version 3.0
 * @see <a href="https://github.com/sazid99246">My Github</a>
 */
public class PreciseFormat {

    /**
     * Divides two floating-point numbers and returns the results as an ArrayList.
     * The first result is the division without any formatting.
     * The second result is formatted to three decimal places.
     *
     * @param a The dividend.
     * @param b The divisor.
     * @return An ArrayList containing two values:
     *         - The unformatted division result.
     *         - The division result formatted to three decimal places.
     */
    public static ArrayList<Float> divisionWithPrecision(float a, float b) {
        ArrayList<Float> arrayList = new ArrayList<>();

        // Perform division without formatting
        float division = a / b;
        arrayList.add(division);

        // Perform division with precision (3 decimal places)
        float division2 = (float) (Math.round(division * Math.pow(10, 3)) / Math.pow(10, 3));
        arrayList.add(division2);

        return arrayList;
    }

    /**
     * The main method reads two floating-point numbers from the user and
     * prints the results of their division (unformatted and formatted to three decimal places).
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read inputs
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        // Get the results of division
        ArrayList<Float> arrayList = divisionWithPrecision(a, b);

        // Print results
        for (Float aFloat : arrayList) {
            System.out.println(aFloat);
        }
    }
}
