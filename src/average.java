public class average {
    public static double average(Integer[] num) {
        double sum = 0;
        for (int i = 0; i<num.length; i++) {
            sum += num[i];
            
        }
//        double avg = 0;
        return sum / (num.length);
    }
    
    public static void main(String[] args) {
        Integer[] nums = {6, 2, 9, 11, 3};
        StdOut.println(average(nums));
    }
}