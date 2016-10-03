
public class Fraction implements FractionInt {

    private int num;
    private int den;
    private char symbole = '/';

    public char getSymbole() {
        return symbole;
    }

    public void setSymbole(char symbole) {
        this.symbole = symbole;
    }

    public Fraction(int i, int j) {
        // TODO Auto-generated constructor stub
        this.num = i;

        if (j == 0) {
            j = 1;
            System.exit(0);
        }
        this.den = j;
    }

    public Fraction(Fraction f) {
        // TODO Auto-generated constructor stub
        this.num = f.num;
        this.den = f.getDen();

    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }


    public Fraction additionner(Fraction f) {
        return 

    }

    public Fraction multiplier(Fraction f) {
        return
    }

    public Fraction soustraire(Fraction f) {
        return
    }

    public Fraction inverserFraction() {
        return
    }

    public Fraction inverserSigne() {
        return
    }

    public Fraction simplifier() {
        return
    }

    public double calculer() {
        return
    }

    public boolean compareTo(Fraction f2) {
        return
    }
}

