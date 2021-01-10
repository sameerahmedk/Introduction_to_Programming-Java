//Sameer Ahmed Khan - 22954 - ITP Assignment 1
import java.util.Scanner;

public class QueensChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length: ");
        int n = scan.nextInt(); //5
        Integer[] q = new Integer[n]; //{ 4, 1, 3, 0, 2 }
        for (int i = 0; i<n; i++) {
            System.out.println("Enter queen at " + i);
            q[i] = scan.nextInt();
        }
        
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                if (i==j) continue;
                if (q[i].equals(q[j]) || (q[i] - q[j]==(j - i)) || (q[j] - q[i]==j - i)) {
                    System.out.println("Illegal placement");
                    return;
                }
                
            }
    
        }
        System.out.println("Legal placement");
    }
}
        
