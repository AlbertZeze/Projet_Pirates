package jeu;
import java.util.Random;

public class CaseVolvie extends Case{

	//Constructeur de la case
	public CaseVolvie(int numeroCase) {
		super(numeroCase);
	}
	@Override
	public void declencherAction(Joueur joueur1, Joueur joueur2) {
		joueur1.gagnerVie(1);
		joueur2.perdreVie(1);
		System.out.println("Vol de vie ! " + joueur1.getNom() + " gagne 1 vie.");
	}
	

}
