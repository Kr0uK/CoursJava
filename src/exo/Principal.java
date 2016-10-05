package exo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws FractionDenEqualsZeroException {

		
		Scanner sc  = new Scanner(System.in);

		
		
		
		try {
			Fraction f2 = new Fraction(1,4);
			Fraction f3 = new Fraction(1,2);


			System.out.println("Kappa " + f2.comparer(f3));
		} catch (FractionDenEqualsZeroException e1) {
			e1.printStackTrace();
		}
		
		
		
		Fraction f1 = null;
		try {
			f1 = new Fraction(1, 0);
			System.out.println(f1.calculer());

		} catch (

		ArithmeticException | FractionDenEqualsZeroException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}

		
		
		
		
		
		
		
		FileInputStream fis = null;
		try {
			System.out.println(f1.calculer());
			fis = new FileInputStream("azerty");
			fis.close();
			
			System.out.println("Fin du try ! ");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Exception E");
		}
		//

		System.out.println("Suite ...");


		Note n1 = new Note(10);
		n1.setNum(-10000);

		n1.setDen(5000);

		Stagiaire s1 = new Stagiaire();
		s1.getListeDeNotes();

		Note n2 = new Note(0);
		Note n3 = new Note(10);
		Note n4 = new Note(15);

		s1.ajouterNote(n1);
		s1.ajouterNote(n2);
		s1.ajouterNote(n3);
		s1.ajouterNote(n4);

		// System.out.println( s1.getListeDeNotes() );

		s1.modifierUneNote(n2, n4);
	}

}
