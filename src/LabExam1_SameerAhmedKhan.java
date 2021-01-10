public class LabExam1_SameerAhmedKhan {
    public static int task1(int[] n) {
        int[] counter = new int[n.length];
        int num = -1;
        for (int i = 0; i<n.length; i++) {
            num = n[i];
            for (int j = i; j<n.length - i; j++) {
                if (n[i]==n[j]) {
                    counter[i]++;
                }
            }
            if (counter[i]<2) {
                return n[i];
            }
        }
        return num;
    }
    
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 1, 3, 4};
        System.out.println(task1(n));
    }
}