package exo;

public class Note extends Fraction{

	private static final int MAXNOTE = 20;


	public Note( int n) throws FractionDenEqualsZeroException{
		super(n , MAXNOTE );
		
		this.setNum(n);	
		//if (num < 0)  super.setNum(0);
		//if (num > MAXNOTE)   super.setNum(MAXNOTE);
		//
	}

	@Override
	public void setNum(int n) {
		if (n < 0)  super.setNum(0);
		if (n > MAXNOTE)   super.setNum(MAXNOTE);
		
	}
	
	@Override
	public void setDen(int d) {
		// Traitement � faire
		super.setDen( MAXNOTE );
		
	}
	
	public static int getMaxnote() {
		return MAXNOTE;
	}

	
	
	
}
