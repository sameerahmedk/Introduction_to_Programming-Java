public class SumCol {
    public static void main(String[] args) {
        int[][] a = {{2, 5, 7, 1}, {1, 3, 6, 1}, {5, 4, 1, 3}};
        int j = 2;
        int sum = 0;
        for (int i = 0; i<a[j].length; i++) {
            sum += a[j][i];
        }
        System.out.println(sum);
    }
}
