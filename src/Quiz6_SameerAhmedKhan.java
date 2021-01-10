public class Quiz6_SameerAhmedKhan {
    public static boolean isSubSeqOf(int[] a1, int[] a2) {
        boolean seq = false;
        for (int i = 0; i<a2.length; i++) {
            int count = 0;
            if (a1[count]==a2[i]) {
                for (int j = i; j<a1.length + i; j++) {
                    if (a1[count]==a2[j]) {
                        seq = true;
                        count++;
                        if (count==a1.length) {
                            return true;
                        }
                    }
                    else {
                        seq = false;
                        break;
                    }
                }
            }
        }
        return seq;
    }
    
    public static void main(String[] args) {
        int[] l1 = {5, 2, 3};
        int[] l2 = {4, 2, 3, 8, 5, 2, 1, 5, 2, 3};
        
        StdOut.println(isSubSeqOf(l1, l2));
    }
}
