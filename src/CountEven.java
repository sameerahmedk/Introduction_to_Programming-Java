
public class CountEven {
    public static void main(String[] args) {
        int even = 0;
        Integer.parseInt(args[0]);
        Integer[] array = new Integer[args.length];

        for (int i = 0; i<array.length; i++) {
            array[i] = Integer.valueOf(args[i]);
            if (array[i] % 2==0) {
                even++;
            }
        }
        System.out.println(even);

    }
}
