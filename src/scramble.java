public class scramble {
    
    public static void exchange(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    public static int uniform(int n) {
        return (int) (Math.random() * n);
    }
    
    public static void shuffle(char[] a) {
        int n = a.length;
        for (int i = 0; i<n; i++) {
            int r = i + uniform(n - i);
            exchange(a, i, r);
        }
    }
    
    
    public static void show(char[] a) {
        for (int i = 0; i<a.length; i++) {
            StdOut.print(a[i]);
        }
    }
    
    public static void main(String[] args) {
        String s = "sameer";
        char[] a = new char[s.length()];
        for (int i = 0; i<s.length(); i++) {
            a[i] = s.charAt(i);
        }
        shuffle(a);
        show(a);
        
    }
}


