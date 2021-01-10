public class consecutive {
    public static boolean Consec(int[] n) {
        for (int i = 0; i<n.length - 1; i++) {
            if (n[i] + 1==n[i + 1]) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] num = {0, 1, 6, 3, 3};
        System.out.println(Consec(num));
    }
}
