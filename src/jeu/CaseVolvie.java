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
		
		affichage.afficherCaseVolvie(joueur1.getNom());
		
		affichage.afficherNombreDeVie(joueur1.getNom(), joueur1.getVie() );
		
		affichage.afficherNombreDeVie(joueur2.getNom(), joueur2.getVie() );
	}
	

}
