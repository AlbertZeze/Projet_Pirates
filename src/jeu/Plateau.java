package jeu;

public class Plateau {
//Création des attributs
	private int nbCases=30;
	private Case [] cases;

//Création des constructueurs
	public Plateau() {
		 cases = new Case[nbCases];

	        for (int i = 0; i < nbCases; i++) {

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




