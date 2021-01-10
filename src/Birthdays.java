import java.util.Arrays;
import java.util.Random;

public class Birthdays
{
    public static void main(String[] args)
    {
        int totaldays = 0;
        int totalpeople = 0;
        Integer[]count = new Integer[365];
        Arrays.fill(count, 0);
        Random random = new Random();
        int i = 0;
        for (int j = 0; j<10; j++) {
            while (true) {
                int day = random.nextInt(count.length);
                count[day]++;
                i++;
                if (count[day]==2) {
                    totaldays += day;
                    totalpeople += i;
                    break;
                }
            }
        }
        System.out.println("Average twin birthdate is: " + totaldays / 10);
        System.out.println("Average people when birthday twin entered are: " + totalpeople / 10);
    }
}