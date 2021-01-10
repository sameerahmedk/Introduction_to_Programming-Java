public class finalA3 {
    public static Boolean searchSorted(int[] a, int b) {
        
        for (int i = 0; i<a.length; i++) {
            if (a[i]==b) return true;
            if (a[i]>b) return false;
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int num = 3;
        System.out.println(searchSorted(arr, num));
    }
}
