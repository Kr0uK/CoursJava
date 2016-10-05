package exo;

/**
 * Created by user on 03/10/2016.
 */
public interface FractionInt {

    Fraction additionner(Fraction f);
    Fraction soustraire(Fraction f);
    Fraction multiplier(Fraction f);
    Fraction diviser(Fraction f);
    Fraction inverserFraction();
    Fraction inverserSigne();
    Fraction simplifier();
    double calculer();
    boolean compareTo(Fraction f);

}
