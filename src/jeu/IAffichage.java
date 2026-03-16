package jeu;

public interface IAffichage {
	void afficherLancerDe(String nom, int resultat);
	void afficherJoueurAvancer(String nom, int resultat);
	void afficherVerifierFinPartie(String nom);
	void afficherCaseNormale();
	void afficherCaseRusse(int positionPlateau);
	void afficherVolvie(String nom);
	void afficherNombreDeVie(String nom, int vie);
	
}
