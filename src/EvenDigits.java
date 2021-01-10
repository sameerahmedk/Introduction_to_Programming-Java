//public class EvenDigits {
////    public static int evenDigits(int n) {
////        if (n==0) {
////            return n;
////        }
////        int length = (int) (Math.log10(n));
////
////        char num = String.valueOf(n).charAt(length);
////        int endnum = 0;
////        if ((int) num % 2!=0) {
////            n /= 10;
////            endnum = evenDigits(n);
////        }
////        else {
////            endnum = evenDigits(n / 10);
////        }
////
////        n = n + "endnum";
////        return n;
////    }
//
//    public static void main(String[] args) {
//        int num = 8342116;
//        StdOut.println(evenDigits(num));
//
//    }
//}
