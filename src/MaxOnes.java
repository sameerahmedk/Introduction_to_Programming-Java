import java.util.Scanner;

public class MaxOnes {
    public static void main(String[] args) {
        int count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of integers: ");
        Integer[] arr = new Integer[scan.nextInt()];
        for (int i = 0; i<arr.length; i++) {
            System.out.print("Enter an integer: ");
            arr[i] = scan.nextInt();
            if (arr[i]==1) {
                count++;
            }
        }

        System.out.println("The number of 1s is/are: " + count);
            }
}

