package exo;

import java.math.BigInteger;

public class Fraction implements IFraction {
    private int num;
    private int den;

    public Fraction(int num, int den) throws FractionDenEqualsZeroException {
        super();
        this.num = num;

        if (den != 0)
            this.den = den;
        else
            throw new FractionDenEqualsZeroException("Oupsss !!! ");
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

    @Override
    public Fraction additionner(Fraction f) throws FractionDenEqualsZeroException {
        int d = this.den * f.den;
        int n = (this.num * f.den) + (this.den * f.num);
        return new Fraction(n, d);
    }


    @Override
    public Fraction soustraire(Fraction f) throws FractionDenEqualsZeroException {
        int d = this.den * f.den;
        int n = (this.num * f.den) - (this.den * f.num);
        return new Fraction(n, d);
    }

    @Override
    public Fraction multiplier(Fraction f) throws FractionDenEqualsZeroException {
        int n = this.getNum() * f.getNum();
        int d = this.getDen() * f.getDen();

        return new Fraction(n, d);
    }

    @Override
    public Fraction diviser(Fraction f) throws FractionDenEqualsZeroException {
        int n = this.getNum() * f.getDen();
        int d = this.getDen() * f.getNum();

        return new Fraction(n, d);
    }

    @Override
    public Fraction opposer() {
        this.setNum(this.getNum() * -1);
        this.setDen(this.getDen() * -1);
        return this;
    }

    @Override
    public Fraction inverser() {

        int temp = this.getNum();
        this.setNum(this.getDen());
        this.setDen(temp);
        return this;
    }

    @Override
    public int calculer() {

        return this.num / this.den;
    }

    @Override
    public Fraction simplifier() throws FractionDenEqualsZeroException {
        int diviseur = pgcd(this.num, this.den);
        this.num = num / diviseur;
        this.den = den / diviseur;
        return this;
    }

    @Override
    public int comparer(Fraction f) throws FractionDenEqualsZeroException {
        // quand c'est 1 c'est plus grand que l'autre et vice-versa quand c'est -1, 0 quand c'est identique
        if (this.egalite(f)) {
            return 0;
        }
        if (this.getDen() == f.getDen()) {
            if (this.getNum() > f.getNum())
                return 1;
            else
                return -1;
        } else {
            int d = this.den * f.den;
            int n = (this.num * f.den);
            int n2 = this.den * f.num;
            this.den = d;
            this.num = n;
            f.den = d;
            f.num = n2;
            if (this.getNum() > f.getNum())
                return 1;
            else
                return -1;
        }
    }

    @Override
    public boolean egalite(Fraction f) {

        if (this.getNum() == f.getNum() && this.getDen() == f.getDen())
            return true;
        else
            return false;


    }

    @Override
    public String afficher() {
        return this.num + " / " + this.den;
    }


    @Override
    public String toString() {
        return this.num + " / " + this.den;
    }

    @Override
    public void imprimer() {

        System.out.println(this.num + " / " + this.den);
    }

    public int pgcd(int n, int d) {
        try {

            if (n % d == 0)
                return d;
            else

                return pgcd(n, n % d); // Le machin à foutre dans la division

        } catch (StackOverflowError e) {
            e.printStackTrace();
        }

        return 0;


    }
}
