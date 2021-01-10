public class sumTo {
    public static double sumTo(double n, double sum) {
        if (n==0) {
            return sum;
        }
        sum += 1 / n;
        return sumTo(n - 1, sum);
    }
    
    
    public static void main(String[] args) {
        double sum = 0;
        int n;
        n = StdIn.readInt();
        sum = sumTo(n, sum);
        StdOut.println(sum);
    }
}