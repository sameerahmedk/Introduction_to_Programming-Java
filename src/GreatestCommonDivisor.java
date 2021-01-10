public class GreatestCommonDivisor {
    public static int greatestCommonDivisor(int p, int q) {
        if (q==0) {
            return p;
        }
        int gcd = 0;
        if (p>q) {
            gcd = greatestCommonDivisor(q, p % q);
        }
        return gcd;
    }
    
    public static void main(String[] args) {
        int p = 20;
        int q = 15;
        
        StdOut.println(greatestCommonDivisor(p, q));
    }
}
