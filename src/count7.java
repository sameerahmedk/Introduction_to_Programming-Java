public class count7 {
    public static int count7(int num, int counter) {
        
        double tenpower = Math.pow(10, counter);
        if (num % 10==7) {
            counter++;
        }
        if (num==0) {
            return counter;
        }
        counter = count7(num / 10, counter);
        return counter;
    }
    
    public static void main(String[] args) {
        int num = StdIn.readInt();
        int count = count7(num, 1);
        StdOut.println(count - 1);
    }
}
