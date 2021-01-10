import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Double> num = new ArrayList<Double>();
        
        System.out.println("Please enter the items");
        while (!StdIn.isEmpty()) {
            num.add(StdIn.readDouble());
        }
        
        
        double meanSum = 0;
        double deviationSum = 0;
        
        
        for (int i = 0; i<num.size(); i++) {
            meanSum += num.get(i);
        }
        
        double mean = ((meanSum / num.size()));
        StdOut.println("The mean is: " + mean);
        
        
        //STANDARD DEVIATION CALCULATION
        for (int i = 0; i<num.size(); i++) {
            num.set(i, (Math.pow((num.get(i) - mean), 2)));
        }
        for (int i = 0; i<num.size(); i++) {
            deviationSum += num.get(i);
        }
        
        double variance = ((deviationSum / num.size()));
        
        double standardDeviation = Math.sqrt(variance);
        StdOut.println("The standard deviation is: " + standardDeviation);
        
    }
}


