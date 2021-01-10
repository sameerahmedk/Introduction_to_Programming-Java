import java.util.Arrays;
import java.util.Random;

public class Birthday
{

    public static void main(String[] args) {

        Integer[] count = new Integer[365];
        Arrays.fill(count, 0);
        Random random = new Random();
        int i = 0;
        while (true)
        {
            int day = random.nextInt(count.length);
            count[day]++;
            i++;
            if (count[day]==2)
            {
                System.out.print("2 people now have birthdays on day ");
                System.out.print(day);
                System.out.print(" amongst ");
                System.out.print(i);
                System.out.print(" people.");

                return;
            }
        }
}
}



