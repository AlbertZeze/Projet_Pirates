package jeu;

public class Joueur {
//Création des attributs

private String nom;
private int vie=5;
private int positionPlateau=0;
private Couleur couleurPion;
public static final int CASE_MAX=30;//type d'une constante


//Création des constructeurs
public Joueur(String nom, Couleur couleurPion) {
	this.nom=nom;
	this.couleurPion=couleurPion;
}

//Création des méthodes avancer() et estVivant()
//Méthode avancer
public void avancer(int nbCasesAvancer) {
	//on avance si on a pas depassé la position maximale qui est 30.
	positionPlateau = positionPlateau +  nbCasesAvancer;
	if (positionPlateau > CASE_MAX) {
		int surplus=positionPlateau-CASE_MAX;
		positionPlateau=CASE_MAX-surplus;
	}
}

//les getteurs nom et positionPlateau
public String getNom() {
	return nom;
}
public int getPositionPlateau() {
	return positionPlateau;
}

//Méthode avancer
public boolean estVivant() {
	if (vie <= 0) {
		return false;
	}
	else {
		return true;
	}
}

//Méthode gagnerVie
public void gagnerVie(int nbVie) {
	vie = vie + nbVie;
}

public void perdreVie(int nbVie) {
	vie = vie - nbVie;
}
public int getVie() {
	return vie;
}
}