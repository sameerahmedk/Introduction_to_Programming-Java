import java.util.Scanner;

public class tutorial {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("enter a num");
        Integer b = a.nextInt();

        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i<array.length; i++) {
            if (array[i]==b) {
                System.out.println("The number " + b + " exists in the array at: " + i);
            }
        }


    }
}
