package module2;

public class FindSingleNumber {
    static int findSingleNumber(int[] nums, int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res ^= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int ar[] = {2, 3, 5, 4, 5, 3, 4};
        int n = ar.length;
        System.out.println("Element occurring once is " + findSingleNumber(ar, n) + " ");
    }
}
