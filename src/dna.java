public class dna {
    public static void main(String[] args) {
        String dna = "ATAGATGCATAGCGCATAGCTAGATGTGCTGAC";
        String gene = "";
//        String gene = new StringBuilder();
        boolean t = false;
        int count = 0;
        for (int i = 0; i<dna.length() - 2; i++) {
            String d = dna.substring(i, i + 3);
            if (d.equals("ATG")) {
                
                gene = d;
                t = true;
                count = 0;
                
            }
            else if (t && count % 3==0) {
                gene += d;
                if (d.equals("TAG") || d.equals("TAA") || d.equals("TGA")) {
                    StdOut.println(gene);
                    t = false;
//                    StdOut.println(gene);
//                    StdOut.println();
                }
            }
            count++;
        }
    }
    
    
}

