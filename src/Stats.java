public class Stats {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Integer[] numbers = new Integer[n];
        int sum = 0;
        
//        total and mean
        for (int i = 0; i<n; i++) {
            StdOut.println("Enter a number: ");
            numbers[i] = StdIn.readInt();
            sum += numbers[i];
        }
        double mean = sum / n;
        StdOut.println("The mean is " + mean);
        
//        variance then standard deviation
        for (int i = 0; i<n; i++) {
            sum += Math.pow(numbers[i] - mean, 2);
        }
        mean = sum / numbers.length;
        
        double deviation = Math.sqrt(mean);
        StdOut.println("The standard deviation is " + deviation);
    }
}
