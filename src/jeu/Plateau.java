package jeu;

public class Plateau {

	public static final int NB_CASES = 30;
	private Case [] cases;
	private IAffichage affichage;

	public Plateau(IAffichage affichage) {
			this.affichage=affichage;
			cases = new Case[NB_CASES];

	        for (int i = 0; i < NB_CASES; i++) {

	            if (i == 2 || i == 5 || i == 8 || i == 11|| i == 14 || i == 17 || i == 20 ) {
	                cases[i] = new CaseRouletteRusse(i + 1, affichage);
	            }

	            else if (i == 3 || i == 6 || i == 9 || i == 12 || i == 15 || i == 18 || i == 21) {
	                cases[i] = new CaseVolvie(i + 1, affichage);
	            }

	            else {
	                cases[i] = new CaseNormale(i + 1, affichage);
	            }
	        }
	    }
	
	public Case getCase(int position) {
        return cases[position - 1];
    }
	
}




