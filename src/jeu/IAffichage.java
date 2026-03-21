package jeu;

public interface IAffichage {
	void afficherLancerDe(String nom, int de1, int de2, int resultat);
	void afficherJoueurAvancer(String nom, int positionPlateau);
	void afficherVerifierFinPartie(String nom);
	void afficherCaseNormale();
	void afficherCaseRusse(int nouvellePosition);
	void afficherCaseVolvie(String nom);
	void afficherNombreDeVie(String nom, int vie);
	void afficherPause();
}
