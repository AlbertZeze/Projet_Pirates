package jeu;

public class Affichage implements IAffichage {
	@Override
	
	public void afficherLancerDe(String nom, int resultat) {
		System.out.println(nom + "lance le dé et obtient : " + resultat);
	}
	
	public void afficherJoueurAvancer(String nom, int positionPlateau) {
		System.out.println(nom + " est à la case : " + positionPlateau);
	}
	
	public void afficherVerifierFinPartie(String nom) {
		System.out.print(nom + " remporte la victoire.");
	}
	
	public void afficherCaseNormale() {
		System.out.println(" Case normale : Rien ne se passe");
	}
	
	public void afficherCaseRusse(int positionPlateau) {
		System.out.println("Roulette russe ! Nouvelle position : " + positionPlateau);
	}
	
	public void afficherVolvie(String nom) {
		System.out.println("Vol de vie ! " + nom + " gagne 1 vie.");
	}
	
	public void afficherNombreDeVie(String nom, int vie) {
		System.out.println(nom + " a maintenant " + vie + " vies.");
	}
}
