public class swirlimage {
    public static void main(String[] args) {
        String file= args[0];

        Picture source = new Picture(file);
        double ci = 0.5*(source.width()-1);
        double cj = 0.5*(source.height()-1);
        Picture target= new Picture(source.width(), source.height());
        for (int col = 0; col < source.width(); col++) {
            for (int row = 0; row < source.height(); row++) {
                double dist= Math.sqrt((col-ci)*(col-ci)+(row-cj)*(row-cj));
                double r=(Math.PI/256)+dist;
                double rad= Math.toRadians(r);
                int si= Math.abs((int)((col-ci)*Math.cos(rad)-(row-cj)*Math.sin(rad )+ci));
                int sj= Math.abs((int)((col-ci)*Math.sin(rad)-(row-cj)*Math.cos(rad )+ci));
                if (si< source.width()&&sj<source.height())
                    target.set(si,sj,source.get(col,row));
            }
        }
        target.show();
    }
}
