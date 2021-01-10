public class RemoveX {
    public static String removeX(String s, int c) {
//        String str;
        if (c==s.length() + 1) {
            return s;
        }
        if (String.valueOf(s.charAt(c)).equals("x")) {
            s = removeX(s.substring(++c, s.length()), ++c);
            
        }
        
        
        return s;
    }
}
