package exo;

import java.util.ArrayList;
import java.util.Date;

public class Stagiaire {

	private String nom;
	private String prenom;
	private Date dateNaissance;

	private ArrayList<Note> listeDeNotes = new ArrayList<Note>();

	private ArrayList<Integer> l1 = new ArrayList<Integer>();

	public void ajouterNote(Note n) {
		listeDeNotes.add(n);
	}

	public void modifierUneNote(Note ancienne, Note nouvelle) {

		int pos = listeDeNotes.indexOf(ancienne);

		if (pos != -1)
			listeDeNotes.set(pos, nouvelle);

	}

	public Note moyenne() throws FractionDenEqualsZeroException {
		
		int somme = 0;
		
		for (Note n : listeDeNotes ) {			
			somme += n.getNum();			
		}
		
		return new Note (somme / listeDeNotes.size()  );
	}

	public ArrayList getListeDeNotes() {
		return listeDeNotes;
	}

	// public void setListeDeNotes(ArrayList listeDeNotes) {
	// listeDeNotes = listeDeNotes;
	// }

	//////////////////////////////////////////
	public void test() throws FractionDenEqualsZeroException {

		listeDeNotes.add(new Note(10));

		Note n2 = new Note(15);
		listeDeNotes.add(n2);

		Note n3 = new Note(10);

		//
		Note n = listeDeNotes.get(0);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

}
