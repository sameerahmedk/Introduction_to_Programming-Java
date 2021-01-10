import java.awt.*;
import java.util.Random;

public class Circles {
    public static void main(String[] args) {
//        the number of circles, the probability that each circle is black, the minimum radius, and the maximum radius.
        int num = Integer.parseInt(args[0]);
        double prob = Double.parseDouble(args[1]);
        double minrad = Double.parseDouble(args[2]);
        double maxrad = Double.parseDouble(args[3]);
        Random random = new Random();
//        StdDraw.setCanvasSize(1, 1);
        
        for (int i = 0; i<num; i++) {
            
            double radius = minrad + random.nextDouble() * (maxrad - minrad);
            double x = random.nextDouble();
            double y = random.nextDouble();
    
            if (random.nextDouble()>prob) {
                StdDraw.setPenColor(Color.white);
            }
            else {
                StdDraw.setPenColor(Color.black);
            }
            
            StdDraw.filledCircle(x, y, radius);
            
        }
        
    }
}

