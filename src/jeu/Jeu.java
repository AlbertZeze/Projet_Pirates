package jeu;
import java.util.Scanner;

public class Jeu {
	
	private int nbJoueurs;
	private int nbDes;

	private Joueur joueur1;
	private Joueur joueur2;
	private De de;
	private Plateau plateau;
	private IAffichage affichage;
	
	
	public Jeu() {
		affichage = new Affichage();
		this.joueur1 = new Joueur("Jack", Couleur.ROUGE);
		this.joueur2 = new Joueur("Bill", Couleur.BLEU);
		this.de = new De();
		this.plateau = new Plateau(affichage);
		
	}
	
	
	public void lancerJeu() {
		
		boolean  finPartie=false;
		Scanner scanner = new Scanner(System.in);
		
		while(!finPartie) {
			
			deplacerJoueur(joueur1,joueur2);
			
			finPartie=verifierFinPartie();
			if (finPartie) {
				break;
			}
			affichage.afficherPause();
			scanner.nextLine();
			
			deplacerJoueur(joueur2,joueur1);
			finPartie=verifierFinPartie();
			
			if (finPartie) {
				break;
			}
			affichage.afficherPause();
			scanner.nextLine();
		}
	}
	
	
	public void deplacerJoueur(Joueur joueur, Joueur adversaire) {
		
		int resultat = de.lancerDe();
		
		affichage.afficherLancerDe(joueur.getNom(), de.getResultatDe1(), de.getResultatDe2(), resultat);
		
		
		joueur.avancer(resultat);
		
		affichage.afficherJoueurAvancer(joueur.getNom(), joueur.getPositionPlateau());
		
		
        affichage.afficherNombreDeVie(joueur1.getNom(), joueur1.getVie());
        affichage.afficherNombreDeVie(joueur2.getNom(), joueur2.getVie());
        
       
        if (joueur.getPositionPlateau() == Joueur.CASE_MAX) {
            return;
        }
        
		
	    Case caseActuelle = plateau.getCase(joueur.getPositionPlateau());

	    
	    caseActuelle.declencherAction(joueur, adversaire);
	
	}
	
	
	public boolean verifierFinPartie() {
		
		if (joueur1.getPositionPlateau()==Joueur.CASE_MAX) {
			
			affichage.afficherVerifierFinPartie(joueur1.getNom());
			return true;
		}
		if (joueur2.getPositionPlateau()==Joueur.CASE_MAX) {
			
			affichage.afficherVerifierFinPartie(joueur2.getNom());
			return true;
		}
		
		if (!joueur1.estVivant()) {
            affichage.afficherVerifierFinPartie(joueur2.getNom());
            return true;
        }
        
        if (!joueur2.estVivant()) {
            affichage.afficherVerifierFinPartie(joueur1.getNom());
            return true;
        }
		
	return false;
	}
}
