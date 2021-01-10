import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static java.lang.System.out;

public class collapseSpace {
    public static void collapseSpaces(Scanner a) {
        while (a.hasNextLine()) {
            String newline = a.nextLine();
            Scanner sc = new Scanner(newline);
            String s = "";
            while (sc.hasNext()) {
                s = s + " " + sc.next();
            }
            out.println(s);
        }
        a.close();
        out.close();
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\SAK\\OneDrive - Institute of Business Administration\\IdeaProjects\\ITP\\src\\collapseSpace.txt"));
        collapseSpaces(sc);
        
    }
}
