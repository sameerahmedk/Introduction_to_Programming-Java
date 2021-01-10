public class Quiz3 {
    
    public static String mySubstring(String s, int i, int j) {
        int n = s.length();
        String newString = "";
        
        for (int a = i; a<j; a++) {
            newString += s.charAt(a);
        }
        return newString;
    }
    
    
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        String x = mySubstring("Uzair", a, b);
        System.out.println(x);
        
    }
}