public class IsValid {
    public static boolean isValid(String pass) {
        int letter = 1;
        int digit = 2;
        int count = pass.length();
        for (int i = 0; i<pass.length(); i++) {
            char c = pass.charAt(i);
            
            if (!String.valueOf(c).equals(Character.isLetterOrDigit(c))) { //validation check
                if (Character.isWhitespace(c)) {
                    count--;
                } //characters count check
                else if (Character.isLetter(c)) {
                    letter--;
                } //letter
                else if (Character.isDigit(c)) {
                    digit--;
                } //digit
            }
            else {
                return false;
            }
        }
        if (letter<=0 && digit<=0 && count>=10) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        String password;
        password = StdIn.readLine();
        StdOut.println(isValid(password));
    }
    
}
