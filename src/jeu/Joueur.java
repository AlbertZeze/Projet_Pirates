package jeu;

public class Joueur {


private String nom;
private int vie=5;
private int positionPlateau=0;
private Couleur couleurPion;
public static final int CASE_MAX=30;



public Joueur(String nom, Couleur couleurPion) {
	this.nom=nom;
	this.couleurPion=couleurPion;
}

public void avancer(int nbCasesAvancer) {
	
	positionPlateau = positionPlateau +  nbCasesAvancer;
	if (positionPlateau > CASE_MAX) {
		int surplus=positionPlateau-CASE_MAX;
		positionPlateau=CASE_MAX-surplus;
	}
}


public String getNom() {
	return nom;
}
public int getPositionPlateau() {
	return positionPlateau;
}

public boolean estVivant() {
	if (vie <= 0) {
		return false;
	}
	else {
		return true;
	}
}


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