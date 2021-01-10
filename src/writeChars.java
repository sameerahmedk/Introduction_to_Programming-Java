public class writeChars {
    public static String writeChars(int count, int n, String[] arr) {
        if (n==0) {
            return arr[n];
        }
        if (arr.length / 2<n) {
            arr[n - 1] = ">";
            arr[count] = "<";
            arr[arr.length / 2] = "*";
            if (arr.length % 2==0) {
                arr[arr.length / 2 - 1] = "*";
            }
            return writeChars(++count, n - 1, arr);
        }
        return arr[n];
    }
    
    public static void main(String[] args) {
        int n = StdIn.readInt();
        int count = 0;
        String[] arr = new String[n];
        
        writeChars(count, n, arr);
        for (String s : arr) {
            StdOut.print(s);
        }
    }
}
