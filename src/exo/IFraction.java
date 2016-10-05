package exo;

public interface IFraction {
	
	public  final double  PI  = 3.14159 ;
	
	
	Fraction additionner(Fraction f) throws FractionDenEqualsZeroException;	
	Fraction soustraire(Fraction f);
	Fraction multiplier(Fraction f);
	Fraction diviser(Fraction f);
	
	Fraction opposer();
	Fraction inverser();
	
	int calculer();
	Fraction simplifier() throws FractionDenEqualsZeroException;
	
	
	int comparer(Fraction f);  // a + b /// a.plus(b);
	boolean egalite(Fraction f);
	String afficher();
	
	void imprimer();

}
