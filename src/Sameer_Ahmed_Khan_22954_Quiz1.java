public class Sameer_Ahmed_Khan_22954_Quiz1 {
    public static Integer[] rotateLeft(Integer[] arr) {
        Integer[] arr2 = new Integer[arr.length];
        
        arr2[arr2.length - 1] = arr[0];
        for (int i = 1; i<arr2.length; i++) {
            
            arr2[i - 1] = arr[i];
        }
        return arr2;
    }
    
}
//use int as its a primitive data type. Integer is an object so math operations different.
