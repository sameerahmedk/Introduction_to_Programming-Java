import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int R = Integer.parseInt(args[1]);
        Random rand = new Random();
    
        for (int i = 0; i<N; i++) {
            StdOut.println(rand.nextInt(R + 1));
        }
    }
}
