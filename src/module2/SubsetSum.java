package module2;

// Java implementation of the above approach
public class SubsetSum {
    static void find(int[] arr, int length, int s) {
        for (int i = 1; i <= (Math.pow(2, length)); i++) {
            int sum = 0;
            for (int j = 0; j < length; j++)
                if (((i >> j) & 1) % 2 == 1) sum += arr[j];
            if (sum == s) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }

    public static void main(String[] args) {
        int sum = 5;
        int[] array = {-1, 2, 4, 121};
        int length = array.length;
        find(array, length, sum);
    }
}