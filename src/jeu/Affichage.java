package jeu;

public class Affichage implements IAffichage {
	@Override
	public void afficherLancerDe(String nom, int resultat) {
		System.out.println(nom + " lance le dé et obtient : " + resultat);
	}
	
	@Override
	public void afficherJoueurAvancer(String nom, int positionPlateau) {
		System.out.println(nom + " est à la case : " + positionPlateau);
	}
	
	@Override
	public void afficherVerifierFinPartie(String nom) {
		System.out.println(nom + " remporte la victoire.");
	}
	
	@Override
	public void afficherCaseNormale() {
		System.out.println(" Case normale : Rien ne se passe");
	}
	
	@Override
	public void afficherCaseRusse(int nouvellePosition) {
		System.out.println("Roulette russe ! Nouvelle position : " + nouvellePosition);
	}
	
	@Override
	public void afficherVolvie(String nom) {
		System.out.println("Vol de vie ! " + nom + " gagne 1 vie.");
	}
	
	@Override
	public void afficherNombreDeVie(String nom, int vie) {
		System.out.println(nom + " a maintenant " + vie + " vies.");
	}
}
