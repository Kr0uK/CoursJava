package exo;

public interface IDAOFraction {
	
	boolean connecter(String DSN); // Singleton
	boolean fermer();
	
	long ecrire ();
	Fraction lire(long id);
	boolean supprimer(long id);
	boolean mettreAJour( long id);
	

}
