public class Transpose {
    public static void main(String[] args) {
        int[][] a = {{2, 5, 7, 1}, {1, 3, 6, 1}, {5, 4, 1, 3}};
//      output  {{2, 1, 5}, {5, 3, 4}, {7, 6, 1}, {1, 1, 3}}
        int[][] c = new int[a[0].length][a.length];
        for (int i = 0; i<a.length; i++) {
            for (int j = 0; j<a[i].length; j++) {
                c[j][i] = a[i][j];
//                System.out.println(c[j][i]);
                
            }
        }
    
        for (int i = 0; i<c.length; i++) {
            for (int j = 0; j<c[i].length; j++) {
                if (j==0) System.out.print("{");
            
                if (j<c[i].length-1) {
                    System.out.print(c[i][j] + ", ");
                }
                else {
                    System.out.print(c[i][j] + "}");
                }
            }
            if (i!=c.length-1) System.out.print(", ");
        }
    }
}
