package jeu;

public class Plateau {
//Création des attributs
	public static final int NB_CASES = 30;
	private Case [] cases;

//Création des constructueurs
	public Plateau() {
		 cases = new Case[NB_CASES];

	        for (int i = 0; i < NB_CASES; i++) {

	            if (i == 5 || i == 15 || i == 25) {
	                cases[i] = new CaseRouletteRusse(i + 1);
	            }

	            else if (i == 10 || i == 20) {
	                cases[i] = new CaseVolvie(i + 1);
	            }

	            else {
	                cases[i] = new CaseNormale(i + 1);
	            }
	        }
	    }
	
	public Case getCase(int position) {
        return cases[position - 1];
    }
	
}




