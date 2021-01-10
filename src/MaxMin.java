public class MaxMin {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int number;
    
        System.out.println("Enter number. Leave empty to end. ");
        while (!StdIn.isEmpty())
        {
            System.out.println("Enter number. Leave empty to end. ");
            number = StdIn.readInt();
            
            if (number<min) {
                min = number;
            }
            if (number>max) {
                max = number;
            }
        }
        System.out.println("Minimum number is: " + min);
        System.out.println("Maximum number is: " + max);
        
    }
}
