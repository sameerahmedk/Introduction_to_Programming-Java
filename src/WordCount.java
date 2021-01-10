public class WordCount {
    public static void main(String[] args) {
        String word;
        int count = 0;
        
        while (StdIn.isEmpty()){
            StdOut.println("Enter text. ");
            word = StdIn.readString();
            count++;}
        
        StdOut.println(count);
    }
}
