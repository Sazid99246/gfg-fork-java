package module1;

import java.util.Scanner;

/**
 * This class demonstrates taking multiple types of input (int, float, long, byte, and String)
 * from the user using the Scanner class and prints them to the console.
 *
 * @author Sheikh Md. Sazidul Islam
 * @since 27/12/2024
 * @version 3.0
 * @see <a href="https://github.com/sazid99246">My Github</a>
 */
public class Input {

    /**
     * The main method that reads different types of inputs from the user and prints them.
     * It demonstrates the usage of Scanner to read various data types such as int, float, long, byte, and String.
     *
     * @param args Command line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextFloat();
        long c = sc.nextLong();
        byte d = sc.nextByte();
        sc.nextLine();
        String e = sc.nextLine();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
