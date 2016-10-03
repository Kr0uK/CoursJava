/**
 * Created by user on 03/10/2016.
 */

public class Principal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        Fraction f1  = new Fraction(1 , -2); // 3/4
        Fraction f2  = new Fraction (f1);

        Fraction f3 =  f1.additionner(f2) ;     // f1 + f2;  -f2
        f1 = f1.additionner(f2) ;


        f1 = f1.additionner();

        f1 = f1.inverserFraction();
        f1 = f1.inverserSigne();

        f1 = f1.simplifier();

        double d = f1.calculer();

        System.out.println(   f1 ); // "1 / 2"


        if (f1 == f2);
        // if ( f1.egual(f2)  );
        if(  f1.equals(f2));


        if ( f1.compareTo(f2)) ;







    }



}
