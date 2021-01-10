public class MatrixAdd {
    public static void main(String[] args) {
        int[][] a = {{2, 5, 7, 1}, {1, 3, 6, 1}, {5, 4, 1, 3}};
        int[][] b = {{1, 9, 5, 0}, {7, 1, 5, 4}, {3, 4, 2, 8}};
        int[][] c = new int[3][4];
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<4; j++) {
                c[i][j] = a[i][j] + b[i][j];
                if (j==0) System.out.print("{");
                
                if (j<3) {
                    System.out.print(c[i][j] + ", ");
                }
                else {
                    System.out.print(c[i][j] + "}");
                }
            }
            if (i!=2) System.out.print(", ");
        }
    }
}
