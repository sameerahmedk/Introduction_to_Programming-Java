public class quiz4_SameerAhmedKhan {
    
    public static int SumDigits(int n) {
        int sum = 0;
        while (n!=0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int n = 29107;
        System.out.println(SumDigits(n));
    }
    
}
