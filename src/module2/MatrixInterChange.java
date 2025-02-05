package module2;

public class MatrixInterChange {
    static void interchange(int[][] a, int r, int c) {
        for (int i = 0; i < r; i++) {
            int temp = a[i][0];
            a[i][0] = a[i][c - 1];
            a[i][c - 1] = temp;
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4},
                {4, 3, 2, 1},
                {6, 7, 8, 9}};

        interchange(a, 3, 4);
    }
}
