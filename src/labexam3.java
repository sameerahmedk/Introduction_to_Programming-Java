public class labexam3 {
    public static int task3(int n) {
        if (n==0) {
            return n;
        }
        String sum;
        sum = String.valueOf((n % 10) + ((n / 10) % 10)) + task3(n / 100);
        if (Integer.valueOf(sum) % 10==0) {
            sum = String.valueOf(Integer.valueOf(sum) / 10);
        }
        return Integer.parseInt(sum);
    }
    
    public static void main(String[] args) {
        int n = 213403;
        System.out.println(task3(n));
    }
}
