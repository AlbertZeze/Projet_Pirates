package jeu;
import java.util.Random;

public class CaseVolvie extends Case{

	
	public CaseVolvie(int numeroCase,IAffichage affichage) {
		super(numeroCase,affichage);
	}
	@Override
	public void declencherAction(Joueur joueur1, Joueur joueur2) {
		joueur1.gagnerVie(1);
		joueur2.perdreVie(1);
		System.out.println("Vol de vie ! " + joueur1.getNom() + " gagne 1 vie.");
		System.out.println(joueur1.getNom() + " a maintenant " + joueur1.getVie() + " vies.");
		System.out.println(joueur2.getNom() + " a maintenant " + joueur2.getVie() + " vies.");
	}
	

}
