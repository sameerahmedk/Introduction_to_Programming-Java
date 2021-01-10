public class AboveAverage {
    public static void main(String[] args) {
        Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 0; i<args.length; i++) {
            sum += Integer.valueOf(args[i]);
        }
        float avg = sum / args.length;

        for (int i = 0; i<args.length; i++) {
            if (Integer.valueOf(args[i]) >= avg) System.out.println(args[i]);
        }
    }
}
