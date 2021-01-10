public class maxSpan {
    public static int maxSpan(Integer[] arr1) {
        if (arr1.length==1) {
            return 1;
        }
        else {
            return arr1.length - 1;
        }
    }
    
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 6};
        StdOut.println(maxSpan(arr1));
    }
}

