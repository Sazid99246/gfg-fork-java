package module1;

import java.util.Scanner;

/**
 * This class prints the multiplication table for a given number.
 */
public class PrintTable {

    /**
     * The main method to take input from the user and print the multiplication table.
     *
     * @param args Command-line arguments (not used in this case).
     */
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Read the integer input (number for which the multiplication table is printed)
        int n = sc.nextInt();

        // Initialize m to 10, as we want the table up to 10
        int m = 10;

        // Print the multiplication table from n * 1 to n * 10
        while (m > 0) {
            System.out.print(n * m + " "); // Print the product of n and m
            m--; // Decrease m by 1 to move to the next multiple
        }

        // Close the scanner to prevent resource leaks
        sc.close();
    }
}
