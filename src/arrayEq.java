public class arrayEq {
    public static boolean arrayEq(Integer[] arr1, Integer[] arr2) {
        if (arr1.length==arr2.length) {
            for (int i = 0; i<arr1.length; i++) {
                if (arr1[i]!=arr2[i]) {
                    return false;
                }
            }
        }
        else {
            return false;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 5};
        Integer[] arr2 = {1, 2, 3, 4, 5};
        StdOut.print(arrayEq(arr1, arr2));
    }
}
