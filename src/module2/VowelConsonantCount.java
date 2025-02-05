package module2;

public class VowelConsonantCount {
    static void checkString(String s) {
        String s2 = s;
        s2 = s2.replaceAll("\\s", "");
        int v = 0;
        int c = 0;
        char[] sArray = s2.toCharArray();
        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i] == 'a' || sArray[i] == 'e' || sArray[i] == 'i' || sArray[i] == 'o' || sArray[i] == 'u')
                v++;
            else
                c++;
        }

        if (v > c)
            System.out.print("Yes");
        else if (c > v)
            System.out.print("No");
        else
            System.out.print("Same");

        System.out.println();
    }

    public static void main(String[] args) {
        checkString("the quick brown fox jumps over the lazy dog");
        checkString("aaaaaaaaaaaaaaaaaaa");
        checkString("abab");
        checkString("a i u e o t m n s w");
    }
}
