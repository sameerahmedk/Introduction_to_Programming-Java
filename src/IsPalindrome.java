public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        int mid = s.length() / 2;
        s = String.valueOf(s.replaceAll("\\s|[^a-zA-Z0-9]", "").toLowerCase());
        String t = new StringBuilder(s).reverse().toString();
        
        return s.substring(0, mid).equals(t.substring(0, mid));
    }
    
    public static void main(String[] args) {
        String str;
        StdOut.println("Enter a string: ");
        str = StdIn.readLine();
        StdOut.println(isPalindrome(str));
        
    }
}
