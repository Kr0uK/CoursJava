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

        //exo.Fraction ff = new exo.Fraction(n ,d );

        return new Fraction(n, d);

    }


    @Override
    public Fraction soustraire(Fraction f) {
        return null;
    }

    @Override
    public Fraction multiplier(Fraction f) {

        return null;
    }

    @Override
    public Fraction diviser(Fraction f) {

        return null;
    }

    @Override
    public Fraction opposer() {

        return null;
    }

    @Override
    public Fraction inverser() {

        return null;
    }

    @Override
    public int calculer() {

        return this.num / this.den;
    }

    @Override
    public Fraction simplifier() throws FractionDenEqualsZeroException {
        int diviseur = pgcd(this.num, this.den);
        this.num = num/diviseur;
        this.den =  den/diviseur;




        return  this;
    }

    @Override
    public int comparer(Fraction f) {

        return 0;
    }

    @Override
    public boolean egalite(Fraction f) {

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

        }
        catch (StackOverflowError e)
        {
            e.printStackTrace();
        }

return 0;


}}
