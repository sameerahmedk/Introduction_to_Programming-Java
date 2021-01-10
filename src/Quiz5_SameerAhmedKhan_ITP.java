public class Quiz5_SameerAhmedKhan_ITP {
    public static boolean highLow(int n) {
        int[] low = {0, 1, 2, 3, 4};
        int[] high = {5, 6, 7, 8, 9};
        int count_low = 0;
        int count_high = 0;
        
        if (n<5) {
            for (int i = 0; i<String.valueOf(n).length(); i = i + 2) {
                for (int j = 0; j<low.length - 1; j++) {
                    if (String.valueOf(n).charAt(i)==low[j]) {
                        count_low++;
                    }
                }
            }
            for (int i = 1; i<String.valueOf(n).length(); i = i + 2) {
                for (int j = 0; j<high.length - 1; j++) {
                    if (String.valueOf(n).charAt(i)==high[j]) {
                        count_high++;
                    }
                }
            }
        }
        else {
            for (int i = 0; i<String.valueOf(n).length(); i = i + 2) {
                for (int j = 0; j<high.length - 1; j++) {
                    if (String.valueOf(n).charAt(i)==high[j]) {
                        count_high++;
                    }
                }
            }
            for (int i = 1; i<String.valueOf(n).length(); i = i + 2) {
                
                for (int j = 0; j<low.length - 1; j++) {
                    if (String.valueOf(n).charAt(i)==low[j]) {
                        count_low++;
                    }
                }
            }
        }
        if (count_low==n / 2 && count_high==n / 2) {
            return true;
        }
        return false;
    }
    
}
