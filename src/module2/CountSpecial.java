package module2;

import java.util.HashMap;
import java.util.Map;

public class CountSpecial {
    static int countSpecials(int[] arr, int k) {
        int n = arr.length;
        int f = (int) (double) (n / k);
        // your code here
        int count = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> i:map.entrySet())
        {
            if (i.getValue() == f) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        countSpecials(new int[]{1,2,3,4,5,6,7,8,9,10},3);
    }
}
