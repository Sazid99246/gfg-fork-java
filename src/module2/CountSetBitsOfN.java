package module2;

public class CountSetBitsOfN {
    static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    static int countSetBitsAll(int nums) {
        int count = 0;
        for (int i = 1; i <= nums; i++) {
            count += countSetBits(i);
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.print("Total set bit count is ");
        System.out.print(countSetBitsAll(n));
    }
}
