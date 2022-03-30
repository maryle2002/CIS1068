public class Fraction {
    public static final char[] setNum = null;
    private int n, d;

    public Fraction(int n, int d) {
        int gcd = gcd(n, d);
        this.n = n / gcd;
        this.d = d / gcd;
    }

    public int getNum() {
        return this.n;
    }

    public int getDenom() {
        return this.d;
    }

    public void setNum(int n) {
        int gcd = gcd(n, this.d);
        this.n = n / gcd;
    }

    public void setDenom(int d) {
        int gcd = gcd(this.n, d);
        this.d = d / gcd;
    }

    public int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    public Fraction add(Fraction a) {
        int n2 = a.getNum();
        int d2 = a.getDenom();
        Fraction f = new Fraction ((this.n * d2 + this.d * n2), this.d * d2);
        return (f);
    }

    public boolean equals(Fraction a) {
        if (this.n == a.getNum() && this.d == a.getDenom()) {
         return true;
        } else {
         return false;
        }
    }

    public String toString() {
        return String.format("%d/%d", this.n, this.d);
    }
}
 
