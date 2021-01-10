public class quiz7_SameerAhmedKhan {

//    Write a recursive function that accepts an long n > 0 as argument and returns the number of odd digits in decimal
//    representation of n.
//
//    E.g,
//
//            123456789 ->  5
//            340 -> 1
//            428 -> 0
    
    public static double odd(long n) {
        if (n==0) {
            return 0;
        }
        return (n % 2) + odd(n / 10);
    }
    
    public static void main(String[] args) {
        long num = StdIn.readLong();
        StdOut.println(odd(num));
    }
}
