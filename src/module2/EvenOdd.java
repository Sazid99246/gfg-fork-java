package module2;

public class EvenOdd {
    public static void countOddEven(Integer[] arr) {
        int countOdd = 0;
        int countEven = 0;

        for (Integer num : arr) {
            if (num % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println(countOdd + " " + countEven);
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        countOddEven(arr);
    }
}
