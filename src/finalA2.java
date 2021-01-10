public class finalA2 {
    public static void Fib(int N) {
        int n1 = 0;
        int n2 = 1;
        int count = -1;
        while (count<N) {
            System.out.print(n1 + " ");
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            count = count + 1;
        }
    }
    
    public static void main(String args[]) {
        int N = 6;
        Fib(N);
    }
}
