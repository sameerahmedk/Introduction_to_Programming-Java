public class finalA_SameerAhmedKhan {
    public static void main(String[] args) {
        String word = "Winter break! Woo! Hoo!";
        System.out.println(remove(word));
    }
    
    public static String remove(String w) {
        String word = "";
        
        int first = w.indexOf(" ");
        int last = w.lastIndexOf(" ");
        
        word = w.substring(first + 1, last);
        return word;
    }
}
