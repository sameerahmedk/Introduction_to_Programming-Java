public class LongestRun {
    public static void main(String[] args) {
        int num;
        int num0 = 0;
        int i;
        i = 0;
        int maxcounter = 0;
        int maxdigit=0;
    
        StdOut.println("Enter a number. Leave empty to end. ");
        while (!StdIn.isEmpty()) {
            StdOut.println("Enter a number. Leave empty to end. ");
            num = StdIn.readInt();
    
            if (num==num0) {
                i++;
            }
            else {
                num0 = num;
                i = 1;
            }
            
            if (maxcounter<i) {
                maxcounter = i;
                maxdigit = num0;
            }
        }
        StdOut.println("Longest run: " + maxcounter + " consecutive " + maxdigit + "s.");
    }}

