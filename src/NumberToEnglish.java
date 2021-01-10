// Sameer Ahmed Khan - 22954 - ITP Assignment 1
public class NumberToEnglish {
    public static void main(String[] args) {
        Integer.parseInt(args[0]);
        int num = Integer.parseInt(args[0]);
        String[] suffix = {"negative ", "zero ", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine ", "ten ", "eleven ", "twelve ", "thirteen ", "fourteen ", "fifteen " , "sixteen ", "seventeen " , "eighteen ", "nineteen " , "twenty ", "thirty ", "forty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninety ", "hundred ", "thousand "};
        int len = args[0].length();
        int counter = -1;
        int digit = 1;
        int i = 0;
        
//        minus sign check
        if (num<0) {
            System.out.print(suffix[0]);
            len--;
            counter++;
        }
//        zero input check
        else if (num==0) {
            System.out.print(suffix[1]);
            return;
        }
        
//    Converting to words (pointer=current digit & len=length)
        for (int pointer = len; pointer>0; pointer--)
        {
            counter++;
            digit = Integer.parseInt(args[0].substring(counter, (counter) + 1)); //get current(pointer) digit
            if (digit==0) { // digit=0 skip
                if (Integer.parseInt(args[0].substring(counter)) == 0) break; //if all remaining digits=0 then exit loop
                else if (i!=1) System.out.print("and "); i++; continue; //skip if digit=0 and add "and" only once
            }
            else if (len>2 && pointer==2) System.out.print("and "); //add 'and' if necessary
            
            // 3rd or more digit OR first digit
            if (pointer>2 || pointer==1) {
                System.out.print(suffix[digit + 1]);
            }
            else if (pointer==2) //2nd digit
            {
                digit = Integer.parseInt(args[0].substring(counter, (counter) + 2)); //get digit
                // 2nd digit output and end e.g. twelve, fifteen
                if (digit<20) {
                System.out.print(suffix[digit + 1]);
                return;}
                //2nd digit prefix e.g. twenty, thirty
                else {
                digit = Integer.parseInt(args[0].substring(counter, (counter) + 1)); //get digit
                System.out.print(suffix[digit + 19]);
            }}
            
            //add hundred/thousand
            switch (pointer) {
                case 4:
                    System.out.print(suffix[30]);
                    break;
                case 3:
                    System.out.print(suffix[29]);
                    break;
            }
        }
}}


        
        
