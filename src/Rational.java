import static java.lang.System.*;

public class Rational {
    private int p, q;
    
    public static int gcdc(int a, int b) {
        int gcd = 1; // Initial gcd is 1
        int k = 2; // Possible gcd
        while (k<=a && k<=b) {
            if (a % k==0 && b % k==0) {
                gcd = k; // Update gcd
            }
            k++;
        }
        return gcd;
        
    } // find greatest common divisor
    
    public Rational(int x, int y) {
        int gcd = gcdc(x, y);
        p = x / gcd;
        q = y / gcd;
    }
    
    public double abs() {
        return (double) p / q;
    } // return p/q as double value
    
    public Rational negate() {
        int numerator = (-1 * this.p);
        return new Rational(numerator, this.q);
    } // negate a rational number and return as new a Rational object
    
    public Rational plus(Rational b) {
        int n = (this.p * b.q) + (b.p * this.q);
        int d = this.q * b.q;
        return new Rational(n, d);
    } // add this and b and return as a new rational number
    
    public Rational plusEq(Rational b) {
        this.p = (this.p * b.q) + (b.p * this.q);
        this.q = this.q * b.q;
        return this;
    } // compute this += b and return this
    
    public Rational multiply(Rational b) {
        int n = (this.p * b.p);
        int d = (this.q * b.q);
        return new Rational(n, d);
    }
    
    public Rational multiplyEq(Rational b) {
        this.p = (this.p * b.p);
        this.q = (this.q * b.q);
        return this;
    }
    
    public String toString() {
        return String.format(String.format("%s/%s", p, q));
    } // convert this rational number to String
    
    public static void main(String[] args) {
        Rational a = new Rational(2, 4);
        Rational b = new Rational(3, 5);
        Rational c = new Rational(1, 2);
        out.println(a);
        out.println(a.abs());
        out.println(a.plus(c));
        out.println(a.multiply(c));
        out.println(a.negate());
        b.multiplyEq(b);
        out.println(b);
        c.plusEq(b);
        out.println(c);
    }
}
