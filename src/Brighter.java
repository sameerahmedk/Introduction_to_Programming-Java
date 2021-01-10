import java.awt.*;

public class Brighter {
//    public static double lum(Color c) {
//        int r = c.getRed();
//        int g = c.getGreen();
//        int b = c.getBlue();
//        return (.299 * r) + (.587 * g) + (.114 * b);
//    }
    
    public static void main(String[] args) {
        Picture pic = new Picture(args[0]);
        pic.show();
        for (int x = 0; x<pic.width(); x++) {
            for (int y = 0; y<pic.height(); y++) {
                Color c = pic.get(x, y);
                pic.set(x, y, c.brighter());
                pic.save("new.jpg");
            }
        }
        pic.show();
    }
}
