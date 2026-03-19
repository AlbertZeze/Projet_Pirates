package jeu;
import java.util.Random;

public class De {

	private Random random; 
	private int resultatDe1;
	private int resultatDe2;
	
	public De() {
		random = new Random();
		
	}
	

	public int lancerDe() {
		int de1= random.nextInt(6) + 1;
		int de2= random.nextInt(6) + 1;
		resultatDe1=de1;
		resultatDe2=de2;
		return de1+de2;
	}
	
	public int getResultatDe1() {
		return resultatDe1;
	}
	
	public int getResultatDe2() {
		return resultatDe2;
	}
}
