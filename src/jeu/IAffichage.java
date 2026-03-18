package jeu;

public interface IAffichage {
	void afficherLancerDe(String nom, int resultat);
	void afficherJoueurAvancer(String nom, int positionPlateau);
	void afficherVerifierFinPartie(String nom);
	void afficherCaseNormale();
	void afficherCaseRusse(int nouvellePosition);
	void afficherVolvie(String nom);
	void afficherNombreDeVie(String nom, int vie);
	
}
