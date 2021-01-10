import java.util.Scanner;

public class isSorted {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter array size: ");
        Double[] arr = new Double[s.nextInt()];
        for (int i = 0; i<arr.length; i++) {
            System.out.println("Enter number: ");
            arr[i] = s.nextDouble();
        }
        for (int i = 0; i<arr.length - 1; i++) {
            if (arr[i]>arr[i + 1]) {
                System.out.println(false);
                break;}
                else if (i==arr.length - 2) {
                    System.out.println(true);
                }
            }
        if (arr.length ==1) System.out.println(true);
        }
}
