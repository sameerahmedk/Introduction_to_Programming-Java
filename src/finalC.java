public class finalC {
    public static long digitRoot(long n) {
        
        long sum = 0;
        while (n>0 || sum>9) {
            if (n==0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    
    public static void main(String args[]) {
        long n = 1238763636555555555L;
        System.out.println(digitRoot(n));
    }
}
