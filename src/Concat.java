import java.util.Arrays;

import static java.lang.System.*;

public class Concat {
    public static int[] concat(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        arraycopy(a, 0, c, 0, a.length);
        arraycopy(b, 0, c, a.length, b.length);
        return c;
    }
    
    public static void main(String[] args) {
        int[] a = {8, 6, 2, 43};
        int[] b = {4, 5, 6, 78, 8};
        int[] c = concat(a, b);
        Arrays.stream(c).forEach(StdOut::println);
    }
}
