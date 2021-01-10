public class Checkerboard {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        StdDraw.setXscale(-0.5, N);
        StdDraw.setYscale(-0.5, N);
        double r = 0.5;
        
        for (int y = 0; y<N; y++) {
            for (int x = 0; x<N; x++) {
                
                if (y % 2==0) {
                    if (x % 2==0) {
                        StdDraw.setPenColor(StdDraw.RED);
                    }
                    else {
                        StdDraw.setPenColor(StdDraw.BLACK);
                    }
                }
                else {
                    if (x % 2==0) {
                        StdDraw.setPenColor(StdDraw.BLACK);
                    }
                    else {
                        StdDraw.setPenColor(StdDraw.RED);
                    }
                }
                StdDraw.filledSquare(x, y, r);
            }
        }
    }
}

