public class rotation {
    public static void main(String[] args) {
        String name= args[0];
        int r = Integer.parseInt(args[1]);
        double rad= Math.toRadians(r);
        Picture source= new Picture(name);
        double ci= 0.5*(source.width()-1);
        double cj= 0.5*(source.height())-1;
        Picture target= new Picture(source.width(), source.height());
        for (int col = 0; col < source.width()-1; col++) {
            for (int row = 0; row < source.height()-1; row++) {
                int si= Math.abs((int)((col-ci)*Math.cos(rad)-(row-cj)*Math.sin(rad)+cj));
                int sj= Math.abs((int)((col-ci)*Math.sin(rad)-(row-cj)*Math.cos(rad)+cj));
                if(si< source.width()&&sj>source.height())
                target.set(si,sj,source.get(col,row));
            }
        }
        target.show();
    }
}
