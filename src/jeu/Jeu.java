package jeu;

//La classe principale
public class Jeu {
	//Création des attributs
	private int nbJoueurs;
	private int nbDes;
//ajout des attributs supplementaires
	private Joueur joueur1;
	private Joueur joueur2;
	private De de;
	private Plateau plateau;
	private IAffichage affichage;//pour l'interface affichage
	
	//Création des constructueurss
	public Jeu() {
		affichage = new Affichage();//on crée l'affichage
		this.joueur1 = new Joueur("Jack", Couleur.ROUGE);
		this.joueur2 = new Joueur("Bill", Couleur.BLEU);
		this.de = new De();
		this.plateau = new Plateau(affichage);
		
	}
	
	//Création de la méthode lancerJeu
	public void lancerJeu() {
		//on crée notre boolen finPartie qui est fausse au debut
		boolean  finPartie=false;
		//On rentre pour teste la condition
		while(!finPartie) {
			//On deplace le joueur1
			deplacerJoueur(joueur1,joueur2);
			//On verifie la partie
			finPartie=verifierFinPartie();
			if (finPartie) {
				break;
			}
		//Pareil pour le joueur2
			deplacerJoueur(joueur2,joueur1);
			finPartie=verifierFinPartie();
			
			if (finPartie) {
				break;
			}
		}
	}
	
	//Création de la méthode deplacerJoueur()
	public void deplacerJoueur(Joueur joueur, Joueur adversaire) {
		//on lance le dé
		int resultat = de.lancerDe();
		//System.out.println(joueur.getNom() + " lance le dé et obtient :" + resultat );
		affichage.afficherLancerDe(joueur.getNom(), resultat);
		
		//On avance le joueur
		joueur.avancer(resultat);
		//System.out.println(joueur.getNom() + " est à la case : " + joueur.getPositionPlateau() );
		affichage.afficherJoueurAvancer(joueur.getNom(), joueur.getPositionPlateau());
		
		// récupérer la case du plateau
	    Case caseActuelle = plateau.getCase(joueur.getPositionPlateau());

	    // déclencher l'action de la case
	    caseActuelle.declencherAction(joueur, adversaire);
	
	}
	
	//Création de la méthode verifierFinPartie()
	public boolean verifierFinPartie() {
		//Si un des 2 joueurs remporte la victoire, la partie est terminée
		if (joueur1.getPositionPlateau()==Joueur.CASE_MAX) {
			//System.out.print(joueur1.getNom() + " remporte la victoire.");
			affichage.afficherVerifierFinPartie(joueur1.getNom());
			return true;
		}
		if (joueur2.getPositionPlateau()==Joueur.CASE_MAX) {
			//System.out.print(joueur2.getNom() + " remporte la victoire.");
			affichage.afficherVerifierFinPartie(joueur2.getNom());
			return true;
		}
	return false;
	}
}
